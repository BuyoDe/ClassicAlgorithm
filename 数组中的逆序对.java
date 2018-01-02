package 剑指offer;

public class 数组中的逆序对 {
/*
 * 归并思想
 */
	int cnt=0;
	public void merge(int[] a,int start,int mid,int end){
		int[] tmp = new int[end-start+1];
		int i=start,j=mid+1,k=0;
		while(i<=mid&&j<=end){
			if(a[i]<=a[j])
				tmp[k++]=a[i++];
			else{
				tmp[k++]=a[j++];
				cnt +=mid-i+1;//core code
			}			
		}
		while(i<=mid)
			tmp[k++]=a[i++];
		while(j<=end)
			tmp[k++]=a[j++];
		for(k=0;k<tmp.length;k++)
			a[start+k] = tmp[k];
	}
	public void mergeSortUp2Down(int[] a,int start,int end){
		if(start>=end)
			return;
		int mid = (start+end)>>1;
		mergeSortUp2Down(a,start,mid);
		mergeSortUp2Down(a,mid+1,end);
		merge(a,start,mid,end);
	}
	public int InversePairs(int[] array){
		if(array!=null)
			mergeSortUp2Down(array,0,array.length-1);
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
