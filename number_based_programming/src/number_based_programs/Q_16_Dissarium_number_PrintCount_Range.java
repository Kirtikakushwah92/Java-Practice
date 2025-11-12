package number_based_programs;

//WAJP to take user input and print whether the number is dissarium number or not.
import java.util.Scanner;

public class Q_16_Dissarium_number_PrintCount_Range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range  :");
		int range = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= range; i++) {
			if (isDissarium(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total dissarium number : " + count);
	}

	public static boolean isDissarium(int n) {
		int sum = 0;
		int orignalNum = n;
		int positionCount = getCount(n);
		while (n > 0) {
			sum = sum + getPower(n % 10, positionCount);
			n /= 10;
			positionCount--;
		}
		return sum == orignalNum;
	}

	public static int getCount(int n) {
		int count = 0;
		while (n > 0) {
			count = count + 1;
			n /= 10;
		}
		return count;
	}

	public static int getPower(int b, int a) {
		int pow = 1;
		while (a > 0) {
			pow = pow * b;
			a--;
		}
		return pow;
	}
}
