package com.Adarsh.Graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class TopologicalSorting {

	private int V;
	private LinkedList adj[];
	public TopologicalSorting(int v) {
		V = v;
		adj=new LinkedList[V];
		for(int i=0; i < V;i++) {
			adj[i]=new LinkedList();
		}
	}
	
	private void addEdge(int i, int j) {
		adj[i].add(j);
	}
	private void DFS(int start ,boolean[] Visited) {
		Visited[start]=true;
		ListIterator it=adj[start].listIterator();
		
		while(it.hasNext()) 
		{
			int a=(int) it.next();
			if(!Visited[a])
			{
				DFS(a,Visited);
			}
		}
		System.out.println(start);
	}
	private void topo(int start) {
		boolean[] Visited = new boolean[V];
		DFS(start, Visited);
		
	}
	

	public static void main(String[] args) {
		TopologicalSorting sorting=new TopologicalSorting(7);
		sorting.addEdge(2, 3);
		sorting.addEdge(3, 4);
		sorting.addEdge(3, 6);
		sorting.addEdge(4, 6);
		sorting.addEdge(4, 5);
		
        sorting.topo(3);
	}

}
