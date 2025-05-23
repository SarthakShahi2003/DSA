public class RemOutPara {
    public String removeOuterParentheses(String s) {
        int cnt = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                cnt--;
            }
            if (cnt != 0) {
                ans.append(s.charAt(i));
            }
            if (s.charAt(i) == '(') {
                cnt++;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        RemOutPara sol = new RemOutPara();

        // Test case
        String input = "(()())(())";
        String result = sol.removeOuterParentheses(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
