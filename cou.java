import.java.io.*;
import.java.util.*
public static int countOccurrences(String haystack, char needle)
{
    int c = 0;
    for (int i=0; i < haystack.length(); i++)
    {
        if (haystack.charAt(i) == needle)
        {
             c++;
        }
    }
    return c;
}
