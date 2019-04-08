package 笔试;

import java.util.Scanner;

public class XC_链表反转 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 输入
		 */
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		int k=in.nextInt();
		
		/**
		 * 处理输入
		 */
		
		String[]arry=string.split(",");
		int length=arry.length;
		arry[0]=arry[0].substring(1);
		arry[length-1]=arry[length-1].substring(0,1);
		
		/**
		 * 建立链表
		 */
		
		Node head=new Node();
		Node preNode=new Node(Integer.valueOf(arry[0]));
		head.next=preNode;
		for(int i=1;i<length;i++) {
			Node node=new Node(Integer.valueOf(arry[i]));
			preNode.next=node;
			node.last=preNode;
			preNode=node;
		}
		
//		/**
//		 * 开始反转，用了4个额外空间
//		 */
//		Node headNode=head;
//		Node first;
//		Node second;
//		Node thread;
//		for(int i=0;i<length/k;i++) {
//			first=headNode.next;
//			for(int j=1;j<k;j++) {
//				
//				second=first.next;
//				thread=second.next;
//				first.next=thread;
//				second.next=first;
//				headNode.next=second;
//				headNode=second;
//			}
//			headNode=first;
//		}
		
		/**
		 * 输出
		 */
		System.out.print("[");
		
		Node node=head.next;
		Node node2;
		for(int j=0;j<length/k;j++) {
			for(int i=1;i<k;i++) {
				node=node.next;
			}
			node2=node;
			
			for(int i=0;i<k;i++) {
				System.out.print(node.value+",");
				node=node.last;
			}
			node=node2.next;
		}
		while (node.next!=null) {
			System.out.print(node.value+",");
			node=node.next;
			
		
		}
		System.out.print(node.value+"]");
			
	
	}
	

}
class Node{
	int value;
	Node next;
	Node last;
	public Node() {}
	public Node(int value) {
		this.value=value;
	}
}
