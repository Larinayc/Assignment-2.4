import java.util.Scanner;

class GradeBot
{
   
    public static void main (String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println ("what was your test out of?");
       double total = sc.nextInt();
       if (total > 0){
           System.out.println ("what was your test mark?");
           double mark = sc.nextInt();
           if (mark >= 0){
                
                double score = (mark / total)*100;
                int percentage = (int) score;
                System.out.println ("your percentage is " + percentage + "%");
       
                if (percentage >= 86 && percentage <= 100)
                System.out.println ("That's an A! Fantastic job!");
                else if (percentage >= 73 && percentage <= 85)
                System.out.println ("That's an B! Solid work!");
                else if(percentage >= 67 && percentage <= 72)
                System.out.println ("That's an C+! Good effort.");
                else if(percentage >= 60 && percentage <= 66)
                System.out.println ("That's an C! You passed.");
                else if(percentage >= 50 && percentage <= 59)
                System.out.println ("That's an C-! You passed");
                else if(percentage >= 0 && percentage <= 49)
                System.out.println ("That's an F! Try again.");
        }
         else
            System.out.println ("Invalid input.");
    }
        else
            System.out.println ("Invalid input.");
       
            
            
       
       
       
    }
}
