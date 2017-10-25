package test;

public class _15İİ1 {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,5,5,5,4,3,2,1};
		System.out.println(getmax(a,1,a.length-1));
	}

	private static int getmax(int[] a, int l, int r) {
		int mid = (l+r)/2;
		if(a[mid]>=a[mid-1]&&a[mid]<=a[mid+1]&&mid+1<r) {
			return getmax(a,mid+1,r);
		} else if(a[mid]<=a[mid-1]&&a[mid]>=a[mid+1]&&mid-1>l) {
			return getmax(a,l,mid-1);
		} else return Integer.max(a[mid],Integer.max(a[mid-1],a[mid+1]));
	}
	

}
