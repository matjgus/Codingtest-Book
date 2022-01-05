package practice;

import java.util.Scanner;

public class Implementation_LRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine(); // 한 줄의 문자열을 받기 전에 버퍼 비우기
		
		//이동 계획 (빈칸으로 구분)
		String[] plans = sc.nextLine().split(" ");
		int x=1, y=1; //(1,1)에서부터 시작함
		
		int[] dx = {0, 0, -1, 1}; //행 (U, D)
		int[] dy = {-1, 1, 0, 0}; //열 (L, R)
		char[] move = {'L', 'R', 'U', 'D'};
		
		//이동 계획을 하나씩 읽어옴
		for(int i=0;i<plans.length;i++) {
			char plan = plans[i].charAt(0);
			//이동 후 좌표 구하기
			int nx = -1, ny = -1; //초기화
			for(int j=0;j<4;j++) {
				if(plan==move[j]) {
					nx = x+dx[j];
					ny = y+dy[j];
				}
			}
			//공간을 벗어나는 경우 무시함
	        if (nx < 1 || ny < 1 || nx > n || ny > n) {
	        	continue;
	        }
	        // 이동 수행 
	        x = nx;
	        y = ny;
		}
		System.out.println(x + " " + y);

	}

}
