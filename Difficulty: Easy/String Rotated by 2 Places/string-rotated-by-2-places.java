class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        if (s1.length() != s2.length()) {
            return false;
        }

        // If the length of the strings is less than or
        // equal to 2, simply check if they are equal.
        if (s1.length() <= 2 || s2.length() <= 2) {
            return s1.equals(s2);
        }

        // Initialize strings to store the clockwise and
        // anti-clockwise rotations of str2.
        String clockRot = "";
        String anticlockRot = "";
        int len = s2.length();

        // Store the anti-clockwise rotation of str2 by
        // concatenating the last 2 characters to the
        // beginning.
        anticlockRot = s2.substring(len - 2)
                       + s2.substring(0, len - 2);

        // Store the clockwise rotation of str2 by
        // concatenating the first 2 characters to the end.
        clockRot = s2.substring(2) + s2.substring(0, 2);

        // Check if either the clockwise or anti-clockwise
        // rotation of str2 is equal to str1, and return the
        // result.
        return s1.equals(clockRot)
            || s1.equals(anticlockRot);
    }
}