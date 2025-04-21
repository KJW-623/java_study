package study.refer;

public class Reference04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr22 = arr2;
		
		System.out.println(arr1==arr2);
		System.out.println(arr1[1]==arr2[1]);
		
		System.out.println(arr2==arr22);
		
		String[] arr3 = {"A", "B", "c"};
		String[] arr4 = {"A", "B", "c"};
		
		System.out.println(arr3==arr4);
		//System.out.println(arr3[0]==arr4[0]);
		System.out.println(arr3[0].equals(arr4[0]));
		
		
		
		
		
		
		
	}

}
