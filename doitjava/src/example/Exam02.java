package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� :");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦��");
		}else {
				System.out.println("Ȧ��");
			 }
		sc.close();
		

	}

}
