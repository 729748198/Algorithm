package 排序;

import java.util.Arrays;
/**
 * 归并排序是稳定算法，它最好最差和平均算法复杂度都是O(nlgn)
 * @author Administrator
 *
 */
public class 归并排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int []arr = {1,9,8,2,3,7,4,5,6};
	        sort(arr);
	        System.out.println(Arrays.toString(arr));
	}
	//归并排序
	public static void  sort(int []arry) {
		//建立一个临时表，避免递归建立
		int []temp = new int[arry.length];
		int left = 0;
		int right = arry.length - 1;
		sort(left,right,arry,temp);
		
	}
	
	//重载方法，递归调用
	public static void sort(int left,int right,int arr[],int temp[]) {
		if(left<right) {
			//归并的分治
			int mid=(left+right)/2;
			sort(left,mid,arr,temp);
			sort(mid+1,right,arr,temp);
			
			//归并
			merge(left, right, arr, temp);
		}
	}
	public static void merge(int left,int right,int arr[],int temp[]) {
		
		//左指针
		int i = left;
		//中间
		int mid = (left+right)/2;
		//右指针
		int j = mid+1;
		
		//临时表指针
		int t = 0;
		
		/**
		 *按从小到大的顺序将这左右表中的数字存放到临时表 
		 */
		while (i<=mid&&j<=right) {
			
		
			if(arr[i]<arr[j]) {
				temp[t++] = arr[i++];
			}else {
				temp[t++] = arr[j++];
			}
			
		}
		
		/*
		 * 左表中未排序的
		 */
		while(i<=mid) {
			temp[t++]=arr[i++];
		}
		
		/**
		 * 右表中未排序的
		 */
		while (j<=right) {
			temp[t++]=arr[j++];
		}
		
		/**
		 * t置0，开始给原数组赋值
		 */
		t=0;
		while (left<=right) {
			arr[left++]=temp[t++];
		}
		
	}

}
