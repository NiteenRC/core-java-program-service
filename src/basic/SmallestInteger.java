package basic;

/**
 * # input1=443 input2=4, write a  program to print biggest possible number which is < input1 and should not contain input2  / without using string
 * ex: input1=443   input2=4  Expected output = 399
 * input1=999   input2 =9 Expected output = 888
 */
public class SmallestInteger {
    public static void main(String[] args) {
        int input1 = 443, input2 = 4;

        for (int i = 0; i <= input1; i++) {
            int in = input1 - i;
            if (method(in, input2)) {
                System.out.println(in);
                return;
            }
        }
    }

    private static boolean method(int a, int b) {
        while (a >= 1) {
            int rem = a % 10;

            if (rem == b) {
                return false;
            }
            a = a / 10;
        }
        return true;
    }
}
