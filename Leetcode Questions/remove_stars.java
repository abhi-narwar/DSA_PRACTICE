class remove_stars {
    public String removeStars(String s) {
        StringBuilder st = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                st.deleteCharAt(st.length() - 1); 
            } else {
                st.append(c); 
            }
        }

        return st.toString();
    }
}
