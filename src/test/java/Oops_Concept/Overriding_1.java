package Oops_Concept;

public class Overriding_1 extends Overriding {
    @Override
    public void method1() {
        super.method1();
        System.out.println("good evening");
    }

    @Override
    public void method2() {
        super.method2();
    }


    public static void main(String[] args) {
        Overriding_1 o = new Overriding_1();
        o.method1();
    }
}