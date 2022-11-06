package day23inheritancepolymorphism;

public class Cat extends Mammal {
    public void meow(){
        System.out.println("cats meowww");
    }

    @Override
    public void eat() {
        System.out.println("cats eat");
    }
}
