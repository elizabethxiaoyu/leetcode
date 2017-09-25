
public class P8888MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = {0};
		int[] nums2 = {1};
		merge(nums1,0,nums2,1);
		for(int i : nums1){
			System.out.println(i);
		}
	}

	public static  void merge(int[] nums1, int m, int[] nums2, int n) {
		if(n ==0)
			return ;
		
		int[] result = new int[m+n];
		int i = 0; 
		int j = 0;
		int index = 0;
		while(i < m && j <n){
			if(nums1[i] < nums2[j]){
				result[index++] = nums1[i];
				i++;
			}else{
				result[index++] = nums2[j];
				j++;
			}
		}
		while(i < m){
			result[index++] = nums1[i++];
		}
		while(j < n){
			result[index++]  = nums2[j++];
		}
		for(int k = 0; k< result.length;k++){
			nums1[k] = result[k];
		}
	}
}
