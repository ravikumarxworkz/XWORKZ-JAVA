package com.numbers;

public class AmstrongNumber {
    // Armstrong numbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474,)
	public static void main(String[] args) {

		int a = 371;
		int sum = 0;
		int temp = a;
		int count = 0;
		int z = a;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		System.out.println("count: " + count);

		while (a > 0) {
			int p = 1;
			int b = a % 10;

			for (int i = 0; i < count; i++) {
				p = p * b;
			}
			sum = sum + p;
			a = a / 10;
		}
		System.out.println(sum);
		if (z == sum) {
			System.out.println("this number is amstrong number");
		} else {
			System.out.println("this number is not amstrong number");
		}
	}

}
