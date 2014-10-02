package flatten;

import java.util.LinkedList;
import java.util.List;


public class MyFlattenTree<T> implements FlattenTree<T>{

	public List<T> flattenInOrder(Tree<T> tree) {
		
		if(tree == null)
			throw new IllegalArgumentException();
		
		Either<T, Triple<Tree<T>>> either = tree.get();
		List<T> list = new LinkedList<T>();
		
		if(either.isLeft()){
			list.addAll(either.ifLeft(new LeafList<T>()));
		}else{
			Triple<Tree<T>> triple = either.ifRight(new TreeList<T>());
			list.addAll(flattenInOrder(triple.left()));
			list.addAll(flattenInOrder(triple.middle()));
			list.addAll(flattenInOrder(triple.right()));
		}
		
		return list;
	}
	
	static class LeafList<T> implements Function<T, List<T>>{
		
		@Override
		public List<T> apply(T p) {
			List<T> list = new LinkedList<T>();
			list.add(p);
			return list;
		}
	}
	
	static class TreeList<T> implements Function<Triple<Tree<T>>, Triple<Tree<T>>>{
		
		@Override
		public Triple<Tree<T>> apply(Triple<Tree<T>> p) {
			return p;
		}
	}
}
