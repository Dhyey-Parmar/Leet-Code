class Solution {
    
    public int totalNumbers(int[] digits) {
        int freq[] = new int[10];

        for(int i = 0; i < digits.length; i++){
            freq[digits[i]]++;
        }

        HashSet<Integer> map = new HashSet<>();

        for(int i = 1; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                for(int k = 0; k < 9; k += 2){

                    if(freq[i] == 0) continue;
                    freq[i]--;

                    if(freq[j] == 0){
                        freq[i]++;
                        continue;
                    }
                    freq[j]--;

                    if(freq[k] == 0){
                        freq[j]++;
                        freq[i]++;
                        continue;
                    }
                    freq[k]--;

                    int num = i * 100 + j * 10 + k;
                    map.add(num);

                    freq[k]++;
                    freq[j]++;
                    freq[i]++;
                }
            }
        }

        return map.size();
    }
}