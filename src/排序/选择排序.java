package 排序;

public class 选择排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {9,8,7,6,5,4,3,2,1};
		print(array);
		
		sort(array);
		print(array);
	}
	public static void sort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			if(min!=i) {
				swap(arr, i, min);
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
