import java.util.Arrays;
import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str= scan.nextLine();
        char strArr[]=str.toCharArray();
        System.out.println("String in Alphabetically");
        Arrays.sort(strArr);
        System.out.println(strArr);
    }
}
