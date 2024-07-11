package Oops_Concept;

public class Abstract extends Abstract_class{


    @Override
    public void methodone() {

        System.out.println("hello how are you");
    }

    @Override
    public void methodtwo() {

        System.out.println("i am fine");
    }

    public static void main(String[] args) {
        Abstract a =new Abstract();
        a.methodone();
    }


}
