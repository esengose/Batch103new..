package day25exceptions;

import java.sql.SQLOutput;

public class Exceptions03 {
    public static void main(String[] args) {
        String str= "Ali";
        getNumOfChars(str);     //3

        String s="";            //0
        getNumOfChars(s);

        String t= null;
        getNumOfChars(t);   //nullPointerException



    }

    //Bir Stringte bulunan karakterlerin sayısını bulabilmek için bir method oluşturunuz.

    public static void getNumOfChars(String str){
        System.out.println(str.length());
    }












}
