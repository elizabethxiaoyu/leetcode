import java.util.LinkedList;
import java.util.List;

public class P107BinaryTreeLevelOrderTraversalII {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		traverse(list,root,0);
		return list;
	}

	public static void traverse(List<List<Integer>> list, TreeNode root, int level) {
		if(root == null)
			return;
		if(level >= list.size())
			list.add(0,new LinkedList<Integer>());
		traverse(list,root.left,level+1);
		traverse(list,root.right,level+1);
		list.get(list.size()-level-1).add(root.val);
		
	}
}
