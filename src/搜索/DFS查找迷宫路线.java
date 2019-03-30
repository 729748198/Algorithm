package 搜索;

public class DFS查找迷宫路线 {

	private static String temp="";
	private static String shortpath="";
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
		 dfs(0, 0, maze);
		 
	}
	public static void dfs(int x,int y,int [][]a) {
		int m=a.length;
		int n=a[0].length;
		if(x<0||x>=n||y<0||y>=m||a[x][y]==1) {
			
			return;
		}
		if(x==n-1&&y==m-1) {
			temp=temp+"("+x+","+y+") ";
			if(shortpath.length()>temp.length()||shortpath.length()==0) {
				shortpath=temp;
			}
			System.out.println("找到出口！"+temp);
		}
		String path=temp;
		temp=temp+"("+x+","+y+") ";
		a[x][y]=1;
		dfs(x-1, y, a);//左
		dfs(x+1, y, a);//右
		dfs(x, y-1, a);//上
		dfs(x, y+1, a);//下
		a[x][y]=0;
		temp=path;
	}

}
