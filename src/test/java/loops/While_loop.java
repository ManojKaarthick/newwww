package loops;

public class While_loop {
    public static void main(String[] args) {
        int a = 15;
        int b = 30;

        while (a < b) {
            System.out.println(a+b);
            a++;
        }
        do {
            System.out.println("good morning");
            a++;
        } while (a < b);

    }
}

