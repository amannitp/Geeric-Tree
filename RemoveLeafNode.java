import java.util.*;
import java.lang.*;

class RemoveLeafNode{
    
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
    public static void removeLeafNode(Node root){
        
        for(int i=root.children.size()-1;i>=0;i--){
            
            Node node=root.children.get(i);
            
            if(node.children.size()==0){
                root.children.remove(i);
            }else{
                removeLeafNode(node);
            }
        }
    }
    
    public static void main(String[]args){
        
        Node root=new Node();
        root.val=5;
        
        Node a=new Node();
        a.val=10;
        
        Node b=new Node();
        b.val=15;
        
        Node c=new Node();
        c.val=20;
        
        Node d=new Node();
        d.val=25;
        
        Node e=new Node();
        e.val=30;
        
        root.children.add(a);
        root.children.add(b);
        
        a.children.add(c);
        a.children.add(d);
        b.children.add(e);
        
        
        
        //System.out.println(root.children.size());
        //System.out.println(b.children.size());
         //display(root);
        //System.out.println("hello");
        removeLeafNode(root);
        display(root);
    }
}
