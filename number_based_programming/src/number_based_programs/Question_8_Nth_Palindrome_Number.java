package number_based_programs;

// WAJP to take user input and print nth palindrome number.
import java.util.Scanner;

public class Question_8_Nth_Palindrome_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nth number : ");
		int nthNumber = sc.nextInt();
		int count = 0;
		for (int i = 0;; i++) {
			if (isPalindrome(i)) {
				count++;
				if (count == nthNumber) {
					System.out.println(nthNumber + " palindrome number is " + i);
					break;
				}
			}
		}

	}

	public static boolean isPalindrome(int n) {
		int Orginal_Number = n;
		int rev = 0; // int rem =n%10;
		while (n > 0) {
			rev = rev * 10 + n % 10; // rev*10+rem;
			n /= 10;
		}
		return Orginal_Number == rev;
	}
}
