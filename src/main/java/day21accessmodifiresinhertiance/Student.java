package day21accessmodifiresinhertiance;

public class Student {
    /*
   Access Modifier
   1)public     2)protected     3)default (Access Modifier'i default yapmak icin access modifier yazmayiz)      4)private
*/
    public String stdName = "TomHanks";
    protected String address = "Miami";
    String email = "th@gmail.com";
    private String stdId = "20206517004";
   /* Note: Access Modifier'lari genisden dara dogru sayiniz
    public > protected > default > private
    Note: Access Modifier'lari birer birer aciklayiniz
    public olanlar her class'dan kullanilabilir
    protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
    default olanlar baska package'den kullanilamazlar
    private olanlar sadece olsturulduklari Class icinde kullanilabilirler
    Note: "protected" ile "default" un farkini soyleyiniz.
    protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
    default olanlar baska package'den kullanilamazlar
    Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
    public, default kullanilir ama protected ve private kullanilamaz


    //public her class'dan kullanilabilir
    public String stdName = "TomHanks";

    //protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
    protected String address = "Miami";

    //default olanlar baska package'den kullanilamazlar
    String email = "th@gmail.com";

    //private olanlar sadece olsturulduklari Class icinde kullanilabilirler
    private String stdId = "20206517004";*/


}
