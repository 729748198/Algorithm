package 排序;
/**
 * 冒泡排序，最好情况O(n),最差和平均O(n2).是稳定算法
 * @author Administrator
 *
 */
public class 冒泡排序 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array= {9,8,7,6,5,4,3,2,1};
		print(array);
		
		sort1(array);
		print(array);
	}
	/**
	 * 基本冒泡排序
	 * @param arr
	 */
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j+1, j);
				}
			}
		}
	}
	/**
	 * 加一个flag判断有序后直接退出
	 * @param arr
	 */
	public static void sort1(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean flag=true;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					flag=false;
					swap(arr, j+1, j);
				}
			}
			if(flag) {
				break;
			}
		}
	}
	public static void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void print(int []arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
