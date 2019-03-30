package 基本算法;

public class 二进制表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=0;j<255;j++) {
			System.out.print(j+"   ");
			for(int i=7;i>=0;i--) {
				System.out.print(j>>>i&1);
			}
			System.out.println();
		}
		
	}

}
