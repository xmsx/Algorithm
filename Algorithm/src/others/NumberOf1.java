package others;
/**
 * ��������1�ĸ���
 * @author MFS
 * 
 * ��Ŀ��
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * 
 * ע�⸺���������⡣
 *
 */
public class NumberOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOf1(-100));
	}

	private static int numberOf1(int n) {
		int t=0;
        char[]ch=Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                t++;
            }
        }
        return t;
//        return Integer.toBinaryString(n).replaceAll("0","").length();
        
        
//        int count = 0;
//        while(n!= 0){
//            count++;
//            n = n & (n - 1);
//         }
//        return count;
	}
}
