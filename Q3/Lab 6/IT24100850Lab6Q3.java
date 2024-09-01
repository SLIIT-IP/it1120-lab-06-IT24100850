import java.util.Scanner;
public class IT24100850Lab6Q3
{
       public static void main(String[] args)
       {
    
          Scanner input = new Scanner(System.in);

          int count = 0;
          int number;
          double sum = 0;
          double rms;
    
         System.out.println("Enter positive integers(terminate input with -99):");     

        do
        {
          System.out.print("Enter a number:");
          number  = input.nextInt();

          if(number < 0 && number > -99)
          {

              System.out.println("Invalid Input.Please enter a positive integer or -99 to terminate");

          }
    
          else if(number == -99)
          {
       
             rms = Math.sqrt(sum / count);
             System.out.println("\n");
             System.out.println("The Root Mean Square (RMS) is:" + rms);
          
          }

          else
          {
  
             count = count + 1;
             sum = sum + number * number;
     
          }
   
        }
       while (number != -99);
      

     }

}

