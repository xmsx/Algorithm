package others;
/**
 * 二进制中1的个数
 * @author MFS
 * 
 * 题目：
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 
 * 注意负数补码问题。
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
