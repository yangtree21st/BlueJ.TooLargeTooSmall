
/**
 * I develop a number guess game
 *
 * @author (Yang Shu)
 * @version (Fer.05,2019)
 */
import java.util.Scanner; 
import java.util.Random;
public class Main
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
      
        int mysteryNumber;
           mysteryNumber = (int) (Math.random() * 9 + 1);// set the range from 1 to 10;
           
           Scanner keyboard = new Scanner(System.in);
        
           /*initialise instance variables*/
            int guess = 0;
            int count = 0;
            int previous_guess;
           
            System.out.println("I am thinking of a number from 1 to 10 ... guess what it is ?");
            //System.out.println("the answer is " + mysteryNumber);//delete it later
            /* Apply do-while here.
             * In do part, I will put all codes related with fall guess condition because most program requirements and parameter change are 
             * relative to the fall guess condition. 
             * It will be more clear  */
        do{
           
            previous_guess = guess;
            
            System.out.print("Enter a guess: ");

            guess = keyboard.nextInt();
            
           

            System.out.println("Your guess is " + guess);
            
             if ( count == 0) {
                   count= count +1;
                } 
                else if (previous_guess == guess){
                    count = count; 
                }
                else {
                    count = count +1;
                }
                    

             
           if (guess < mysteryNumber ){

                  System.out.println("Your guess is too smaller and you have guess " + count + " times.");
                }
           else if (guess > mysteryNumber ){

                  System.out.println("Your guess is too greater and you have guess " + count + " times.");
                  
                }
           
          /* if ( count == 0) {
                   count= count +1;
                } 
                else if (previous_guess == guess){
                    count = count; 
                }
                else {
                    count = count +1;
                }*/
                    
              // count = (previous_guess == guess) ? count: (count +1); // simple way to express if else condition.
            
      }  while (guess != mysteryNumber);
         
          if (guess == mysteryNumber){

                  System.out.println("Your guess is correct. Congratulations!");

                }//no much work need to be here.

}}
        
  
