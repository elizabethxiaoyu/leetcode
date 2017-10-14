class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class P111MinimumDepthofBinaryTree {

	public static void main(String[] args) {
			TreeNode root = new TreeNode(1);
			TreeNode right = new TreeNode(2);
			root.left = right;
			System.out.println(minDepth(root));
			
	}

	public static int minDepth(TreeNode root) {
		if(root  == null)
			return 0;
		if(root.left == null && root.right != null )
			return minDepth(root.right) +1;
		else if(root.left != null && root.right == null)
			return minDepth(root.left)+1;
		else if(root.left == null && root.right == null)
			return 1;
		else
		return (Math.min(minDepth(root.left), minDepth(root.right))+1);
	}
}
