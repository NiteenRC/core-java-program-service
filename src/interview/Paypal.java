package interview;

public class Paypal {
    public static void main(String[] args) {
        //Find steps taken to type a word, using a unique keypad.
        //keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba", start_pos=0, answer=4
        String word = "fba";
        String keyboard = "abcdefghijklmnopqrstuvwxyz";

        int totalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            int temp = 0;

            for (int j = 0; j < keyboard.length(); j++) {
                temp++;

                char a = word.charAt(i);
                char b = keyboard.charAt(j);

                if (a == b) {
                    totalCount += temp;
                    break;
                }
            }
            System.out.println(totalCount);
        }

    }

}
