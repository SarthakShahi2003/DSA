public class Rotate_string {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            // Rotate string left by 1
            s = s.substring(1) + s.charAt(0);
            
            // Check if current rotation matches goal
            if (s.equals(goal)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "abcde";
        String goal1 = "cdeab";

        String s2 = "abc";
        String goal2 = "acb";

        System.out.println("Test 1: " + rotateString(s1, goal1)); // true
        System.out.println("Test 2: " + rotateString(s2, goal2)); // false
    }
}
