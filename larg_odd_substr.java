 public class larg_odd_substr {
     public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }



    public static void main(String[] args) {
        larg_odd_substr sol = new larg_odd_substr();

        String num1 = "35420";
        String num2 = "4206";
        String num3 = "731";

        System.out.println("Input: " + num1 + " → Output: " + sol.largestOddNumber(num1));
        System.out.println("Input: " + num2 + " → Output: " + sol.largestOddNumber(num2));
        System.out.println("Input: " + num3 + " → Output: " + sol.largestOddNumber(num3));
    }
 }
