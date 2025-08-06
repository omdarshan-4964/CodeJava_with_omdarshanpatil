public class reverseStringTUF {
    public static String reverseWords(String s) {
        char ch[]= s.toCharArray();

        for(int i = ch.length - 1 ; i >=0; i--) {
            System.out.print(ch[i]);
        }
        return  s;
    }

    public static void main(String[] args) {
        String s = "welcome to the jungle";
        reverseWords(s);
    }
}

