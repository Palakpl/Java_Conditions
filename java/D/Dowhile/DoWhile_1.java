package D.Dowhile;

public class DoWhile_1 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println("All even numbers from 0 to 20:");
        do {

                if (a % 2 == 0)
                {
                    System.out.print(" " + a);
                    // a++;
                }
        }
        while (a++ <= 20);


    }
}
