package nowCoder;

import java.util.Scanner;

public class 二进制中又多少个1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner=new Scanner(System.in);
		int n=inScanner.nextInt();
		String string=Integer.toBinaryString(n);
		int count=0;
		for(int i=0;i<string.length();i++) {
			if('1'==string.charAt(i)) {
				count++;
			}
		}
		System.out.println(String.valueOf(count));
	}

}
