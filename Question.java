import java.util.*;
public class Question {
    // palindrome 
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not a palindrome
                return false;

            }
           
        }
         return true;
    }

    // Question - Shortest Path
    public static float shortestpath(String path) {
        int x = 0, y = 0;

        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i); // direction
            //South
            if(dir == 'S') {
                y--;
            }
            //North
            else if(dir == 'N') {
                y++;
            }
            //West
            else if(dir == 'W') {
                x--;
            }
            //East
            else {
                x++;
            }
        }
        // squeare root 
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 +Y2);
    }
   
    public static void main(String args[]) {

        // Check if string is palindrome 
        // String str = "racecar";
        // System.out.println(isPalindrome(str));
        System.out.println(shortestpath (path));
    }
}