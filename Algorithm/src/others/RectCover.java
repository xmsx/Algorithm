package others;
/**
 * ���󸲸�
 * @author MFS
 * ��Ŀ��
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * ��⣺
 *     �������
 * ӦΪ���Ժ��ŷŻ����ŷţ�����  f(n) ������f(n-1)�ľ��μ�    1 �����ŷŵ�2*1�ľ���
 * ��   f(n-2) �ľ��μ� �������ŷŵ�2*1�ľ���      **�������������ŷŵģ���Ϊ����������ظ���**
 * ��f(n)=f(n-1)+f(n-2)
 * ���������f(1)=1,f(2)=2
 */
public class RectCover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rectCover(6));
	}

	private static int rectCover(int i) {
		// TODO Auto-generated method stub
		if(i==0||i==1||i==2)return i;
		return rectCover(i-1)+rectCover(i-2);
	}

}
