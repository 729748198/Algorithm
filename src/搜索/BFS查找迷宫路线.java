package 搜索;

import java.util.LinkedList;
import java.util.Queue;

public class BFS查找迷宫路线 {

	private static String path="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] maze = { 
	                {0, 0, 1, 1, 1, 1, 1, 1, 1},  
	                {1, 0, 0, 0, 0, 0, 0, 0, 1},  
	                {1, 0, 1, 1, 0, 1, 1, 0, 1},  
	                {1, 0, 1, 0, 0, 1, 0, 0, 1},  
	                {1, 0, 1, 0, 1, 0, 1, 0, 1},  
	                {1, 0, 0, 0, 0, 0, 1, 0, 1},  
	                {1, 1, 0, 1, 1, 0, 1, 1, 1},  
	                {1, 0, 0, 0, 0, 0, 0, 0, 0},  
	                {1, 1, 1, 1, 1, 1, 1, 1, 0}
	                };
		 bfs(maze);
	}
	public static void bfs(int [][]a) {
		class Node{
			public int x;
			public int y;
			public String newpath="";
			
			public Node(int x,int y,String pString) {
				// TODO Auto-generated constructor stub
				this.x=x;
				this.y=y;
				newpath=newpath+pString;
			}
		}
		int m=a.length;
		int n=a[0].length;
		Queue<Node>queue=new LinkedList<Node>();
		queue.add(new Node(0,0,"(0,0)"));
		a[0][0]=1;
		int dx[]= {0,1,0,-1},dy[]= {1,0,-1,0};
		while (!queue.isEmpty()) {
			Node node=queue.poll();
			if(node.x==n-1&&node.y==m-1) {
				System.out.println("找到出口");
				System.out.println(node.newpath);
			}
			for(int i=0;i<4;i++) {
				int x=node.x+dx[i];
				int y=node.y+dy[i];
				if(x>=0&&x<n&&y>=0&&y<m&&a[x][y]==0) {
					a[x][y]=1;
					queue.add(new Node(x, y,node.newpath+"("+x+","+y+") "));
				}
			}
		}
		
	}

}
