package exercise1_2;

import java.util.Scanner;

public class vdmang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int [] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0;i<5;i++) {
			System.out.print("arr["+i+"]: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("Sum is: "+sum);
		System.out.print("arr[6]: ");
		arr[6] = sc.nextInt();
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}

}
