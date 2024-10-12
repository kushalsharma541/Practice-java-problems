
import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        // first input array from user

        System.out.println("Please input first String ");

        String firstStr = scanner.nextLine();


         // Scecon input array from user

         System.out.println("Please input first String ");

         String secondStr = scanner.nextLine();

         // call the checkAnagram method

         boolean isAnagram = checkanagram(firstStr, secondStr);

         //print the output 

         if(isAnagram){

            System.out.println(firstStr + "and " + secondStr + " ara anagram");
            
         }else{

         System.out.println(firstStr + "and " + secondStr + " are not anagram");

        }

        scanner.close();

    }

    public static boolean checkanagram(String str1, String str2){

        str1 = str1.replaceAll("\\s+", "").toLowerCase();

        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // check the length of the strings

        if(str1.length() != str2.length()){
            return false;
        }

        //conerting the string into charArray

        char[] charArray1 = str1.toCharArray();

        char[] charArray2 = str2.toCharArray();


        //Sorting the char array for further 

        Arrays.sort(charArray1);

        Arrays.sort(charArray2);

        // check if both are equal

        return Arrays.equals(charArray1, charArray2);


    }
    
}
