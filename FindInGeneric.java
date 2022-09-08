import java.util.*;
import java.lang.*;

class FindInGeneric{
    
    public static class Node{
        int val;
        ArrayList<Node> children=new ArrayList<>();
    }
    
    public static boolean findInGenericTree(Node root ,int data){
        
         /* Queue<Node>q=new LinkedList<>();
        q.add(root);
        
        while(q.size()>0){
            Node node =q.remove();
            if(node.val==data){
                return true;
            }
            
            for(int i=0;i<node.children.size();i++){
                q.add(node.children.get(i));
            }
        }
        return false;
        */
        
       if(root.val==data)
           return true;
           
           boolean ans=false;
           
           for(int i=0;i<root.children.size();i++){
               ans=ans || findInGenericTree(root.children.get(i),data);
           }
           
           return ans;
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
        
        
        Scanner scn=new Scanner(System.in);
        System.out.println(" enter any number");
        int data=scn.nextInt();
        boolean ans=findInGenericTree(root,data);
        System.out.println(ans);
    }
}

