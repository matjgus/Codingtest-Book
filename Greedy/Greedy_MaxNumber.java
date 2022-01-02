package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n, m, k 입력 :");
		int n = scan.nextInt(); //배열의 크기
		int m = scan.nextInt(); //몇번 더할지
		int k = scan.nextInt(); //연속된 수
		
		System.out.println("배열 입력 :");
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scan.nextInt();		
		}
		Arrays.sort(array); //배열 정렬
		for(int i=0;i<n;i++) {
			System.out.print(array[i] + " ");
		}
		int max_num = array[n-1]; //가장 큰 수
		int secmax_num = array[n-2]; //두번째로 큰 수
		
		//count_max : max값 연산 개수
		int count_max=(m/(k+1))*k;
		count_max+=m%(k+1);
		
		int result;
		result = count_max * max_num;
		result += secmax_num*(m-count_max); //전체-count_max = 두 번째 max값 연산 개수
		System.out.println();
		System.out.println("결과 : " + result);
	}

}
