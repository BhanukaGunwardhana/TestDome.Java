package Java_Advanced.TestDomeTests;


class Node {
    public int value;
    public Node left;
    public Node right;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public static boolean contains(Node root, int value)  {
        try {
            if(root!=null){
                if(root.getValue()<value){

                    root=root.getRight();
                    return contains(root, value);
                    
                }
                else if(root.getValue()>value){
                    root=root.getLeft(); 
                    return contains(root, value);
                    
                }else if(root.getValue()==value){
                    return true;
                }
                //System.out.println("check_");
                return true;
                
            }else{
                //System.out.println("check");
                return false;}
            
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        
        
       
        
        
    }
    //public class UnsupportedOperationException implements Excep
    
    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
        
        try {
            System.out.println(contains(n2, 3));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
