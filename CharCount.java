import java.io.*;
import java.util.*;
public class CharCount{
// Also called Anagrams
	public boolean Count(String s, String t) {
		
		if(s.length()!=t.length()) {
			return false;
		}
		int[] letters = new int [128];
		char[] s_array = s.toCharArray();
		for( char c : s_array) {
			letters[c]++; 
			
			
		}
		for (int i =0;i<t.length();i++) {
			int c = (int)t.charAt(i);
			letters[c]--;
			if(letters[c]<0) {
				return false;
			}
		}
		return true;
			
	}
	
	public static void main(String[] args) {

		 CharCount c = new CharCount();
		  
		 boolean a = c.Count("hey","yeuh");
		 System.out.println(a);
		  
		}
}