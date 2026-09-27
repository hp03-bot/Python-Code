class Solution {
    public String reverseParentheses(String s) {
        StringBuilder answer = new StringBuilder();
        java.util.Deque<Integer> starts = new java.util.ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                starts.push(answer.length());
            } else if (ch == ')') {
                int left = starts.pop();
                int right = answer.length() - 1;

                while (left < right) {
                    char temp = answer.charAt(left);
                    answer.setCharAt(left, answer.charAt(right));
                    answer.setCharAt(right, temp);

                    left++;
                    right--;
                }
            } else {
                answer.append(ch);
            }
        }

        return answer.toString();
    }
}