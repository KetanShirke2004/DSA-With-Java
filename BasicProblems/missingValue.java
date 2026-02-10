public class missingValue {

    public static int findMissing(int[] nums) {
        int n = nums.length;

        // sort
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int expected = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] != expected){
                return expected;
            }
            expected++;
        }

        return expected;
    }

    public static void main(String[] args) {

        int[] nums = {3,0,1};

        int result = findMissing(nums);

        System.out.println("Missing number is: " + result);
    }
}
