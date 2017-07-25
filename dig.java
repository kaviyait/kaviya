import.java.util.*;
public class NumberTest {
public static void main(String[] args) {
    int[] eg = {21,20,1,12,2, -3, -8, -20};
    System.out.println("Array Length: " + eg.length);

    for(int i=0; i < eg.length; i++) {
        System.out.println("#" + i + ": Value: " + eg[i] + " one digit number: " + isOneDigitNumber(eg[i]));
    }
}
static private boolean isOneDigitNumber(int number) {
    return (-10 < number && number < 10);
}
