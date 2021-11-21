package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Man h1 = readPerson(scanner);
        Man h2 = readPerson(scanner);
        if (!h1.isMan()) {
            Human h = ((Women) h1).giveBirth();
            System.out.println("Name" + h.getName());
        }
        scanner.close();

        boolean speak = h1.speak(h2);
        boolean sustain = h1.sustain(h2);
        System.out.println("speak: " + speak + "; sustain: " + sustain);
    }

    public static Man readPerson(Scanner scanner) {

        System.out.println("enter the gender of the person");
        String gender = scanner.nextLine();
        scanner.nextLine();
        System.out.println("enter the persons name");
        String name = scanner.nextLine();
        System.out.println("enter the persons surname");
        String surname = scanner.nextLine();
        System.out.println("enter the persons height");
        float height = scanner.nextFloat();
        System.out.println("enter the persons weight");
        float weight = scanner.nextFloat();

       boolean isMan = "man".equals(gender.toLowerCase());

        return isMan ? new Man(isMan, name, surname, height, weight) : new Women(isMan, name, surname, height, weight);

    }
}




