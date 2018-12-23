import java.io.*;
import java.util.*;
public class URLify{
	public static String replaceSpaces(char[] chars, int len) {
		int spacecount = 0;
		int index;
		if(chars == null) {
			return "";
			
		}
	
		for(int i =0;i<len;i++) {
			if(chars[i] == ' ') {
				spacecount++;
			}
			
		}
		index = len + spacecount * 2;
		if(len<chars.length) chars[len]='\0';
		for(int i = len-1;i>=0;i--) {
			if(chars[i]==' ') {
				chars[index-1] = '0';
				chars[index-2] = '2';
				chars[index-3] = '%';
				index = index-3;
			}
			else {
				chars[index - 1]=chars[i];
				index--;
			}
		}
		return new String(chars).trim();
	}
	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		char[] arr = str.toCharArray();
		int trueLength = findLastCharacter(arr) + 1;
		System.out.println(replaceSpaces(arr, trueLength));	
	}
}