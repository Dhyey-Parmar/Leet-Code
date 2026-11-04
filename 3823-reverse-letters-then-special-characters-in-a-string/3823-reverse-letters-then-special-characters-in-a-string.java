class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Step 1: Reverse only lowercase letters
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !isLetter(arr[left])) {
                left++;
            }
            while (left < right && !isLetter(arr[right])) {
                right--;
            }
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Step 2: Reverse only special characters
        left = 0;
        right = n - 1;
        while (left < right) {
            while (left < right && isLetter(arr[left])) {
                left++;
            }
            while (left < right && isLetter(arr[right])) {
                right--;
            }
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }

    private boolean isLetter(char c) {
        return c >= 'a' && c <= 'z';
    }
}