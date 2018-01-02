package 剑指offer;

public class 归并排序 {
	public void merge(int [] array,int left,int mid,int right,int [] temp){
		int i=left;
		int j = mid+1;
		int count = 0;
		while(i<=mid&&j<=right){
			if(array[i]<=array[j]){
				temp[count++]=array[i++];
			}else{
				temp[count++]=array[j++];
			}
		}
		while(i<=mid){
			temp[count++] = array[i++];
		}
		while(j<=right){
			temp[count++] = array[j++];
		}
		int count1 = 0;
		while(left<=right){
			array[left++] = temp[count1++];
		}
	}
	public void sort(int [] array,int left,int right,int[] temp){
		if(left<right){
			int mid = (left+right)/2;
			sort(array,left,mid,temp);
			sort(array,mid+1,right,temp);
			merge(array,left,mid,right,temp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
