import java.util.*;
import java.lang.*;

class LevelOrderTraversal{
    
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
    
    public static int getMaximun(Node root){
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<root.children.size();i++){
            
            max=Math.max(getMaximun(root.children.get(i)),max);
        }
        return Math.max(max,root.val);
    }
    
    public static int heigthOfTree(Node root){
        
        int h=-1;
        
        for(int i=0;i<root.children.size();i++){
            
            h=Math.max(heigthOfTree(root.children.get(i)),h);
        }
        return h+1;
    }
    
    // depth first search 
    public static void traversalOfTree(Node root){
        
        System.out.println(" Node Pre "+root.val);
        
        for(int i=0;i<root.children.size();i++){
            System.out.println("Node Edge "+root.children.get(i).val);
            traversalOfTree(root.children.get(i));
            System.out.println("Node Post "+root.children.get(i).val);
        }
    }
    public static void levelOrderTraversal(Node root){
        
        Queue<Node> q=new LinkedList<>();
        
        q.add(root);
        
        while(q.size()>0){
            
            Node data=q.remove();
            System.out.print(data.val+" ");
            
            for(int i=0;i<data.children.size();i++){
                q.add(data.children.get(i));
            }
        }
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
        
        //int height=heigthOfTree(root);
       // System.out.println(height);
       
       //traversalOfTree(root);
       
       levelOrderTraversal(root);
    }
}
