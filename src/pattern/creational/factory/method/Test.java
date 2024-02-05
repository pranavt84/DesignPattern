package pattern.creational.factory.method;

import design.pattern.creational.factory.method.creator.ArtDecorCreator;
import design.pattern.creational.factory.method.creator.ChairCreator;
import design.pattern.creational.factory.method.creator.ModernCreator;
import design.pattern.creational.factory.method.product.Chair;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Chair chair = null;
        ChairCreator creator = null;
        Integer numberOfLegs = 4;
        Integer numberOfHands = 2;

        if (input.equalsIgnoreCase("Art Decor")) {
            creator = new ArtDecorCreator();
        } else if (input.equalsIgnoreCase("Modern")) {
            creator = new ModernCreator();

        } else {
            System.out.println("wrong choice");
        }

        chair = creator.createChair(numberOfLegs, numberOfHands);
    }
}
