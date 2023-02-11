//WRITE A PROGRAM TO REVERSE A STRING WHILE PRESERVING THE POSITION.
public class Question_3 {
    public static void main(String[] args) {
        // Think Twice===>kniht eciwt
        String str1 = new String("Think Twice");
        String str2 = new String("");
        str1 = str1.toLowerCase();
        String[] strArr = str1.split(" ");
        for (String str3 : strArr) {
            for (int i = str3.length() - 1; i >= 0; i--) {
                str2 = str2 + str3.charAt(i);
            }
            str2 = str2 + " ";
        }
        System.out.println(str2);
    }
}
