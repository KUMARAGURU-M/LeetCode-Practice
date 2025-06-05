class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] smap=new int[26];
        for(int i=0;i<s.length();i++){
            smap[s.charAt(i)-'a']++;
            smap[t.charAt(i)-'a']--;
        }
        for(int i:smap){
            if(i!=0)return false;
        }
        return true;
    }
}
