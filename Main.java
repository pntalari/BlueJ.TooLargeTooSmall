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

    /*public int guessGame(int input)
    {

        return guesscnt;

    }*/
}
