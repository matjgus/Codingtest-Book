package practice;

import java.util.Scanner;

public class Greedy_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      
	      int n = sc.nextInt();
	      int m = sc.nextInt();
	      
	      int[][] arr = new int[n][m];
	      
	      for(int i=0;i<n;i++) {
	    	  for(int j=0;j<m;j++) {
	    		  arr[i][j] = sc.nextInt();
	    	  }
	      }
	      int max = 0;
	      int min = 0;
	      int tmp = 0;
	      
	      for(int i=0;i<n;i++) {
	    	  min = arr[i][0];
	    	  for(int j=0;j<m;j++) {
	    		  //최솟값 찾기
	    		  tmp=arr[i][j];
	    		  if(tmp<min) {
	    			  min=tmp;
	    		  }
	    	  }
    		  if(i==0) {
    			  max=min;
    		  }
    		  else {
    			  //최댓값 찾기
    			  if(max<min) {
    				  max=min;
    			  }
    		  }
    		  
	      }	      
	      System.out.println(max);
	}

}
