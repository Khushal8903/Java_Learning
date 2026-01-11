
public class Q10 {

    public int firstUniqChar(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            String s2 = s.substring(0, i) + s.substring(i + 1);
            if (!s2.contains(String.valueOf(s.charAt(i)))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Q10 obj = new Q10();
        String str = "aabbe";
        System.out.println(obj.firstUniqChar(str));
    }

}
