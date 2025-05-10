class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            String find = strs[i];
            prefix = findCommon(prefix, find);
        }
        return prefix;
    }
    public String findCommon(String prefix, String find){
        int i=0;
        for(;i<Math.min(prefix.length(),find.length());i++){
            if(prefix.charAt(i)!=find.charAt(i)){
                break;
            }
        }
        
        return i>0 ? prefix.substring(0,i):"";
    }
    
}