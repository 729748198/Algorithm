package nowCoder;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 机器人移动范围 {
	private static int m;
	private static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner=new Scanner(System.in);
		m=inScanner.nextInt();//����
		n=inScanner.nextInt();//����
		int k=inScanner.nextInt();
		int [][]ry=new int[m][n];
		int count=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if((fun(i)+fun(j))>k) {
					ry[i][j]=1;
				}else {
					count++;
					ry[i][j]=0;
				}
			}
		}
		int result=bfs(ry);
		System.out.println(result);
		System.out.println(count);
		
	}
	public static int  bfs(int [][]arrys) {
		int count=0;
		Queue<Node>nodes=new LinkedList<Node>();
		nodes.add(new Node(0, 0));
		int[] x= {0,1,0,-1};
		int[] y= {1,0,-1,0};
		while (!nodes.isEmpty()) {
			Node node=nodes.poll();
			for(int i=0;i<4;i++) {
				int rx=node.x+x[i];
				int ry=node.y+y[i];
				if(rx>=0&&rx<m&&ry>=0&&ry<n&&arrys[rx][ry]==0) {
					count++;
					nodes.add(new Node(rx, ry));
					arrys[rx][ry]=1;
				}
			}
		}
		return count;
	}
	public static int fun(int x) {
		if(x<10) {
			return x;
		} else if(x<100) {
			int ge=x%10;
			int shi=x/10;
			return ge+shi;
		} else {
			return 1;
		}
		
	}
}
class Node{
	int x;
	int y;
	public Node(int x,int y) {
		this.x=x;
		this.y=y;
	}
}