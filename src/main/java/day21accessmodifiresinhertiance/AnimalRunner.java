package day21accessmodifiresinhertiance;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat c1=new Cat(); //cat objesi oluştrdum

        c1.meow();
        c1.drink();
        c1.eat();

        Dog d1=new Dog();
        d1.eat();
        d1.drink();
        d1.bark();

        /*
    1)"Inheritance" sayesinde
        i)Code tekrarlarından kurtuluruz.
        ii)Code tamiri(maintenance) kolay olur.
        iii)Child Class'ları daha atomik yapmış oluruz.

    2)Bir Class'ı başka bir class'ın Child Class'ı yapmak için
      "extends" keyword kullanılır. ilk yazılan Class Child, ikinci
      yazılan Class parent olur.

    3)Child Class object'leri Parent Class'dan method ve variable'ları kullanabilirler.

    4)Parent Class object'leri Child Class'dan methodv e variable'ları kullanamazlar

    5)Object Class her Class'ın Parent'ıdır.
        Java'da Object Class hariç her class'ın parent'ı vardır
        Java'da parent'ı olmayan tek class Object Class'dır.

       6)"private"  method ve variable'lar child class'lar tarafindan kullanilamaz
  "protected"  method ve variable'lar child class'lar tarafindan kullanilabilir.
  "default"  method ve variable'lar ayni package'teki child class'lar tarafindan kullanilabilir.
  "public"  method ve variable'lar child class'lar tarafindan kullanilabilir.
  Note: child class'lar tarafinda kullanilabilir olmak inherit edilebilir demektir.

  7) 4 tip inheritance vardır;

    i) MultiLevel Inheritance : Java bunu destekler.
    ii) Hierarchical Inheritance : Bir parent için çoklu child, Java bunu kabul eder.
    iii) Multiple Inheritance : Bir Child a çoklu Parent, Java bunu desteklemez.
    iv) Single Inheritance : Bir Child Class için bir Parent Class demektir, Java bunu destekler.




 */






    }
}
