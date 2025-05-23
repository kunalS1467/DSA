class Solution {
    public String reverseWords(String s) {
       StringBuilder sb = new StringBuilder();
       String res ="";
       for(int i=s.length()-1;i>=0;i--){
        char c = s.charAt(i);
        if(c!=' '){
            res=c+res;
            if(res.length()==1 && sb.length()>0){
                sb.append(" ");
            }
        }
        else
           if(res.length()>0){
            sb.append(res);
            res = new String();
           }
       }
       if(res.length()>0){
        sb.append(res);
       }
       return sb.toString();
    }
}