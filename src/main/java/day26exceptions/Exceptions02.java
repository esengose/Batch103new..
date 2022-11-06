package day26exceptions;

public class Exceptions02 {
    public static void main(String[] args) {
        getCharfromString("java",2);

        char ch1= getCharfromString("java",2);
        System.out.println(ch1);

        char ch2=getCharfromString("selenium",8);
        System.out.println(ch2);
    }


    public static char getCharfromString(String str, int idx){
        char c=' ';
        try{
            c=str.charAt(idx);
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("index ile ilgili bir problem oluştu"+ e.getMessage());

            e.printStackTrace();
        }
        return c;
    }//StringIndexOutOfBoundsException: Eger bir String'den character/ler alirken olmayan bir index kullanilirsa
    //                                 StringIndexOutOfBoundsException alinir.






















}
