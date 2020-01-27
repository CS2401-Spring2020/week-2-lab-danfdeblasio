import java.util.Arrays;

public class Week2 {

	public Week2() {}
	
    /* maxTriple method:
     * Given an array of ints of odd length, look at the first, last, and middle 
     * values in the array and return the largest. The array length will be a least 1.
     */
	public  int maxTriple(int[] A) {
		if (A[0] > A[1]) {
            if (A[0] > A[2]) return A[0];
            else return (A[2] > A[1]? A[2]: A[1]);
        } else {
            if (A[1] > A[2]) return A[1];
            else return (A[2] > A[0]? A[2]: A[0]);   
        }        
    }
	
    /* maxMod method:
     * Given two int values, return whichever value is larger. 
     * However if the two values have the same remainder when divided by 5, then 
     * the return the smaller value. 
     * However, in all cases, if the two values are the same, return 0. 
     * Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
     */
    public  int maxMod5(int n1, int n2) {
        if (n1 == n2) return 0;
        if (n1%5 == n2%5) return (n1<n2? n1: n2);
        return (n1>n2? n1: n2);
    }
    
    /* prefixAgain method:
     * Given a string, consider the prefix string made of the first n chars of the string. 
     * Does that prefix string appear somewhere else in the string? 
     * Assume that the string is not empty and that n is in the range 1..str.length().
     */
    public  boolean prefixAgain(String s, int n) {
        for (int i=0; i<s.length()-n; i++) {
            if (s.substring(i,i+n).equals(s.substring(0,n))) return true;   
        }
        return false;   
    }
    
    /* withoutString method:
     * Given two strings, base and remove, return a version of the base string where 
     * all instances of the remove string have been removed (not case sensitive). 
     * You may assume that the remove string is length 1 or more. 
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     */
    public  String withoutString(String base, String remove) {
        if (remove.length() > base.length()) return base;
        if (base.substring(0,remove.length()).equals(remove)) return            withoutString(base.substring(remove.length()),remove);
        return "" + base.charAt(0) + withoutString(base.substring(1),remove); 
    }
    
}
