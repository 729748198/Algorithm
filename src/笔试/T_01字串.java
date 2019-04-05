package 笔试;


import java.util.Scanner;

public class T_01字串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String string=in.next();
		StringBuilder stringBuilder=new StringBuilder(string);
		for(int i=0;i<n;) {
			if(i+1<stringBuilder.length()) {
				String temp=stringBuilder.substring(i, i+2);
				
				if((temp.equals("01")||temp.equals("10"))) {
					stringBuilder.delete(i, i+2);
					i=0;
				}else {
					i++;
				}
			}else {
				i++;
			}
		}
		System.out.println(stringBuilder.length());
		
	}

}
