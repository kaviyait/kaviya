import.java.io.*;
import.java.util.*;
public static void main(String[] args) {

        int low = 999, high = 99999;

        for(int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int origNumber = number;
            while (origNumber != 0) {
                origNumber /= 10;
                ++digits;
            }
            origNumber = number;
            while (origNumber != 0) {
                int remainder = origNumber % 10;
                result += Math.pow(remainder, digits);
                origNumber /= 10;
            }

            if (result == number)
                System.out.print(number + " ");
        }
    }
}
