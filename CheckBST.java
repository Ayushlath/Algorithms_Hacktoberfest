
class BinaryTree {
    static class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value; 
        } 
    }
    public static boolean isValidBST(Node root) {
        return isValidBST(root, null, null);
    }
    public static boolean isValidBST(Node root, Integer max, Integer min) {
        if (root == null) return true; 
        if (max != null && root.value >= max) return false;
        if (min != null && root.value <= min ) return false;
        return isValidBST(root.left, root.value, min) && 
            isValidBST(root.right, max, root.value);
    }  
    public static void main( String args[] ) {
        Node root = new Node(10); 
        root.left = new Node(5); 
        root.right = new Node(15); 
        root.left.left = new Node(2); 
        root.left.left.left = new Node(1); 
        root.left.right = new Node(7);
        root.right.left = new Node(13);
        root.right.left.right = new Node(14);
        root.right.right = new Node(21);

        if (BinaryTree.isValidBST(root))
            System.out.println("A valid BST");
        else 
            System.out.println("Not a valid BST");
    }
}

//Time Complexity::O(N)
//Space Complexity::O(N)
