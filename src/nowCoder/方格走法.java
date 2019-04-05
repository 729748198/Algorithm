package nowCoder;

import java.util.Scanner;

public class 方格走法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        int m=in.nextInt();
	        int[][]arry=new int[n+1][m+1];
	        for(int i=1;i<=n;i++){
	            arry[i][0]=1;
	        }
	        for(int j=1;j<=m;j++){
	            arry[0][j]=1;
	        }
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=m;j++){
	                arry[i][j]=arry[i-1][j]+arry[i][j-1];
	            }
	        }
	        System.out.print(arry[n][m]);
	}

}
