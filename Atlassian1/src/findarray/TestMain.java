package findarray;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindArray fa = new MyFindArray();
		int[] array = {4,9,3,7,8};
		int[] subArray = {3,7};
		assert(fa.findArray(array, subArray) == 2);
		
		int[] array1 = {4,9,3,7,8};
		int[] subArray1 = {9,3,8};
		System.out.println(fa.findArray(array1, subArray1));
		
		int[] array2 = {1,3,5};
		int[] subArray2 = {1};
		System.out.println(fa.findArray(array2, subArray2));
		
		int[] array3 = {7,8,9};
		int[] subArray3 = {8,9,10};
		System.out.println(fa.findArray(array3, subArray3));
		
	}

}
