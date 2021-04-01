package interview;

public class Paypal {
    public static void main(String[] args) {
        //Find steps taken to type a word, using a unique keypad.
        //keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba", start_pos=0, answer=4
        String word = "cba";
        String keyboard = "abcdefghijklmnopqrstuvwxyz";

        int count = 0;
        for (int i = 0; i < word.length(); i++) {

            for (int j = 0; j < keyboard.length(); j++) {
                count++;
                char a = word.charAt(i);
                char b = keyboard.charAt(j);

                if (a == b) {
                    if (i > 0) {
                        if (count > j) {
                            count = count - j;
                        } else {
                            count = count + j;
                        }
                    }
                    break;
                }
            }
            //System.out.println(count);
        }

    }

}
