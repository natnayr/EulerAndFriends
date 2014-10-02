package findarray;

public class MyFindArray implements FindArray {
    public int findArray(int[] array, int[] subArray) {
    	int ret = -1;
        for(int i=0; i<array.length; i++){
        	if(array[i] == subArray[0]){
        		for(int j=0;j<subArray.length; j++){
        			if((array.length-i >= subArray.length) && 
        					(array[i+j] == subArray[j])){
        				ret = i;
        			}else{
        				return -1;
        			}
        		}
        		break;
        	}
        }
        return ret;
    }
}