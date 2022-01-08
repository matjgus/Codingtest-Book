package practice;

import java.util.Scanner;

public class Implementation_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int cnt=0;
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<60;j++) {
				for(int k=0;k<60;k++) {
					String tmp="";
					tmp+=i;
					tmp+=j;
					tmp+=k;
					if(tmp.contains("3")) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
