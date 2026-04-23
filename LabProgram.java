import java.util.Scanner;

public class LabProgram {

   public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
      int count = 0;
      for (int i = 0; i < listSize; i++) {
         if (wordsList[i].equalsIgnoreCase(currWord)) {
            count++;
         }
      }
      return count;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numWords;
      String[] words = new String[20]; // Maximum size as per requirements

      numWords = scnr.nextInt();

      for (int i = 0; i < numWords; i++) {
         words[i] = scnr.next();
      }

      for (int i = 0; i < numWords; i++) {
         int frequency = getWordFrequency(words, numWords, words[i]);
         System.out.println(words[i] + " " + frequency);
      }
   }
}