
import java.util.ArrayList;
import java.util.Arrays;

class CheckiftheArrayisSorted {

    public static void main(String[] args) {
        CheckiftheArrayisSorted solution = new CheckiftheArrayisSorted();
        boolean result = solution.isSorted(solution.nums);
        System.out.println("Is the array sorted? " + result);
    }
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 5));

    public boolean isSorted(ArrayList<Integer> nums) {

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) > nums.get(i)) {
                return false;
            }
        }
        return true;
    }
}
