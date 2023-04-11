//leetcode 392
public class subseq {
	public static void main(String[] args) {
		sub("abc","");
	}
	public static void sub(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		sub(s.substring(1),ans);
		sub(s.substring(1),ans+s.charAt(0));
	}
}
