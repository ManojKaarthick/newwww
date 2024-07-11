package Interface;

public class Interface_Class implements Interface_A,Interface_B{


    @Override
    public void method_1() {
        System.out.println("This is method one");
    }

    @Override
    public void method_2() {
        System.out.println("this is method two");

    }

    @Override
    public void method_3() {
        System.out.println("this is method three");

    }

    @Override
    public void method_4() {
        System.out.println("this is method four");

    }

    public static void main(String[] args) {
        Interface_Class Ic =new Interface_Class();
        Ic.method_1();
        Ic.method_4();
    }
}
