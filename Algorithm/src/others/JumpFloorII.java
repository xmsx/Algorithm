package others;
/**
 * ��̨��
 * @author MFS
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 * ��⣺
 * ÿ��̨�׶������벻������������������һ��̨�ף������һ��̨�ױ����������Թ���2^(n-1)�����
 */
public class JumpFloorII {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jumpFloorII(6));
	}
	public static int jumpFloorII(int n){
		return 1<<(--n);
	}

}
