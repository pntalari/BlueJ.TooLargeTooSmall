import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    //instance variables
    int input;
    int answer;
    int guessCount = 1;
    int previousInput;
    
    //main method
    public Main()
    {
        Random random = new Random();
        int answer = random.nextInt(20);

        guessCount = guessMatch(answer);
        
        System.out.println("You have guessed " + guessCount + " times");
    }
    //Guess method
    public int guessMatch(int answer)
    {
       Scanner read = new Scanner(System.in);
       System.out.println("Please enter a number in range of 1-20: ");
       input = read.nextInt();
        
        while (input != answer)
        {
           if (input < 1 || input > 20)
           {System.out.println("Your input is invalid, please enter within range 1-20");}
           
           else if(input > answer)
           {System.out.println("Your number is too high");}
           
           else if(input < answer)
           {System.out.println("Your number is too low");}

           if (previousInput != input)
           { guessCount++;}
           
           previousInput = input;
           input = read.nextInt();
        }
        
        System.out.println("Your guessed number matches, great job!");
        return guessCount;
    }
   
}    
    /* working Code
    private int x;
    int guesscnt = 1;
    int inputPrev = 0;

    public Main()
    {
       Scanner read = new Scanner(System.in);
       System.out.println("Enter your guessing Number between 1-10:");
       int input = read.nextInt();
       
        Random random = new Random();
        int answer = random.nextInt(10);
        
        while (input != answer)
        {

           if (input < 1 || input > 10)
           {
            System.out.println("Your guess is invalid");
           }
           else if (input > answer)
           {
             System.out.println("Your guess is too high");
           }
           else if (input < answer)
           {
             System.out.println("Your guess is too low");
           }
           if (inputPrev != input)
           {
             guesscnt++;
           }
           inputPrev = input;
           input = read.nextInt();
        }
       
       //guessGame(input);
       
       System.out.println("Your number matches perfectly, great job!");
       System.out.println("You have guessed: " + guesscnt + " times");  
    }
*/
