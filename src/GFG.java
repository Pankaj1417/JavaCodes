import java.util.ArrayList;
import java.util.List;

// Java implementation of the approach
class GFG {

    // Class for a node of
    // the linked list
    static class Node {
        // Data and the pointer
        // to the next node
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    List<Integer> ans = new ArrayList<>();
    void dfs(Node root , String s){
        if(root == null){
            // convrting string to integer and storing inside the vector named ans
            ans.add(Integer.parseInt(String.valueOf(s)));
            return;
        }
        // adding the value of root to string
        s = s+root.data;
        dfs(root.left,s);
        dfs(root.right,s);
    }


}
