class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] s = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set=new HashSet<>();
        int ct=0;
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                sb.append(s[words[i].charAt(j)-'a']);
            }
            if(!set.contains(sb.toString())){
                set.add(sb.toString());
                ct++;
            }
        }
        return ct;
    }
}