package 排序;

/**
 * 插入排序,最好复杂度,O(n),最差和平均都是O(n2)，稳定算法
 * @author Administrator
 *
 */
public class 插入排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,4,5,9,6,3,2,5,8,7,4,5};
		print(array);
		 
		sort(array);
		print(array);
	}
	/**
	 * 交换法
	 * @param arr
	 */
	public static void sort(int []arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i;
			while (j>0&&arr[j]<arr[j-1]) {
				swap(arr, j, j-1);
				j--;
			}
		}
	}
	/**
	 * 移步法
	 * @param arr
	 */
	public static void sort1(int []arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i;
			int temp=arr[i];
			while (j>0) {
				if(temp<arr[j-1]) {
					arr[j]=arr[j-1];
				}
				j--;
			}
			arr[j]=temp;
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
