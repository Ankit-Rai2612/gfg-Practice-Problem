class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        
        // Find minimum and maximum
        for (int num : arr) {
            if (num < mini) mini = num;
            if (num > maxi) maxi = num;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(mini);
        result.add(maxi);
        return result;
    }
}
