package A.Forloop;

public class Table_10 {

    public static void main(String[] args) {
        System.out.println("Table of 10:" + '\n');
        for(int i=10;i<11;i++)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
