package 笔试;

import java.util.Scanner;

public class T_打怪兽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//怪兽数
		long []wuli=new long[n];//怪兽的武力值
		int []jingbi=new int[n];//购买怪兽需要的金币
		
		/**
		 * 处理输入
		 */
		for(int i=0;i<n;i++) {
			long temp=in.nextInt();
			wuli[i]=temp;
		}
		
		for (int i = 0; i < n; i++) {
			int temp=in.nextInt();
			jingbi[i]=temp;
		}
		
		/**
		 * 建立一个二维数组，[i][0]是购买此怪兽，[i][i]是不购买此怪兽
		 * 初始第一个怪兽肯定要买,如果不买的策略失败就置为Max，表示这条路失败
		 */
		long [][]dowuli=new long[n][n];
		dowuli[0][0]=wuli[0];
		dowuli[0][1]=Long.MAX_VALUE;
		
		/**
		 * 处理金币
		 */
		int [][]dojingbi=new int[n][n];
		
		dojingbi[0][0]=jingbi[0];
		dojingbi[0][1]=Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			
			dowuli[i][0]=dowuli[i-1][0]+wuli[i];
			dojingbi[i][0]=dojingbi[i-1][0]+jingbi[i];
			for(int j=1;j<=i;j++) {
				if(dowuli[i-1][j-1]!=Long.MAX_VALUE&&dowuli[i-1][j-1]>wuli[i]) {
					dowuli[i][j]=dowuli[i-1][j-1];
					dojingbi[i][j]=dojingbi[i-1][j-1];
				}else {
					dowuli[i][j]=Long.MAX_VALUE;
				}
			}
		}
		long min=Long.MAX_VALUE;
		int result=0;
		for(int i=0;i<n;i++) {
			if((dowuli[n-1][i]!=Long.MAX_VALUE&&dowuli[n-1][i]!=0)&&dowuli[n-1][i]<min) {
				min=dowuli[n-1][i];
				result=dojingbi[n-1][i];
			}
		}
		System.out.println(result);
	}
}
