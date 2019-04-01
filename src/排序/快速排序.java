package 排序;

import java.util.Arrays;

/**
 * 快速排序最差时间复杂度O(n2),最好和平均复杂度O(n*lgn)，不稳定排序
 * @author Administrator
 *
 */
public class 快速排序 {

	 public static void main(String[] args) {
	        //int[] arr = {5,4,8,3,9,6,2,7,1,4};
	       // int []arr= {9,8,7,6,5,4,3,2,1};
		 	int[] arr= {1,2,3,4,5,6,7,8,9};
	        quickSort1(arr, 0, arr.length - 1);
	        System.out.println("排序结果：" + Arrays.toString(arr));
	    }

	 /**
	  * 选取第一个数为枢纽，就得从右往左遍历。因为要交换的值得比第一个值小。选最后一个同理得从左往右遍历。
	  * @param arr
	  * @param left
	  * @param right
	  */
	 public static void quickSort1(int []arr,int left,int right) {
		 if(left<right) {
			 int temp=arr[left];
			 int i=left;
			 int j=right+1;
			 while (i<j) {
				 while (j>i&&arr[--j]>=temp) {}
				 while (i<right&&arr[++i]<temp) {}
				 if(i<j) {
					 swap(arr, i, j);
				 }	
			}
			 if(left<j) {
				 swap(arr, j, left);
			 }
		quickSort1(arr, left, j-1);
		quickSort1(arr, j+1, right);
		
		}
	}
	    /**
	     * @param arr
	     * @param left  左指针
	     * @param right 右指针
	     */
	    public static void quickSort(int[] arr, int left, int right) {
	        if (left < right) {
	            //获取枢纽值，并将其放在当前待处理序列末尾
	            dealPivot(arr, left, right);
	            //枢纽值被放在序列末尾
	            int pivot = right - 1;
	            //左指针
	            int i = left;
	            //右指针
	            int j = right - 1;
	            while (true) {
	                while (arr[++i] < arr[pivot]) {
	                }
	                while (j > left && arr[--j] > arr[pivot]) {
	                }
	                if (i < j) {
	                    swap(arr, i, j);
	                } else {
	                    break;
	                }
	            }
	            if (i < right) {
	                swap(arr, i, right - 1);
	            }
	            quickSort(arr, left, i - 1);
	            quickSort(arr, i + 1, right);
	        }

	    }

	    /**
	     * 处理枢纽值
	     *
	     * @param arr
	     * @param left
	     * @param right
	     */
	    public static void dealPivot(int[] arr, int left, int right) {
	        int mid = (left + right) / 2;
	        if (arr[left] > arr[mid]) {
	            swap(arr, left, mid);
	        }
	        if (arr[left] > arr[right]) {
	            swap(arr, left, right);
	        }
	        if (arr[right] < arr[mid]) {
	            swap(arr, right, mid);
	        }
	        swap(arr, right - 1, mid);
	    }

	    /**
	     * 交换元素通用处理
	     *
	     * @param arr
	     * @param a
	     * @param b
	     */
	    private static void swap(int[] arr, int a, int b) {
	        int temp = arr[a];
	        arr[a] = arr[b];
	        arr[b] = temp;
	    }
	

}
