import java.util.HashMap;


public class HashTable {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        System.out.println(map.get("a"));
        System.out.println(map.containsKey("b"));
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        inorderTraversal(root);
    }

   static class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
static void inorderTraversal(TreeNode root){
        if(root!=null){
            inorderTraversal(root.left);
            System.out.print(root.val+" ");
            inorderTraversal(root.right);
        }
}
}