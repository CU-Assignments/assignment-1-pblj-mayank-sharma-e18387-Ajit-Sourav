import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;
        input = input.toLowerCase();

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            } else if (Character.isDigit(ch)) digits++;
            else if (ch != ' ') specialChars++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }
}
