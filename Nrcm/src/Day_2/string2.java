package Day_2;

public class string2 {
	public static void main(String[] args) {
	int[] arr = {4,7,1,9,2};
	int max = arr[0];
	for(int i = 1; i < arr.length; i++) {
		if(arr[i] > max) {
			max = arr[i];
		}
	}
	System.out.println("min:" + max);
}
	
}