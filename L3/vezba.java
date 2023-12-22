package proba;
import java.util.Scanner;
import java.time.Year;

public class Weight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Which year were you born in?");
        int birthYear = scanner.nextInt();
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("How tall (in meters)?");
        double height = scanner.nextDouble();

        System.out.println("What is your weight in kilograms?");
        double weight = scanner.nextDouble();

  
        System.out.println("Your name is " + name);
        System.out.println("This year you'll turn " + age);

        double bmi = weight / (height * height);
        System.out.println("Your body-mass index is " + bmi);
    }
}
