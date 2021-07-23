package com.Adarsh.Graph;

public class AdjList {
  int node;
  int weight;
	public AdjList(int node , int weight) {
		this.node=node;
		this.weight=weight;
	}
	
	public int getV() {
		return node;
	}
	public int getWeight() {
		return weight;
	}
}
