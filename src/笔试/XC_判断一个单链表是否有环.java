package 笔试;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class XC_判断一个单链表是否有环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		String[]arry=string.split(",");
		
		Map<String, Integer>map=new HashMap<String, Integer>(26);
		
		boolean flag=false;
		
		for(int i = 0;i<arry.length;i++) {
			int temp=1;
			if(map.get(arry[i])!=null) {
				flag=true;
				break;
			}
			map.put(arry[i], temp);
		}
		System.out.println(flag);
	}

}
