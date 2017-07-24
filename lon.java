import org.junit.Before;
import org.junit.Test;
public class palindromeClass{
@Test
public  static String longestPalindromeString(String in) {
        char[] input = in.toCharArray();
        int longestPalindromeStart = 0;
        int longestPalindromeEnd = 0;

        for (int mid = 0; mid < input.length; mid++) {
         int left = mid-1;
         int right = mid+1;
         while (left >= 0 && right < input.length) {
           if (input[left] == input[right]) {
                   
                    if (right - left > longestPalindromeEnd
                            - longestPalindromeStart) {
                        longestPalindromeStart = left;
                        longestPalindromeEnd = right;
                    }
                }
                else
                	break;
                left--;
                right++;
            }
           
            left = mid;
            right = mid + 1;
            while (left >= 0 && right < input.length)
            {
                if (input[left] == input[right]) {
                    if (right - left > longestPalindromeEnd
                            - longestPalindromeStart) {
                        longestPalindromeStart = left;
                        longestPalindromeEnd = right;
                    }
                }
                else
                	break;
                left--;
                right++;
            }
       
            	
        }
       
        return in.substring(longestPalindromeStart, longestPalindromeEnd + 1);
    }
public static void main(String args[]){
System.out.println(longestPalindromeString("XYZmalayalamabc"));
}

}
