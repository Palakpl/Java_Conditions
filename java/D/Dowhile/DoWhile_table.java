package D.Dowhile;

public class DoWhile_table {
    public static void main(String[] args) {
        int i = 11;
        int j = 1;
        System.out.println("Multiplication table of 11:");
        do{
            System.out.println(i + " * " + j + " = " + i*j);
            j++;
        }
        while(j<=10);
    }
}
