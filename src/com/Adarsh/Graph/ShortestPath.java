package com.Adarsh.Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class ShortestPath {
	static final int INF=Integer.MAX_VALUE;
	LinkedList[] adj;
	private int V;
	public ShortestPath(int v ) 
	{
		V=v;
		adj=new LinkedList[V];
		for(int i=0; i < V ; i++) {
			adj[i]=new LinkedList();
		}
		
	}
	
	public void addEdge(int u, int v , int w) 
	{
		AdjList li=new AdjList(v,w);
		adj[u].add(li);
	}
	public void fetchWeight(int u , int v) {
		AdjList ad=null;
		ListIterator li = adj[u].listIterator();
		while(li.hasNext()) 
		{
			
		    ad=(AdjList) li.next();
		    
		    
		    
		}
		System.out.println(ad.getWeight());
	}
	// A recursive function used by shortestPath. 
    // See below link for details 
    void topologicalSortUtil(int v, Boolean visited[], Stack stack) 
    { 
        // Mark the current node as visited. 
        visited[v] = true; 
        Integer i; 

        // Recur for all the vertices adjacent to this vertex 
        Iterator<AdjList> it = adj[v].iterator(); 
        while (it.hasNext()) 
        { 
            AdjList node =it.next(); 
            if (!visited[node.getV()]) 
                topologicalSortUtil(node.getV(), visited, stack); 
        } 
        // Push current vertex to stack which stores result 
        stack.push(new Integer(v)); 
    } 

    // The function to find shortest paths from given vertex. It 
    // uses recursive topologicalSortUtil() to get topological 
    // sorting of given graph. 
    void shortestPath(int s) 
    { 
        Stack stack = new Stack(); 
        int dist[] = new int[V]; 

        // Mark all the vertices as not visited 
        Boolean visited[] = new Boolean[V]; 
        for (int i = 0; i < V; i++) 
            visited[i] = false; 

        // Call the recursive helper function to store Topological 
        // Sort starting from all vertices one by one 
        for (int i = 0; i < V; i++) 
            if (visited[i] == false) 
                topologicalSortUtil(i, visited, stack); 

        // Initialize distances to all vertices as infinite and 
        // distance to source as 0 
        for (int i = 0; i < V; i++) 
            dist[i] = INF; 
        dist[s] = 0; 

        // Process vertices in topological order 
        while (stack.empty() == false) 
        { 
            // Get the next vertex from topological order 
            int u = (int)stack.pop(); 

            // Update distances of all adjacent vertices 
            Iterator<AdjList> it; 
            if (dist[u] != INF) 
            { 
                it = adj[u].iterator(); 
                while (it.hasNext()) 
                { 
                    AdjList i= it.next(); 
                    if (dist[i.getV()] > dist[u] + i.getWeight()) 
                        dist[i.getV()] = dist[u] + i.getWeight(); 
                } 
            } 
        } 

        // Print the calculated shortest distances 
        for (int i = 0; i < V; i++) 
        { 
            if (dist[i] == INF) 
                System.out.print( "INF "); 
            else
                System.out.print( dist[i] + " "); 
        } 
    } 


// Method to create a new graph instance through an object 
// of ShortestPath class. 

	
	
	public static void main(String[] args)
	{
	   ShortestPath sp=new ShortestPath(9);
	   sp.addEdge(1	,2, 3);
	   sp.addEdge(1, 3, 6);
	   sp.addEdge(2, 4, 4);
	   sp.addEdge(3, 4, 8);
	   sp.addEdge(2, 5, 11);
	   sp.addEdge(2, 3, 4);
	   sp.addEdge(4, 5, -4);
	   sp.addEdge(4, 6, 5);
	   sp.addEdge(4, 7, 2);
	   sp.addEdge(5, 8, 9);
	   sp.addEdge(6, 8, 1);
	   sp.addEdge(7, 8, 2);
	   
	   sp.shortestPath(1);
	   
	}
	


}
