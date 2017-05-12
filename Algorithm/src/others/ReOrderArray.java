package others;

public class ReOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8};
		reOrderArray(array);
		System.out.println(array[4]);
	}

	private static void reOrderArray(int[] array) {
		// TODO Auto-generated method stub
		 for(int i=0;i<array.length-1;i++){  
		     for(int j=0;j<array.length-1-i;j++){  
		        if(array[j]%2==0&&array[j+1]%2==1){  
		            int temp=array[j];  
		            array[j]=array[j+1];  
		            array[j+1]=temp;  
		        }  
		     }  
		 }
	}
}
