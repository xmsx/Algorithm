package dp;
/**
 * ������ʽƥ��
 * @author MFS
 * ��Ŀ��
 * ��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��
 * ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ��� 
 * ���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣨b��c ����0�Σ���������"aa.a"��"ab*a"����ƥ��
 * ��⣺
 * ��̬�滮˼��
 * ���ƹ�������������
 * ��� pattern[j] == str[i] || pattern[j] == '.', ��ʱdp[i][j] = dp[i-1][j-1];
 * ��� pattern[j] == '*'
 * ���������:
 * 1: ���pattern[j-1] != str[i] && pattern[j-1] != '.',
 * 	��ʱdp[i][j] = dp[i][j-2] 	//a*ƥ��0��
 * 2: ���pattern[j-1] == str[i] || pattern[j-1] == '.'
 * 	��ʱdp[i][j] = dp[i][j-2] 	// a*ƥ��0��
 * 	���� dp[i][j] = dp[i][j-1] 	// a*ƥ��1��
 * 	���� dp[i][j] = dp[i-1][j] 	// a*ƥ����
 */
public class Match {
	/**
	 * ƥ�亯��
	 * @param str �ַ���
	 * @param pattern ģʽ��
	 * @return �Ƿ�ƥ��
	 */
	public boolean match(char[] str, char[] pattern) {
		boolean[][] dp = new boolean[str.length + 1][pattern.length + 1];
		dp[0][0] = true;
		for (int i = 1; i < dp[0].length; i++) {
			if (pattern[i - 1] == '*')
				dp[0][i] = dp[0][i - 2];
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (pattern[j - 1] == '.' || pattern[j - 1] == str[i - 1])
					dp[i][j] = dp[i - 1][j - 1];
				else if (pattern[j - 1] == '*') {
					if (pattern[j - 2] != str[i - 1] && pattern[j - 2] != '.')
						dp[i][j] = dp[i][j - 2];
					else
						dp[i][j] = dp[i][j - 1] || dp[i][j - 2] || dp[i - 1][j];
				}
			}
		}
		return dp[str.length][pattern.length];
	}
}
