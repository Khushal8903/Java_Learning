
public class Q8 {

    public String reverseWords(String s) {
        String s1 = s.replaceAll("\\s+", " ");
        int idx = s1.length();
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1.charAt(i) == ' ') {

                String s2 = s1.substring(i + 1, idx);
                sb.append(s2).append(" ");
                idx = i;
            }
        }
        sb.append(s1.substring(0, idx));
        return sb.toString();
    }

    public static void main(String[] args) {
        Q8 obj = new Q8();
        String str = "the sky is blue";
        System.out.println(obj.reverseWords(str));
    }
}
