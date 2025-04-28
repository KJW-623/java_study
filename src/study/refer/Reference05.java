package study.refer;

public class Reference05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {10, 20, 30,};
		int[] arr2 = arr1;
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("arr2");
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		arr1[0] = 100;
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("arr2");
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		
		int a = 10;
		int b = a;
		
		System.out.printf("a:%d b:%d\n", a, b);
		a=20;
		System.out.printf("a:%d b:%d\n", a, b);
		
		int c = arr1[2]; //
		
		
		
		//------------------
		arr1[1] = 200;
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("arr3");
		//------------------
		
		
		
		
		int[] arr4 = new int [3];
		System.arraycopy(arr1, c, arr4, b, c);
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("arr4");
		for(int i=0; i<3; i++) {
			System.out.print(arr4[i]+" ");
		}
		System.out.println();
		
		arr1[1] = 300;
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("arr4");
		for(int i=0; i<3; i++) {
			System.out.print(arr4[i]+" ");
		}
		System.out.println();
		
		
		
		
		
	}

}
