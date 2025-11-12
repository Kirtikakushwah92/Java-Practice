package number_based_programs;

// WAJP to take user input and print whether the number is Strong number or not.
import java.util.Scanner;

public class Q_12_Is_Strong_number_PrintAndCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int range = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= range; i++) {
			if (isStrong(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total strong number is : " + count);
	}

	public static boolean isStrong(int n) {
		int sum = 0, orignalNum = n;
		while (n > 0) {
			sum = sum + getFact(n % 10);
			n /= 10;
		}
		return sum == orignalNum;
	}

	public static int getFact(int n) {
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}
}
