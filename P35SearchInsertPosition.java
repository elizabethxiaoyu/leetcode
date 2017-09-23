import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P35SearchInsertPosition {

	public static void main(String[] args) {
		int nums[] = {};
		System.out.println(searchInsert(nums, 0));
	}

	public static int searchInsert(int[] nums, int target) {
	
			int index = 0;
			for(int i = 0 ;i< nums.length;i++){
				if(target > nums[i]){
					index++;
				}else if(target == nums[i])
					return i;
			}
			return index;
		}
	}

