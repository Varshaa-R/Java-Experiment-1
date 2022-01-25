import java.util.*;
class fibon
{
    public static void main(String args[])
    {
        int a=0,b=1,c=0,d,i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of fibonacci numbers needed:");
        d = obj.nextInt();
        System.out.println("The fibonacci series is");
        System.out.println("0");
        System.out.println("1");
        for(i=3;i<=d;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }

    


    
}
