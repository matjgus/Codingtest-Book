package practice;

import java.util.Scanner;

public class Greedy_Until1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int k= sc.nextInt();
		int result = 0;
		
		while(n>1) {
			if(n%k!=0) {
				n=n-1;
			}
			else {
				n=n/k;
			}
			System.out.println("n의 값 : " +n);
			result++;
		}
		System.out.println("결과값 : " + result);
	}
}
