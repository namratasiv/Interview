import java.io.*;
import java.util.*;
public class Permut{
// Also called Anagrams
	public boolean PerString(String s, String t) {
		s = s.toLowerCase();
		t= t.toLowerCase();
		s=s.replace(" ", "");
		t=t.replace(" ", "");
		if(s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
	public String sort(String a) {
		char[] content = a.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	public static void main(String[] args) {

		 Permut p = new Permut();
		  
		 boolean a = p.PerString(" aDog is ", "God si a");
		 System.out.println(a);
		  
		}
}