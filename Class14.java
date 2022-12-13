package Java13;

import java.util.*;

class IntegerTooSmall extends Exception {
}

class IntegerTooLarge extends Exception {
}

public class class14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		try {
			System.out.print("請輸入一個整數:");
			num = sc.nextInt();
			if (num < 10) {
				throw new IntegerTooSmall();
			} else if (num > 70) {
				throw new IntegerTooLarge();
			} else {
				System.out.println("num=" + num);
			}
		} catch (IntegerTooSmall e) {
			System.out.println("您輸入的整數值太小");
		} catch (IntegerTooLarge e) {
			System.out.println("您輸入的整數值太大");
		} catch (InputMismatchException e) {
			System.out.println("您輸入的不是整數");
		}
	}
}
