import java.util.Scanner;

public class CharAppearTimes {
    public static void main(String[] args) {
        String text = "Java is a high-level, class-based, object-oriented programming language";
        System.out.println(text);
        int length = text.length();
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        for(int i = 0; i < length; i++){
            if (inputChar == text.charAt(i)) {
                count++;
            }
        }
        System.out.printf("Character %s appear %d times.", inputChar, count);
    }
}
