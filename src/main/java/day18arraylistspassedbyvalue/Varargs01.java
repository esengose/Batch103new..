package day18arraylistspassedbyvalue;

public class Varargs01 {
    public static void main(String[] args) {
        //iki sayını toplamını return eden method

    }

    public static int ikiSayiTopla(int a, int b) {
        return a + b;
    }


    public static int ucSayiyiTopla(int a,int b, int c) {
        return
                a + b + c;
    }
    //istediğimiz sayıyı toplayabileceğimiz bir method  //VARARGS
    public static int toplamaYap (int...a){

        int sum=0;
        for(int w: a){
            sum+=w;
        }
        return sum;
    }



 /*

        1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz "varargs" kullanmalisiniz.

        2)"varargs" arka tarafta "Array" kullanir. Bu yuzden varargslarla calisirken,
          Arraylerle calisiyormus gibi davranabilirsiniz.

        3)"varargs" olusturmak icin "<data type>...<varargs ismi>"

        4)Bir method'da varargsin yanında baska bir parametre, varargs en sonda olmak sartıyla kullanilabilir.

        5)Bir methodda birden fazla varargs kullanilamaz.Cunku varargs en sonda olmak zorundadır.Birden fazla
          kullanildiginda en az bir varargs en sonda olmayacaktır. Bu da 4. madde ile celisir.

     */
















}
