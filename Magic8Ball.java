
import java.util.Scanner;

public class Magic8Ball
{
    
    public static void main (String[] args) 
    {
      Scanner sc = new Scanner (System.in);
      
      System.out.println ("Ask me a question that can be answered with yes or no.");
      String question = sc.nextLine();
      int ans = (int) (Math.random() * 20) +1;
      if (ans == 1)
        System.out.println ("As I see it, yes.");
      if (ans == 2)
        System.out.println ("Ask again later.");
      if (ans == 3)
        System.out.println ("Better not tell you now.");
      if (ans == 4)
        System.out.println ("Cannot predict now.");
      if (ans == 5)
        System.out.println ("Concentrate and ask again.");
      if (ans == 6)
        System.out.println ("Don’t count on it.");
      if (ans == 7)
        System.out.println ("It is certain.");
      if (ans == 8)
        System.out.println ("It is decidedly so.");
      if (ans == 9)
        System.out.println ("Most likely.");
      if (ans == 10)
        System.out.println ("My reply is no.");
      if (ans == 11)
        System.out.println ("My sources say no.");
      if (ans == 12)
        System.out.println ("Outlook not so good.");
      if (ans == 13)
        System.out.println ("Outlook good.");
      if (ans == 14)
        System.out.println ("Reply hazy, try again.");
      if (ans == 15)
        System.out.println ("Signs point to yes.");
      if (ans == 16)
        System.out.println ("Very doubtful.");
      if (ans == 17)
        System.out.println ("Without a doubt.");
      if (ans == 18)
        System.out.println ("Yes.");
      if (ans == 19)
        System.out.println ("Yes – definitely.");
      if (ans == 20)
        System.out.println ("You may rely on it."); 
    }
}
