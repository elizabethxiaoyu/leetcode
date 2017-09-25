
public class P108ConvertSortedArraytoBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length ==0)
			return null;
		TreeNode head = Helper(nums, 0, nums.length-1);
		return head;
	}

	public  TreeNode Helper(int[] nums, int low, int high) {
		if (low > high)
			return null;
		int mid = (low + high) / 2;

		TreeNode root = new TreeNode(nums[mid]);
		root.left = Helper(nums,low,mid-1);
		root.right = Helper(nums, mid+1, high);
		return root;
	}
}
