package da22inheritancepolymorphism;


public class Runner {
    public static void main(String[] args) {
        Cat cat1= new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);//45

        Mammal cat2 = new Cat();
        System.out.println(cat2.a);//13

        Animal cat3 = new Cat();
        System.out.println(cat3.a);//12

        //Object olustururken Object'in data type'i Child Class'lardan secilemez

        //Inheritance'da variable'lar secilirken Java Constructor'a bakar
        //Oncelikle istediginiz method'u Constructori kullanilan Class'dan alir
        Cat cat4 = new Cat();
        cat4.eat();//Cat eat

        Mammal cat5 = new Mammal();
        cat5.eat();// Mammal eat

        Animal catt6 = new Animal();
        catt6.eat();//Animal eat

        cat4.drink();
























    }
}
