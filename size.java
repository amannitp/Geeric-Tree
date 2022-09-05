import java.util.*;


class size{
    
    public static class Node{
        int val;
        ArrayList<Node> children=new ArrayList<>();
    }
    
    public static void display(Node root){
    
        String ans="";
        ans+=root.val;
        ans+="->";
        
        for(int i=0;i<root.children.size();i++){
            ans+=root.children.get(i).val;
            ans+=",";
        }
        ans+=".";
        System.out.println(ans);
        
        for(int i=0;i<root.children.size();i++){
            display(root.children.get(i));
        }
        
    }
    
    public static int size(Node root){
        
        int ans=0;
        for(int i=0;i<root.children.size();i++){
             ans+= size(root.children.get(i));
        }
        
        return ans+1;
    }
    
    public static void main(String[]args){
        
        Node root=new Node();
        root.val=5;
        
        Node a=new Node();
        a.val=6;
        
        Node b=new Node();
        b.val=4;
        
        Node c=new Node();
        c.val=3;
        
        Node d=new Node();
        d.val=2;
        
        Node e=new Node();
        e.val=1;
        
        root.children.add(a);
        root.children.add(b);
        
        a.children.add(c);
        a.children.add(d);
        b.children.add(e);
        
        
        //display(root);
        int res=size(root);
        System.out.println(res);
        //System.out.println(root.children.size());
        //System.out.println(b.children.size());
    }
}