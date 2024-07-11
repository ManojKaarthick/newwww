package Fruits;

public class fruit extends Fruits_Class {
    @Override
    protected void orange() {
        super.orange();
        System.out.println("hello kitty");

    }



    public static void main(String[] args) {

        fruit  c =new fruit();
        c.orange();


    }
}
