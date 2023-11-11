/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        Queue<Node> queue=new LinkedList<Node>();
        Node front=null;
        queue.add(node);
        Node[] arr=new Node[101];
        while(!queue.isEmpty()){
            Node removed=queue.remove();
            Node back=null;
            if(arr[removed.val]!=null){
                back=arr[removed.val];
            }else{
            back=new Node(removed.val);
            arr[removed.val]=back;
            }
            if(front==null){
                front=back;
            }
            
            arr[removed.val]=back;
            back.neighbors=new ArrayList<Node>();
            for(int i=0;i<removed.neighbors.size();i++){
                Node element=removed.neighbors.get(i);
                Node newNode=null;
                if(arr[element.val]!=null){
                    newNode=arr[element.val];
                }else{
                    newNode=new Node(element.val);
                    arr[element.val]=newNode;
                    queue.add(element);
                }
                
                back.neighbors.add(newNode);
            }
        }
        
        return front;
    }
    
}
