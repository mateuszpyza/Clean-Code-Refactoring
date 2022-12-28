package apps;


public class MainCheckingText {
    public static void main(String[] args) {
        checkText("a Nil to kotlina?");
    }

    public static void checkText(String text) {
        if (isNotNull(text)) {
            if (isPalindrome(text)) {
                System.out.println("Wyrażenie jest palindromem.");
            } else {
                System.out.println("Wyrażenie nie jest palindromem.");
            }
            System.out.println("Wyrażenie składa się z " + getTextLength(text) + " znaków.");
        } else {
            System.out.println("String nie zawiera żadnych znaków!!!");
        }
    }

    public static boolean isNotNull(String text) {
        return text != null;
    }

    public static boolean isPalindrome(String text) {
        if (isNotNull(text)) {
            text = text.toLowerCase();
            text = text.replace(" ", "");
            text = text.replace(",", "");
            text = text.replace("?", "");
            text = text.replace("!", "");
            text = text.replace("-", "");
            StringBuilder reverseText = new StringBuilder(text).reverse();
            return text.equals(reverseText.toString());
        }
        return false;
    }

    public static int getTextLength(String text) {
        if (isNotNull(text)) {
            return text.length();
        }
        return 0;
    }
}
