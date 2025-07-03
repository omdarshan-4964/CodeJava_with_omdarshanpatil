
public class Strings {
    public static void printLetters(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str) {
        for(int i = 0; i <= str.length() / 2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
        int X = 0, Y = 0;
        for(int i =0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if ( dir == 'E') { X++; }
            if ( dir == 'W') { X--; }
            if ( dir == 'N') { Y++; }
            if ( dir == 'S') { Y--; }
        }

        int X2 = X * X;
        int Y2 = Y * Y;

        return (float) Math.sqrt(X2 + Y2);
    }


    public static void main(String[] args) {

        //  3. String Length => length() is a function.
            String fullname2 = "Omdarshan Shindepatil";
            System.out.println(fullname2.length());
        
         
        System.out.println();
         //  5.Concatenation // 
            String firstname = "Omdarshan";
            String lastname = "Shindepatil";

            String fullname = firstname + " " + lastname;
            System.out.println(firstname);
            System.out.println(lastname);
            System.out.println(fullname);
         
        System.out.println();
        // 6.String Char At method.
            String fullname1 = "Omdarshan Shindepatil";
            printLetters(fullname1);
         
        System.out.println();
        // 7. Check If String Is Palindrome
            String str = "racecar";
            String str1 = "Shindepatil";
            System.out.println(isPalindrome(str));
            System.out.println(isPalindrome(str1));

        System.out.println();
        // 8. Shortest Path
            String path = "EEENNNN";
            System.out.println(getShortestPath(path));

        System.out.println();
        // 9. String function   


        

        

        


        
        

    }
}
