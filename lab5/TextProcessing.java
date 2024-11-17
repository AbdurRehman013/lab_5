
package lab.textprocessing;


import java.util.Scanner;

public class TextProcessing {

    public String reverseWord(String word) {
        if (word.isEmpty()) {
            return word;
        }
        return reverseWord(word.substring(1)) + word.charAt(0);
    }

    public static void main(String[] args) {
        TextProcessing textTool = new TextProcessing();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to reverse: ");
        String word = scanner.nextLine();

        String reversedWord = textTool.reverseWord(word);
        System.out.println("Reversed word: " + reversedWord);
    }
}
