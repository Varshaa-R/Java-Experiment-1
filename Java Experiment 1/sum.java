import java.util.*;
class sum
{
    public static void main(String args[])
    {
        int a=0,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the nth natural number:");
        b=obj.nextInt();
        for(int i=1;i<=b;i++)
        a=a+i;
        System.out.println("Sum of first " +b+ " natural numbers is "+a);
    }
}

