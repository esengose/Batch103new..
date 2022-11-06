package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class arrayList01 {
    public static void main(String[] args) {
        //methodlar devam
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        // a listinde shoes elemanının ilk görünümünü siliniz.

        a.remove("Shoes");
        System.out.println(a);

        // a listinin shoes elemanının tüm görünümlerini siliniz
        List<String>silinecekler= new ArrayList<>();
        silinecekler.add("Shoes");
      a.removeAll(silinecekler);
        System.out.println(a);

        // salary list oluştutrp maaş 10000den az ise %20 çok ise %10 zam yapınız
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        for (Double w: salary) {
            if (w<10000){
                salary.set(salary.indexOf(w), w*1.2);} else {
                salary.set(salary.indexOf(w), w*1.1);
                System.out.println(salary);
            }
        }

        //iki arrayın eşit olup olmadığını kontrol eden kodu yazınız
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');






    }
}
