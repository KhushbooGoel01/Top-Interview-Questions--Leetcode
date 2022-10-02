

public class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int[] win = new int[k];
        for (int i = 0; i < k; i ++)
        {
            win[i] = nums[i];
        }
        Arrays.sort(win);
        double med = (double)(win[k/2]) / 2 + (double)win[(k - 1)/2] / 2;
        double[] res = new double[nums.length - k + 1];
        PriorityQueue<Integer> left = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<Integer>();
        for (int i = 0; i < k; i ++) {
            if ((double)nums[i] <= med) {
                left.add(nums[i]);
            }
            else {
                right.add(nums[i]);
            }
        }
        res[0] = med;
        for (int i = k; i < nums.length; i ++)
        {
            if (nums[i] <= med) {
                left.add(nums[i]);
            }
            else {
                right.add(nums[i]);
            }
            int remove = nums[i - k];
            if (remove <= med) {
                left.remove(remove);
            }
            else {
                right.remove(remove);
            }
            while (left.size() < right.size()) 
            {
                left.add(right.poll());
            } 
            while (left.size() > right.size() + 1) 
            {
                right.add(left.poll());
            }
            if (left.size() == right.size()) 
            {
                med = (double)left.peek() / 2 + (double)right.peek() / 2;
            }
            else 
            {
                med = left.peek();
            }
            res[i - k + 1] = med;
        }
        return res;
    }
}
