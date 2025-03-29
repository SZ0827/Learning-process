import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {
    public static void main(String[] args) {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        TreeNode node4=new TreeNode(4);
        TreeNode node5=new TreeNode(5);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        System.out.println(new MaxDepth().maxDepth(node1));

    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int maxleft=maxDepth(root.left);
        int maxright=maxDepth(root.right);
        return Math.max(maxleft,maxright)+1;
    }
    public int maxDepth2(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        int ans=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size>0){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                size--;
            }
        }
        return ans;
    }
}
