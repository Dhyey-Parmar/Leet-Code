class Solution {
    static String[] belowTwenty = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };
        static String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };
        static String[] thousands = {
            "", "Thousand", "Million", "Billion"
        };
    public static String helper(int n){
        if (n == 0)
            return "";

        if (n < 20)
            return belowTwenty[n];

        if (n < 100)
            return (tens[n / 10] + " " + helper(n % 10)).trim();
            
        return (belowTwenty[n / 100] + " Hundred " + helper(n % 100)).trim();
    }
    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";

        String ans = "";
        int count = 0;

        while (num > 0) {
            int temp = num % 1000;

            if (temp != 0) {
                ans = (helper(temp) + " " + thousands[count] + " " + ans).trim();
            }

            num /= 1000;
            count++;
        }

        return ans.trim();
    }
}