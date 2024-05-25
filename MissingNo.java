public class MissingNo {
    public static void main(String args[]) {
        int nums[] = {1,2,3,5,6};
        int n = nums.length;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        
        System.out.println("Missing no: " + ((((n + 1) * (n + 2)) / 2) - sum));
    }
}

