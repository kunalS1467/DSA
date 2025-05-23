class Solution {
    public String reverseWords(String s) {
       StringBuilder sb = new StringBuilder();
       int right= s.length()-1;
       for(int left=s.length()-1;left>=0;){
        char l = s.charAt(left);
        char r = s.charAt(right);
        if(l==' '){
            left--;
            right--;
        }
        else if(left==0 || s.charAt(left-1)==' '){
            sb.append(s.substring(left,right+1)+" ");
            left--;
            right=left;
        }else{
            left--;
        }
       }
       return sb.toString().trim();
    }
}