class min_window_substring {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        int[] need = new int[128];
        for (char c : t.toCharArray()) need[c]++;

        int left = 0, right = 0;
        int missing = t.length();
        int start = 0, minLen = Integer.MAX_VALUE;

        while (right < s.length()) {
            char r = s.charAt(right);
            if (need[r] > 0) missing--;
            need[r]--;
            right++;

          
            while (missing == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char l = s.charAt(left);
                need[l]++;
                if (need[l] > 0) missing++;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}