import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        int n,i,f=1;
        System.out.println("Enter the number:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        System.out.println("Factorial is ");
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(+f);
    }
}