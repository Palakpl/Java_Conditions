package C.While;

public class While_1 {
    public static void main(String[] args) {
        int i=0;
        int j =1;
        System.out.println("Even Numbers are:" );

        while(i<=20)
        {
            if(i%2 == 0)
            {
                System.out.print(" " + i);
                //i++;
            }
            i++;
        }
        System.out.println('\n' + "Odd Numbers are:-" );
        while(j<=20)
        {
            if(j %2==1)
            {
                System.out.print(" " + j );
            }
            j++;
        }


        }


}

