//#Question : https://leetcode.com/problems/generate-parentheses/

class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<String>();
		
		for (int i = (int)Math.pow(2, 2*n-1); i < (int)(Math.pow(2, 2*n)-1); i = i + 2) {
			Stack<Character> s = new Stack<Character>();
			StringBuffer b = new StringBuffer();
			int tmp = i;
			while (tmp > 0) {
				if (tmp % 2 == 1)	{	
					b.append(')');
					if (s.isEmpty() || s.pop() != ')') {	
						break;
					}
				}
				else {
					b.append('(');
					s.push(')');
				}
				tmp = tmp / 2;
			}
			if (s.isEmpty() && b.length() == 2 * n) {
				list.add(b.toString());
			}
		}
		
		return list;
    }
}
