package Dowhileloop;

public class tenevenodd
{
    public static void main(String[] args)
    {
        int g=1;
        do
        {
            if(g%2==0){
              System.out.println(g);
            }

            g++;
        }while(g<=20);

        int f=1;
        do
        {
            if(f%2==1){
                System.out.println(f);
            }

            f++;

        }while(f<=36);


    }
}
