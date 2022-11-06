package day26exceptions;

public class Exceptions04 {
    public static void main(String[] args) {
printAge(30);

    }


    //yası ekrana yazdıran kod


    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age can not be negative");
        }
            System.out.println(age);
        }


    }

