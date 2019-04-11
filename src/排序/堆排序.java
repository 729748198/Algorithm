package 排序;

import java.util.Arrays;

public class 堆排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int []arr = {1,9,8,2,3,7,4,6,5};
	        sort(arr);
	        System.out.println(Arrays.toString(arr));
	}
	/**
	 * 从小到大排序
	 * 构建最大堆
	 * @param arry
	 */
	public static void sort(int []arry) {
		int length = arry.length;
		
		//从第一个非叶子节点开始构造
		for(int i = length/2-1;i >= 0;i--) {
			adjMax(arry, i, length);
		}
		
		/**
		 * 每次交换最大值和末尾元素，然后重新构建最大堆
		 */
		for(int i=length-1;i>0;i--) {
			swap(arry, 0, i);
			adjMax(arry, 0, i);
		}
		
	}
	
	/**
	 * 调整最大堆
	 * @param arry
	 * @param i
	 * @param length
	 */
	public static void adjMax(int []arry,int i,int length) {
		//先保存下来当前的值
		int temp=arry[i];
		
		/**
		 * 比较temp与两儿子节点的值，如果小就交换
		 */
		for(int k=2*i+1;k<length;k=k*2+1) {
			
			//temp的左儿子比右儿子小就k+1
			if(k+1<length&&arry[k]<arry[k+1]) {
				k+=1;
			}
			
			//如果temp比arr[k]小，就把arry[k]赋值给父节点
			if(temp<arry[k]) {
				arry[i]=arry[k];
				i=k;
				
			}else {
				//如果temp大于arry[k]，说明temp的这支树已经构成最大堆，跳出循环
				break;
			}
		
		}
		//将最小值赋值给叶节点
		arry[i]=temp;
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
