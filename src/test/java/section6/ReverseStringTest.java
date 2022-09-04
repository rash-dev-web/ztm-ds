package section6;

import org.testng.annotations.Test;

public class ReverseStringTest {

	@Test
	public void reverseTest() {
		String str = "This is a string";
//		System.out.println(reverseString(str).toString());
//		char[] reverseStr = reverseString(str);
//		System.out.println(reverseStr);		
		System.out.println(reverseStringSB(str));
		
	}

	private char[] reverseString(String str) {
		char[] newStr = new char[str.length()];
		char[] ch = str.toCharArray();
		int j =0;
		for (int i = ch.length - 1; i >= 0; i--) {
			newStr[j] = ch[i];
			j++;

		}
		return newStr;
	}
	
	private StringBuilder reverseStringSB(String str) {
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		
		for (int i = ch.length - 1; i >= 0; i--) {
			sb.append(ch[i]);

		}	
		return sb;
	}

}
