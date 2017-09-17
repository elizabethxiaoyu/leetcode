
public class ReverseInteger {

	public static void main(String[] args) {
		ReverseInteger r = new ReverseInteger();
		System.out.println(r.reverse(1221));
	}

	public boolean reverse(int x) {
		int result = 0;
		int tag = 0;
		int old = x;
		if(x < 0)
			return false;
		if(x ==0)
			return true;
		while(x !=0){
			tag = x % 10;
			int newresult  =  result *10 + tag;
			if((newresult - tag)/10 != result)
				return  false;
			result = newresult;
			x = x /10;
			
		}
		if( result == old)
			return true;
		else
			return false ;
	}

}
