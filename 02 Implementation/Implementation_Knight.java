package practice;

import java.util.Scanner;

public class Implementation_Knight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String n=sc.nextLine();		
		int row= n.charAt(1)-'0';
		int col= n.charAt(0)-'a'+1;
		
		//이동할 수 있는 방향 정의
		int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
		int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

		
		int result=0;
		for(int i=0;i<8;i++) {
			int nextRow=row+dx[i];
			int nextCol=col+dy[i];
			
			if(nextRow>=1 && nextRow<=8 && nextCol>=1 && nextCol<=8) {
				result+=1;
			}
		}
		System.out.println(result);
		
	}
}
