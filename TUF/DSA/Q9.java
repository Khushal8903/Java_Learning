
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q9 {

    public List<Integer> frequencyCount(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= arr.length; i++) {
            map.put(i, 0);

        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(i, map.get(arr[i]) + 1);
            }
        }

        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i <= map.size(); i++) {
            ar.add(map.get(i));
        }
        return ar;

    }

    public static void main(String[] args) {
        Q9 obj = new Q9();
        int[] arr = {2, 3, 2, 3, 5};
        List<Integer> result = obj.frequencyCount(arr);
        System.out.println(result);
    }
}
