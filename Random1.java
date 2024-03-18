import java.util.Random;
import java.util.Scanner;
class Random1
{
   public static void main(String args[])
   {
     int a,u=0;
     Random rand=new Random();
     int r = rand.nextInt(100);
     System.out.println("ENTER ATTEMPTS OF YOUR CHOICE");
     Scanner sc1=new Scanner(System.in);
     int n=sc1.nextInt();
     do
     {
       System.out.println("Enter your Guess for the random number generated");
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
        if(r==a)
        {
          System.out.println("***YOU WON THE GAME***");
          break;
        }
        else if(a>r)
        {
          System.out.println("THE NUMBER IS TOO HIGH>>>");
        }
        else if(a<r)
       {
         System.out.println("THE NUMBER IS TOO LOW<<<<");
       }
       u+=1;
    }while(u<n); 
    if(u==n)
    {
       System.out.println("!!!BETTER LUCK NEXT TIME!!!");
    }
          

   }
}

