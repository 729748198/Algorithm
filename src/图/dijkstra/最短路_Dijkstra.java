package 图.dijkstra;

import java.util.Scanner;

//迪杰斯特拉，单源最短路，适合有向图，无负边
public class 最短路_Dijkstra {

	//邻接矩阵
	static int [][]map;
	
	//U数组,最短路
	static int[]U;
	
	//S数组，确定最短路
	static int[]S;
	
	//n个点
	static int n;
	//flag,确定最短路
	static boolean[]flag;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner=new Scanner(System.in);
		n=inScanner.nextInt();//n个点
		int m=inScanner.nextInt();//n条边
		//初始化邻接矩阵
		
		map=new int[n+1][n+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				map[i][j]=Integer.MAX_VALUE;
			}
		}
		U=new int[n+1];
		flag=new boolean[n+1];
		//输入一个图，用邻接矩阵存储
		
		for(int i = 0;i<m;i++) {
			int n1=inScanner.nextInt();
			int n2=inScanner.nextInt();
			int path=inScanner.nextInt();
			map[n1][n2]=path;
			map[n2][n1]=path;
		}
		dijkstra(6);
		for(int i=1;i<n+1;i++) {
			System.out.println(U[i]+"   "+i);
		}
		
	}
	public static void dijkstra(int begin) {
		//初始化U数组
		for(int i=1;i<n+1;i++) {
			if(map[begin][i]!=Integer.MAX_VALUE) {
				U[i]=map[begin][i];
			}else {
				U[i]=Integer.MAX_VALUE;
			}
		}
		//begin节点访问过了，且距离为0
		U[begin]=0;
		flag[begin]=true;
		
		for(int j=0;j<n;j++) {
	
			
			/**
		 * 在U数组中找到距离U最小的点
		 */
		int min=Integer.MAX_VALUE;
		int k=0;
		for(int i=1;i<n+1;i++) {
			if(flag[i]==false&&min>U[i]) {
				min=U[i];
				k=i;
			}
		}
		
		//k确定为最短路
		flag[k]=true;
		
		for(int i=1;i<n+1;i++) {
			int temp=map[k][i]==Integer.MAX_VALUE?Integer.MAX_VALUE:min+map[k][i];
			if(flag[i]==false&&temp<U[i]) {
				U[i]=temp;
			}
		}
	}
		
		
	}

}
