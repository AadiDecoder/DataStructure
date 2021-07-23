package com.Adarsh.Graph;

import java.util.*;
 
// This class represents a directed graph using adjacency list
// representation
class Graph
{
	
	static LinkedList<Integer> adj[];
    int V;
     
	public Graph(int s) 
	{
	    this.V = s;
		adj=new LinkedList[V];
		for(int i=0; i<V; i++) 
		{
		   adj[i]=new LinkedList();
		}
	}
	private void addEdge(int i , int j) {
		adj[i].add(j);
	}
	
	private void BFS(int start) 
	{
		boolean Visited[]=new boolean[V];
		LinkedList queue=new LinkedList();
		Visited[start]=true;
		queue.add(start);
		while(queue.size()!=0) {
			
			 start=(int) queue.poll();
			 System.out.print(start+" ");
			 ListIterator li=adj[start].listIterator();
			 while(li.hasNext()) {
				 
				 int vis=(int) li.next();
				// System.out.println("BFS => "+vis);
				 if(!Visited[vis]) 
				 {
				 Visited[vis]=true;
				 queue.add(vis);
				 }
				 
			 }
			
		}
	}
	
	private void DFS(int element) 
	{
		boolean Visited[]=new boolean[V];
		DFSUtil(element , Visited);
	}
	
	private void DFSUtil(int start ,boolean Visited[]) 
	{
	
		
		Visited[start]=true;
		System.out.print(start+" ");
		
		ListIterator it=adj[start].listIterator();   //2
		while(it.hasNext()) {
			int element=(int) it.next();
			if(!Visited[element])
			DFSUtil(element , Visited);
		}
	}
		
	
//    // Driver method to
    public static void main(String args[])
    {
        Graph g = new Graph(4);
// 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
//        for(int i=0; i <adj.length; i++) {
//        	ListIterator it=adj[i].listIterator();
//        	while(it.hasNext()) {
//        		System.out.println(it.next());
//        	}
//        }
// 
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
        System.out.println();
        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");
        
        g.DFS(2);

        
        
    	
//    	LinkedList<Integer> list=new LinkedList<Integer>();
//    	list.add(1);
//    	list.add(2);
//    	list.add(3);
//    	
//    	ListIterator<Integer> it=list.listIterator();
//    	while(it.hasNext()) {
//    		int i=it.next();
//    		System.out.println(i);
//    	}
    }
}