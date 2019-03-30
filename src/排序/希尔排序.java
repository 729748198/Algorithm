package 排序;

public class 希尔排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,8,9,6,3,2,5,4,2,3,12,52,3,2,1,4,58,4,5,1,47,8,5,69,8,1,4,7,8,5,69,1};
		print(array);
		
		sort(array);
		print(array);
	}
	/**
	 * 交换法
	 * @param arr
	 */
	public static void sort(int []arr) {
		for(int gap=arr.length/2;gap>0;gap/=2) {
			for(int i=gap;i<arr.length;i+=gap) {
				int j=i;
				while (j>0&&arr[j]<arr[j-gap]) {
					swap(arr, j, j-gap);
					j-=gap;
				}
			}
		}
	}

	public static void sort1(int []arr) {
		for(int gap=arr.length/2;gap>0;gap/=2) {
			for(int i=gap;i<arr.length;i+=gap) {
				int temp=arr[i];
				int j=i;
				while (j>0&&arr[j]<arr[j-gap]) {
					arr[j]=arr[j-gap];
					j-=gap;
				}
				arr[j]=temp;
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
