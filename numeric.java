import.java.io.*;
import.java.util.*;
public static int getCount(String number) {
    int f = 0;
    for (int i = 0; i < number.length(); i++) {
        if (Character.isDigit(number.charAt(i))) {
            f++;
        }
    }
    return f;
}
