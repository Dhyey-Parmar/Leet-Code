class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set=new HashSet<>();
        StringBuilder str=new StringBuilder();
        String ref[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                str.append(ref[words[i].charAt(j)-'a']);
            }
            set.add(str.toString());
            str.setLength(0);
        }
        return set.size();
    }
}