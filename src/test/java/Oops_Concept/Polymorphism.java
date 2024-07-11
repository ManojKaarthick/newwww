package Oops_Concept;

public class Polymorphism {

    public void method(int a ,String b) {
        System.out.println(a);
        System.out.println(b);
    }

    public void method(String c){

        System.out.println(c);
    }

    public static void main(String[] args) {
        Polymorphism p=new Polymorphism();
        p.method(15,"manoj");
        p.method("Kaarthick");
    }
        


}
