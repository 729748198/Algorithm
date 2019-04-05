	package nowCoder;
	
	import java.util.Scanner;
	
	public class 判断一颗满二叉树是否二叉搜索树 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner inScanner=new Scanner(System.in);
			int []arry=new int[10000];
			String string=inScanner.nextLine();
			String []nunmber=string.split(",");
			for(int i=0;i<nunmber.length;i++) {
				arry[i+1]=Integer.valueOf(nunmber[i]);
			}
			for(int i=1;i<nunmber.length+1;i++) {
				if(((2*i<nunmber.length+1)&&arry[2*i]>=arry[i])||(((2*i+1)<nunmber.length+1)&&arry[2*i+1]<=arry[i])) {
					System.out.println("False");
					return;
				}
			
			}
			System.out.println("True");
			
		}
	
	}
