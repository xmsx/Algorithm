package dp;
/**
 * 正则表达式匹配
 * @author MFS
 * 题目：
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。
 * 模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配（b，c 出现0次），但是与"aa.a"和"ab*a"均不匹配
 * 题解：
 * 动态规划思想
 * 类似公共子序列问题
 * 如果 pattern[j] == str[i] || pattern[j] == '.', 此时dp[i][j] = dp[i-1][j-1];
 * 如果 pattern[j] == '*'
 * 分两种情况:
 * 1: 如果pattern[j-1] != str[i] && pattern[j-1] != '.',
 * 	此时dp[i][j] = dp[i][j-2] 	//a*匹配0次
 * 2: 如果pattern[j-1] == str[i] || pattern[j-1] == '.'
 * 	此时dp[i][j] = dp[i][j-2] 	// a*匹配0次
 * 	或者 dp[i][j] = dp[i][j-1] 	// a*匹配1次
 * 	或者 dp[i][j] = dp[i-1][j] 	// a*匹配多次
 */
public class Match {
	/**
	 * 匹配函数
	 * @param str 字符串
	 * @param pattern 模式串
	 * @return 是否匹配
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
