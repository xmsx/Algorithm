package others;

import java.util.ArrayList;

/**
 * ˳ʱ���ӡ����
 * @author MFS
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֡�
 *
 */
public class PrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = {{1, 2},{3,4}};
		printMatrix(m);
	}

	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer> ();
        if(matrix.length==0) return result;
        int n = matrix.length,m = matrix[0].length;
        if(m==0) return result;
        int layers = (Math.min(n,m)-1)/2+1;//����ǲ���
        for(int i=0;i<layers;i++){
            for(int k = i;k<m-i;k++) result.add(matrix[i][k]);//������
            for(int j=i+1;j<n-i;j++) result.add(matrix[j][m-i-1]);//����������
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(matrix[n-i-1][k]);//������
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(matrix[j][i]);//����������
        }
        return result;    
	}

}
