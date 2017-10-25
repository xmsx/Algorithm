package test;

import java.util.List;

public class StringUtils {
	/**
	 * 将 List 字符串 转化成  () 包围 ，  f 分割的 字符串
	 * @param s 源字符List
	 * @param f 分隔符
	 * @return 所需字符串
	 */
	public static String join(List<String> s, String f) {
		StringBuffer sb  = new StringBuffer();
		sb.append("(");
		for(int i=0;i<s.size();i++) {
			sb.append(s.get(i));
			if(i!=s.size()-1)sb.append(f);
		}
		sb.append(")");
		return sb.toString();
	}
}
