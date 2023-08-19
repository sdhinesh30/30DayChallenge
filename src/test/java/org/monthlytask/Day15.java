package org.monthlytask;

public class Day15 {
	
	//Armstrong number
	public static void armstrong(int num) {
		int n = num;
		int result=0;
		while(num>0) {
			int temp = num%10;
			result = (temp*temp*temp)+result;
			num = num/10;
		}
		if(result == n) {
			System.out.println("Given number is armstrong");
		}
		else {
			System.out.println("Given number is not armstrong");
		}
	}
	public static void main(String[] args) {
		int num = 371;
		armstrong(num);
	}
}
