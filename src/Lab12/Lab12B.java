/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 12
 */
//package Lab12;
import java.util.*;

public class Lab12B {

    public static class Dog { //dog class
        public static int age;
        public static double weight;
        public static String name;
        public static String furColor; // color not colour
        public static String breed;
        public static Scanner scan = new Scanner(System.in);
       public void bark() {
            System.out.println("Woof! Woof!");
        }

        public String rename() {
            System.out.print(name + " isn’t a very good name. What should they be renamed to:  ");
            name = scan.next();
            return name;
        }
        public double eat() {
           System.out.print(name + " is hungry, how much should he eat: ");
           double foodWeight = scan.nextDouble();
           weight = foodWeight + weight;
           return weight;
        }
    }

    public static void main(String[] args) { // main class or Driver class
        Dog newDog = new Dog();
        Scanner scan = new Scanner(System.in);
        System.out.println("You are about to create a dog");
        System.out.print("How old is the dog: ");
        newDog.age = scan.nextInt();
        System.out.println("How much does the dog weigh: ");
        newDog.weight = scan.nextDouble();
        System.out.print("What is the dog's name: ");
        newDog.name = scan.next();
        System.out.print("What color is the dog: ");
        newDog.furColor = scan.next();
        System.out.print("What breed is the dog: ");
        newDog.breed = scan.next();

        System.out.println(newDog.name + " is a " + newDog.age + " year old "
                + newDog.furColor + " "
                + newDog.breed + " that weighs " + newDog.weight + " lbs.");

        newDog.bark();
        newDog.eat();
        newDog.rename();
        System.out.println(newDog.name + " is a " + newDog.age + " year old "
                + newDog.furColor + " "
                + newDog.breed + " that weighs " + newDog.weight + " lbs.");
    }
}
