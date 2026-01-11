
public class Q7 {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                sb.append(ch);
            }
        }
       String s1 = sb.toString().toLowerCase();
       
        StringBuilder s2 = new StringBuilder(s1);
        String s3 = s2.reverse().toString();
        return s1.equals(s3);

    }

    public static void main(String[] args) {
        Q7 obj = new Q7();
        String str = "A man, a plan, a canal: Panama";
        System.out.println(obj.isPalindrome(str));
    }
}
