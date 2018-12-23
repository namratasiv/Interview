import java.io.*;
import java.util.*;

public class LargestSum{
	

	public static int maxsum(int[] a) {
		int current_sum, max_sum;
		if(a.length == 0) {
			return 0;
		}
		
		current_sum = max_sum = a[0];
				
				for( int i=0;i<a.length;i++) {
					
					current_sum = Math.max(current_sum + i, a[i]);
					
					max_sum = Math.max(max_sum, current_sum);
					
				}
		return max_sum;
	}
	public static void main(String[] args) {
		int [] arr = {1,2, -1, 9, 0, 999, 6};

		System.out.println(maxsum(arr));
	}
}