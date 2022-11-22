public class Main {
    public static void main(String[] args) {
        for(int i=0;i<=30;i++)
            System.out.print(i+" ");
        System.out.println();
        for(int i=30;i>=0;i-=1)
            System.out.print(i+" ");
        System.out.println();
        for(int i=0;i<=18;i+=3)
            System.out.print(i+" ");
        System.out.println();
        for(int i=10;i>=0;i-=2)
            System.out.print(i+" ");
        System.out.println("\n");
        System.out.println("\n");
        Main dr=new Main();
        dr.test();

    }




    public void test()
    {
                int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("\n");

      //  int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("\n");

        //int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("\n");

        int n=8;
// Outer for loop for number of lines
        for (i = 0; i<=n; i++)
        {
// Inner for loop for logic execution
            for (j = 0; j<= n / 2; j++)
            {
// prints two vertical lines
                if ((j == 0 || j == n / 2) && i != 0 ||
// print first line of alphabet
                        i == 0  && j != n / 2 ||
// prints middle line
                        i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }



    }
    }
