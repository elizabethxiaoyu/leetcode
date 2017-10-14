import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P118PascalsTriangle {
	public static void main(String[] args) {

	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
			if(numRows == 0)
				return result;
			List<Integer> pre = null, row = null;
			for(int i = 0 ;i< numRows;i++){
				row = new ArrayList<Integer>();
				for(int j = 0; j<= i;j++){
					if(j ==0 || j ==i)
						row.add(j,1);
					else
						row.add(j, pre.get(j-1) + pre.get(j));
				}
				pre = row;
				result.add(row);
			}
				
			return result;
	}
}
