import java.util.*;
public class Strings{
    // SBSTRING FUNC

    public static String substring(String str, int si, int ei){
        String substr = ""; // empty substring
        for(int i=si; i<ei; i++) { // strting index to end index loop chalge
        substr += str.charAt(i);


        }
        return substr;
    }


    // funtion print full name
    // public static void printLetters(String str) {
    //     for(int i=0; i<str.length(); i++) {
    //         System.out.println(str.charAt(i));
    //     }
          
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // // String are immutable
        // // Input Output in String 

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine(); // next sirf word leta hai nextline poora line leta hai 
        // System.out.println(name);

        // String length 

        // String fullname = "Klamuddin Khan";
        // System.out.println(fullname.length());

        // Concatenation

        // String firstName = "Klamuddin";
        // String lastName = "Khan";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

      // String function compare

        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if(s1 == s2) {
        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }

        // if(s1 == 3) {
        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }
                
        // if(s1.equals(s3)) { // .equal compare value but == compare values
        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }

        // SUBTRING 
        String str = "HelloWorld";
        // System.out.println(str.subString(0, 5));
        System.out.println(substring(str, 0, 5));

        // STRINGBUILDER 

        // public static void main(String args[]) {
        //     StringBuilder sb = new StringBuilder("");
        //     for(char ch = 'a'; ch<='z'; ch++) {
        //         sb.append(ch);
        //     }// abcdefgh
        //     System.out.println(sb);
        }

    }
