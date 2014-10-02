package cut_the_tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;


public class Solution {
	
	public static LinkedList<Vertex> discovered;
	
	public static void main(String[] args) {
		discovered = new LinkedList<Vertex>();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			int N = Integer.parseInt(br.readLine().trim());
			ArrayList<Vertex> adjList = new ArrayList<Vertex>();

			int totalWeight = 0;
			String[] weights = br.readLine().split(" ");

			for (int i = 0; i < N; i++) {
				adjList.add(new Vertex(Integer.parseInt(weights[i]), i + 1));
				totalWeight += Integer.parseInt(weights[i]);
			}

			for (int i = 0; i < N-1; i++) {
				String[] pairs = br.readLine().split(" ");
				int start = Integer.parseInt(pairs[0]), end = Integer.parseInt(pairs[1]); 
				adjList.get(start-1).edgeList.add(adjList.get(end-1));
				adjList.get(end-1).edgeList.add(adjList.get(start-1));
			}
			
			br.close();
			
			btmUpSum(adjList.get(0)); //btmUp from root
			
			int smallest = Integer.MAX_VALUE;
			for (int i = 0; i<N; i++) {
				int bSum = Math.abs(totalWeight - adjList.get(i).btmUpWeight);
				int cuttingEdge = Math.abs(adjList.get(i).btmUpWeight - bSum);
				if(smallest > cuttingEdge) smallest = cuttingEdge;
			}
			
			System.out.println(smallest);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int btmUpSum(Vertex v){
		discovered.add(v);
		int btmUpWeight = v.weight;
		for(Vertex edge : v.edgeList){
			if(!discovered.contains(edge)){
				btmUpWeight += btmUpSum(edge);
			}
		}
		v.btmUpWeight = btmUpWeight;
		
		return btmUpWeight;
	}

	static class Vertex {
		public int vertexNum;
		public int weight;
		public int btmUpWeight;
		public ArrayList<Vertex> edgeList;

		public Vertex(int weight, int vertexNum) {
			this.weight = weight;
			this.vertexNum = vertexNum;
			this.edgeList = new ArrayList<Vertex>();
		}
	}
}
