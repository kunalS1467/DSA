class TrieNode{
    TrieNode[] a= new TrieNode[26];
    int count = 0;
    boolean isEndofWord;
}
class Solution {
    TrieNode root;

    public String longestCommonPrefix(String[] strs) {
        root = new TrieNode();
        for(String str : strs){
            insertTrieNode(str,root);
        }
        String res="";
        while(true){
            int count =0;
            TrieNode next = null;
            
            if(root.isEndofWord)break;
            char cd=' ';
            for (int i = 0; i < 26; i++) {
                if (root.a[i] != null) {
                    count++;
                    next = root.a[i];
                    cd=(char)('a'+i);
                }
            }  
            if (count != 1) {
                break;
               }
               res+= cd;
               root=next;
        }
        return res;
    }
    public void insertTrieNode(String prefix, TrieNode root){
        for(int i=0;i<prefix.length();i++){
            int c= prefix.charAt(i)-'a';
            if(root.a[c]==null){
                root.a[c] = new TrieNode();
                root.count+=1;
            }
            root =root.a[c];
        }
        root.isEndofWord = true;
    }
}