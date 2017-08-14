package sort;

public class MergeSort {
	/**
     * �鲢����
     * 
     * ʹ�õݹ�ķ�ʽʵ�֣��Ƚϼ�࣬����⡣
     * 
     * ʱ�临�Ӷȣ�O(nlogn)
     * �ռ临�Ӷȣ�O(n)
     *
     * @param array
     */
    public static void mergeSort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("array can't be null");
        }
        int[] temp = new int[array.length];
        mergeSort(array, temp, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int[] temp, int begin, int end) {
        if (begin < end) {
            int mid = (begin + end) / 2;
//            System.out.print("begin: " + begin + " end: " + end);
//            System.out.println("     [" + begin +", " + mid + "], [" + (mid+1) +"," + end + "]");
            mergeSort(array, temp, begin, mid);
            mergeSort(array, temp, mid + 1, end);
            merge(array, temp, begin, mid, end);
        }
    }

    /**
     *
     * �ϲ��������ź�������У������������ڷ�Χ�� [begin, mid], [mid+1, end]
     *
     * @param array
     * @param temp
     * @param begin
     * @param mid
     * @param end
     */
    private static void merge(int[] array, int[] temp, int begin, int mid, int end) {
        int i = begin;
        int j = mid + 1;
        int k = begin;
        while (i <= mid && j <= end) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (j <= end) {
            temp[k++] = array[j++];
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        for (i = begin; i <= end; ++i) {
            array[i] = temp[i];
        }
//        System.out.println(Arrays.toString(array));
    }

}
