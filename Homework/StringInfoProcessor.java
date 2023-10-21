import java.util.Scanner;

public class StringInfoProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String inputString = scanner.nextLine();

        char firstCharacter = inputString.charAt(0);
        char lastCharacter = inputString.charAt(inputString.length() - 1);

        int middleCharacter = inputString.length() / 2;
        char middleCharacter;
    if (inputString.length() % 2 == 1) {
        middleCharacter = inputString.charAt(middleCharacter);
    }
    else {
        middleCharacter = inputString.charAt(middleCharacter - 1);
    }

    int sumOfCharacters = firstCharacter + lastCharacter + middleCharacter;

    System.out.println("First Character: " + firstCharacter);
    System.out.println("Last Character: " + lastCharacter);
    System.out.println("Middle Character: " + middleCharacter);
    System.out.println("Sum of characters: " + sumOfCharacters);
    System.out.println("Character with the biggest value: " + maxChar);

    scanner.close();
    }
}
