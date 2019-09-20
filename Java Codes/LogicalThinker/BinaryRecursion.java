package LogicalThinker;

public class BinaryRecursion {
	
	public static int BinaryRecursion(int[] arr,int low, int high,int data) {
		int mid=(low+high)/2;
		if(arr[mid]==data) {
			return mid;
		}else if(arr[mid]<data) {
			return BinaryRecursion(arr,mid+1,high,data);
		}else {
			return BinaryRecursion(arr,low,mid-1,data);
		}}
	//return -1;
	public static void main(String[] args) {
		int arr[]={1,3,4,5,6};
		BinaryRecursion(arr,0,arr.length,4);
	}
	}

