package sorting.com;
import java.util.ArrayList;
import java.util.List;

/* Asked in google , microsoft   , Amazon
https://leetcode.com/problems/find-all-duplicates-in-an-array/
**/

class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {

        // shorting short arrays swap all elements
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] -1;

            if(nums[i] != nums[correct]){
                swap(nums , i , correct );
            }else{
                i++;
            }
        }  // loop s bahar aa gaye !!

        // find duplicates in swapped array and return it
        List<Integer> duplicates = new ArrayList<>();

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                  duplicates.add(nums[j]);
            }
        }
        return duplicates;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}