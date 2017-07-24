import java.util.Arrays;

 public class ManachersAlgorithm {

  public static String findLongestPalindrome(String s) {
    if (s==null || s.length()==0)
      return "";

    char[] s1 = addBoundaries(s.toCharArray());
    int[] p = new int[s1.length]; 
    int c = 0, r = 0; 
    int m = 0, n = 0; 
    for (int i = 1; i<s1.length; i++) {
      if (i>r) {
        p[i] = 0; m = i-1; n = i+1;
      } else {
        int i2 = c*2-i;
        if (p[i2]<(r-i)) {
          p[i] = p[i2];
          m = -1;  
        } else {
          p[i] = r-i;
          n = r+1; m = i*2-n;
        }
      }
      while (m>=0 && n<s1.length && s1[m]==s1[n]) {
        p[i]++; m--; n++;
      }
      if ((i+p[i])>r) {
        c = i; r = i+p[i];
      }
    }
    int len = 0; c = 0;
    for (int i = 1; i<s1.length; i++) {
      if (len<p[i]) {
        len = p[i]; c = i;
      }
    }
    char[] ss = Arrays.copyOfRange(s1, c-len, c+len+1);
    return String.valueOf(removeBoundaries(ss));
  }

  private static char[] addBoundaries(char[] cs) {
    if (cs==null || cs.length==0)
      return "||".toCharArray();

    char[] cs1 = new char[cs.length*2+1];
    for (int i = 0; i<(cs1.length-1); i = i+2) {
      cs1[i] = '|';
      cs1[i+1] = cs[i/2];
    }
    cs1[cs1.length-1] = '|';
    return cs1;
  }

  private static char[] removeBoundaries(char[] cs) {
    if (cs==null || cs.length<3)
      return "".toCharArray();

    char[] cs1 = new char[(cs.length-1)/2];
    for (int i = 0; i<cs1.length; i++) {
      cs1[i] = cs[i*2+1];
    }
    return cs1;
  }    
}
