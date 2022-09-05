import java.util.*;
import java.lang.*;

class Height{
    
    public static class Node{
        int val;
        ArrayList<Node> children=new ArrayList<>();
    }
    
    public static int heigthOfTree(Node root){
        
        int h=-1;
        
        for(int i=0;i<root.children.size();i++){
            
            h=Math.max(heigthOfTree(root.children.get(i)),h);
        }
        return h+1;
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
        
        
        
        
        //System.out.println(root.children.size());
        //System.out.println(b.children.size());
        
        //display(root);
        //int res=size(root);
        //System.out.println(res);
        
        // int max=getMaximun(root);
        // System.out.println(max);
        
        int height=heigthOfTree(root);
        System.out.println(height);
    }
}
