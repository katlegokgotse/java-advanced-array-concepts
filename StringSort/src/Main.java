import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] words = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your words");

        for(int i = 0; i < words.length; i++){
            words[i] = scanner.nextLine();
        }

        sortArray(words);
        //This was coded by chatGPT to be honest, but it is just to display the
        //sorted words
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void sortArray(String[] words){
        /*
         * This for loop is for sorting the information
         * In the for loop we are using the bubble sorting algorithm.
         * Using DSA. So how this works by reading the code
         * The for loop gets the
         */
        String temp = "";
        for(int i = 0; i < words.length - 1; ++i){
            for (int j = 0; j < words.length - 1; ++j) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }
}