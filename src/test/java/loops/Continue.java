package loops;

public class Continue {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            if (i==4){
                continue;
            }
            if (i==7){
                continue;
            }
            else {
                System.out.println(i);

            }

        }
    }
}
