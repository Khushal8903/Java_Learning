
class Solution {

    public int secondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        boolean f = false;
        for (int i : nums) {
            if (i > max) {
                smax = max;
                max = i;
                if (smax == Integer.MIN_VALUE) {
                    f = true;
                }
            } else if (i > smax && i != max) {
                smax = i;
            }
        }

        if (Integer.MIN_VALUE == smax) {
            return -1;
        }

        return smax;
    }
}
