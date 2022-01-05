package practice;

import java.util.Scanner;

public class Greedy_Card2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		
		for(int i=0;i<n;i++) {
			int min_value = 10001; //임의의 큰 숫자를 넣어 최솟값과 비교할 대상을 만듬
			for(int j=0;j<m;j++) {
				//행을 입력받아 가장 작은 수를 구하는 반복문
				int x = sc.nextInt();
				min_value = Math.min(min_value, x);
			}
			result=Math.max(result, min_value);
		}
		System.out.println(result);
	}

}
