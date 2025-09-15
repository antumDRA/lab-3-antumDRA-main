import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while(true){
      System.out.println("Enter your choice:\n[1] Palindrome Check\n[2] String Multiplier\n[3] String Occurrence Count\n[4] Vowel Count\n[0] Quit");
      System.out.print(">> ");
      int choice = input.nextInt();
      input.nextLine(); // NOTE Processes potential leftover \n
      if(choice == 1){
        System.out.println("Palindrome Check");
        System.out.print("Enter the string to check: ");
        String word = input.nextLine();

        // TODO Your Palindrome code goes here
        
      } else if(choice == 2){
        System.out.println("String Multiplier");
        System.out.print("Enter your string: ");
        String word = input.nextLine();
        System.out.print("Enter the number of times: ");
        int count = input.nextInt();

        // TODO Your String Multiplier code goes here
        
      } else if(choice == 3){
        System.out.println("String Occurrence Count");
        System.out.print("Enter your string: ");
        String word = input.nextLine();
        System.out.print("Enter your substring: ");
        String substr = input.nextLine();
        
        // TODO Your String Occurrence code goes here
        
      } else if(choice == 4){
        System.out.println("Vowel Count");
        System.out.print("Enter your string: ");
        String word = input.nextLine();

        // TODO Your Vowel Count goes here
        
      } else {
        break;
      }
    }

    input.close();
  }
}
