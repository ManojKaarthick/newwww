package Fruits;

public class Fruits_Class {
    private void apple() {

        System.out.println("this is apple");
    }
    public void mango() {

        System.out.println("this is mango");
    }
    protected void orange()
    {
        System.out.println("this is orange");
    }

    public static void main(String[] args) {
        Fruits_Class f=new Fruits_Class();
        f.apple();
        f.mango();
        f.orange();
    }


    }


