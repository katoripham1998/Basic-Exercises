import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		System.out.println("Nhap a=");
		Scanner keyboard= new Scanner(System.in);
		a=keyboard.nextInt();
		System.out.println("Nhap b=");
		b=keyboard.nextInt();
		System.out.println("Tong hai so la " +(a+b));
		System.out.println("Hieu hai so la " +(a-b));
		System.out.println("Tich hai so la " +(a*b));
		System.out.println("Thuong hai so la " +(a/b));
		System.out.println("Chia lay du hai so la " +(a % b));
	}

}
