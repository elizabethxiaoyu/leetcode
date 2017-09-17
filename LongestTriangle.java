import java.util.Arrays;

public class LongestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxTri(int[] lens){
		Arrays.sort(lens);
		int l1,l2,l3;
		int result = -1;
		for(int i = lens.length-1;i>1;i--){
			if(lens[i] < lens[i-1] + lens[i-2]){
				result = lens[i] +lens[i-1] + lens[i-2];
			}
		}
		return result;	
		
		
	}
}
