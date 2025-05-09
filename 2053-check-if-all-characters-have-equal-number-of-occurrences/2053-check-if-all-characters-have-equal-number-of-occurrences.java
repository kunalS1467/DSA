class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        int min =0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;   
            min =arr[s.charAt(i)-'a'];
        }
      
        for(int i=0;i<26;i++){
            if(arr[i]!=0 && arr[i]!=min)return false;  
        }
        return true;
    }
}