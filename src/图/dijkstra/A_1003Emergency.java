package 图.dijkstra;

import java.util.Arrays;
import java.util.Scanner;

public class A_1003Emergency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//n个点
		int n=in.nextInt();
		
		//m条边
		int m=in.nextInt();
		
		//起点
		int begin=in.nextInt();
		
		//终点
		int end=in.nextInt();
		
		//边权 此处是救援队数量
		int []weight=new int[n];
		
		for(int i=0;i<n;i++) {
			weight[i]=in.nextInt();
		}
		
		//图 初始化连接
		int [][]map=new int[n][n];
		for(int i=0;i<n;i++) {
		Arrays.fill(map[i],Integer.MAX_VALUE );
		}
		for(int i=0;i<m;i++) {
			int a1=in.nextInt();
			int a2=in.nextInt();
			int path=in.nextInt();
			map[a1][a2]=map[a2][a1]=path;
		}
		
		/**
		 * 开始从begin处寻找最短路 
		 * flag表示已经是最短路
		 * dist表示从begin处到其他节点的最短路
		 * num表示当前节点有几条最短路
		 * w表示当前节点在最短路的情况m
		 */
		
		boolean []falg=new boolean[n];
		int []dist=new int[n];
		int []num=new int[n];
		int []w=new int[n];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[begin]=0;
		num[begin]=1;
		w[begin]=weight[begin];
		for(int i=0;i<n;i++) {
			/**
			 * 从dist中找到一个最短路
			 * min表示路径，k表示第几个节点
			 * 
			 */
			int min=Integer.MAX_VALUE,k=0;
			for(int j=0;j<n;j++) {
				if(falg[j]==false&&min>dist[j]) {
					min=dist[j];
					k=j;
				}
			}
			falg[k]=true;
			
			for(int j=0;j<n;j++) {
				int temp=map[k][j]==Integer.MAX_VALUE?Integer.MAX_VALUE:min+map[k][j];
				if(falg[j]==false&&temp<dist[j]) {
					dist[j]=temp;
					num[j]=num[k];
					w[j]=w[k]+weight[j];
				}else if(temp==dist[j]) {
					num[j]=num[j]+num[k];
					if(w[j]<w[k]+weight[j]) {
						w[j]=w[k]+weight[j];
					}
				}
			}
		}
		System.out.println(num[end]+" "+w[end]);
	}

}
