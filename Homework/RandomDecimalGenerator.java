import java.util.random;

public class RandomDecimalGenerator {
    public static void main(String[] args) {
    
    double randomNumber = generateRandomDecimal();
    System.out.printf("RandomNumber: " %2f%n , randomNumber);

    int integerPart = (int) randomNumber;
    System.out.println("IntegerPart: " + integerPart);

    double decimalPart = randomNumber - integerPart;
    System.out.printf("DecimalPart: %2f%n", decimalPart);

    char characterFromCode = (char) integerPart;
    System.out.println("Character from CODE: " + characterFromCode);    
        }

private static double generateRandomDecimal() {
    Random random = new Random();
    return random.nextDouble() * 100;
}
}
