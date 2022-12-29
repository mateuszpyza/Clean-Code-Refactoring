package apps;

public class MainFIzzBuzz {
    public static void main(String[] args) {
        playFizzBuzz();
    }

    public static void playFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            String text = "";
            if (i % 3 == 0) {
                text = "Fizz";
            }
            if (i % 5 == 0) {
                text = text + "Buzz";
            }
            if (i % 3 != 0 && i % 5 != 0) {
                text = Integer.toString(i);
            }
            System.out.println(text);
        }
    }
}
