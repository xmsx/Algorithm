package others;
/**
 * ��̨��
 * @author MFS
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
 * ˼·��
 * �ݹ顣
 */
public class JumpFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jumpFloor(6));
	}

	private static int jumpFloor(int i) {
		// TODO Auto-generated method stub
		if(i==1||i==2)return i;
		return jumpFloor(i-1)+jumpFloor(i-2);
	}

}
