package String_1;

public class FindMaxMin {
    
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,4,3,12,213,123,123,13,0,-10};
        int max=nums[0], min=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        System.out.println("Max: "+max+"\nMin: "+min);
    }
}
