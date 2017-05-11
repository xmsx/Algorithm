package others;

import java.util.Arrays;

public class ArraySwich {
	public int minNumberInRotateArray(int [] array) {
        int bot = 0;
        int top = array.length - 1;
        while(bot<top){
            int mid = (bot+top)/2;
            if(array[mid] > array[top]){
                bot = mid + 1;
            }else if(array[mid] == array[top]){
                top = top - 1;
            }else{
                top = mid;
            }   
        }
        return array[bot];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
