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
                String lastWord = "";
                for (int i = 0; i < word.length(); i++){
                    lastWord = word.charAt(i) + lastWord;
                }
                if (lastWord.equals(word)){
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
                System.out.println(word);
            } else if(choice == 2){
                System.out.println("String Multiplier");
                System.out.print("Enter your string: ");
                String word = input.nextLine();
                System.out.print("Enter the number of times: ");
                int count = input.nextInt();
                for (int i =0; i < count; i++){
                    System.out.print(word+"\n");
                }
                // TODO Your String Multiplier code goes here

            } else if(choice == 3){
                System.out.println("String Occurrence Count");
                System.out.print("Enter your string: ");
                String word = input.nextLine();
                System.out.print("Enter your substring: ");
                String substr = input.nextLine();
                System.out.println(word.split(substr, -1).length-1);
                // TODO Your String Occurrence code goes here

            } else if(choice == 4){
                System.out.println("Vowel Count");
                System.out.print("Enter your string: ");
                String word = input.nextLine();
                String wordLower = word.toLowerCase();
                int count = 0;
                for (int i = 0; i < word.length(); i++){
                    if (wordLower.charAt(i)=='a' || wordLower.charAt(i)=='e' || wordLower.charAt(i)=='i' || wordLower.charAt(i)=='o' || wordLower.charAt(i)=='u'){
                        count++;
                        System.out.println(count);
                    }

                }

            } else {
                break;
            }
        }

        input.close();
    }
}
