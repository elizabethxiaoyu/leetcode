import java.util.ArrayList;

public class P101SymmetricTree {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}


	public static void main(String[] args) {
		P101SymmetricTree p = new P101SymmetricTree();
		TreeNode root = p.new TreeNode(1);
		System.out.println(isSymmetric(root));
	}

	public static boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;
		return isSymmetricHelp(root.left,root.right);
	}
	
	public static boolean isSymmetricHelp(TreeNode left, TreeNode right){
		if(left == null || right == null)
			return left == right;
		if(left.val != right.val)
			return false;
		return isSymmetricHelp(left.right,right.left) && isSymmetricHelp(left.left,right.right);
	}

}
