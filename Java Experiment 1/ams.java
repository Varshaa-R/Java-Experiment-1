import java.util.*;
class ams
{
    public static void main(String args[])
    {
        int num,result=0,rem,temp;
        System.out.println("Enter the number");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
         temp=num;
        while(num>0)
        {
            rem=num%10;
            result=result+(rem*rem*rem);
            num=num/10;
        }
        if(result==temp)
        System.out.println("Amstrong");
        else 
        System.out.println("Not amstrong");

    }
}
