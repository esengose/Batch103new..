package day24StatickeywordEncapsulation;

public class Student {

    //Encapsulation
    public String stdName="Tom Hanks";
    private String stdıd= "TH23438";
    private double gpa=3.8;
    private boolean retired=false;


    public String getStdıd() {
        return stdıd;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdıd(String stdıd) {
        this.stdıd = stdıd;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
