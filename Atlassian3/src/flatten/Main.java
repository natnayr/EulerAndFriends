package flatten;

import java.util.Iterator;
import java.util.LinkedList;

import flatten.Tree.Leaf;
import flatten.Tree.Node;

public class Main {
	public static void main(String[] args){
		Tree<Integer> leaf1 = Leaf.leaf(1);
		Tree<Integer> leaf2 = Leaf.leaf(2);
		Tree<Integer> leaf3 = Leaf.leaf(3);
		
		Tree<Integer> leaf4 = Leaf.leaf(4);
		Tree<Integer> leaf5 = Leaf.leaf(5);
		Tree<Integer> leaf6 = Leaf.leaf(6);
		
		Tree<Integer> leaf7 = Leaf.leaf(7);
		Tree<Integer> leaf8 = Leaf.leaf(8);
		Tree<Integer> leaf9 = Leaf.leaf(9);
		
		Tree<Tree<Integer>> node1 = new Node(leaf1, leaf2, leaf3); 
		Tree<Tree<Integer>> node2 = new Node(leaf4, leaf5, leaf6); 
		Tree<Tree<Integer>> node3 = new Node(leaf7, leaf8, leaf9); 
		Tree<Tree<Integer>> node4 = new Node(node1, node2, node3); 
		
		FlattenTree flattenTree = new MyFlattenTree();
		Iterator<Integer> it = ((LinkedList<Integer>) flattenTree.flattenInOrder(node4)).iterator();
		while(it.hasNext()){
			System.out.print(it.next()+", ");
		}
	}
}
