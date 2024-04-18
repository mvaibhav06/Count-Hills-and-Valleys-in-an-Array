import java.util.HashSet;
import java.util.Set;

public class HillsValleys {
    public static int countHillValley(int[] nums) {
        int count = 0;
        Set<Integer> temp = new HashSet<>();
        for(int i=1; i<nums.length-1; i++){
            int j = i-1;
            while(nums[j] == nums[i] && j>0){
                j--;
            }
            int k = i+1;
            while(nums[k]==nums[i] && k<nums.length-1){
                k++;
            }
            if(temp.contains(j) && temp.contains(k)){
                continue;
            }
            temp.add(j);
            temp.add(k);
            if((nums[i]>nums[j] && nums[i]>nums[k]) || (nums[i]<nums[j] && nums[i]<nums[k])){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {8,2,5,7,7,2,10,3,6,2};
        System.out.println(countHillValley(nums));
    }
}
