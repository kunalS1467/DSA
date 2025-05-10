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
        String common ="";
        for(int i=0;i<prefix.length();i++){
           if(find.contains(prefix.substring(0,i+1))){
                if(find.indexOf(prefix.substring(0,i+1))==0)
                    common = prefix.substring(0,i+1);
           }
        }
        return common;
    }
    
}