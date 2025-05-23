public class brakets_max_dept {
     public int maxDepth(String s) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                current++;
                if (current > max) {
                    max = current;
                }
            } else if (s.charAt(i) == ')') {
                current--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        brakets_max_dept sol = new brakets_max_dept();
        String input = "(1+(2*3)+((8)/4))+1";
        int result = sol.maxDepth(input);
        System.out.println("Maximum Nesting Depth: " + result);
    }

}
