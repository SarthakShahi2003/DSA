public class Isomorphic_strings {//T.C=O(n^2)
    public static boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (t.charAt(i) != t.charAt(j)) return false;
                }
                if (s.charAt(i) != s.charAt(j)) {
                    if (t.charAt(i) == t.charAt(j)) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println("Brute Force: Are \"" + s + "\" and \"" + t + "\" isomorphic? " + isIsomorphic(s, t));
    }
}

/*  Better Approach T.C=O(N)
public class TwoArrayIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        int[] posS = new int[256];
        int[] posT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (posS[chS] != posT[chT]) return false;

            posS[chS] = i + 1;
            posT[chT] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println("Two Array: Are \"" + s + "\" and \"" + t + "\" isomorphic? " + isIsomorphic(s, t));
    }
}
*/
