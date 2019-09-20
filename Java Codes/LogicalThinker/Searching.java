package LogicalThinker;

public class Searching {
	

	public static boolean contains(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
			{
				return true;
			}
		}
		return false;	
	}
public static void main(String[] args){
	
	int arr[]= {1,2,3,4,5};
	boolean b1=contains(arr,10);
	System.out.println("Enter value is "+b1);
	
}
}
	
	
