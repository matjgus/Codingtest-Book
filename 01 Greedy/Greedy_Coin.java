package practice;

public class Greedy_Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1260;
		int count = 0;
		int coin[] = { 500, 100, 50, 10 };
		int change;
		
		for(int i=0;i<4;i++) {
			change = n%coin[i];
			count = count + (n/coin[i]);
			n=n%coin[i];
			
			System.out.println(i + "번째 " + change);
		}
		System.out.println("결과 : "+ count);
	}

}
