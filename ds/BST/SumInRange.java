// leetcode-938
// to find sum of elements in the range low,high (inclusive)
// we use recursion based dfs
public int DFS(int low ,int high,TreeNode temp){
        if(temp==null)
        return 0;
        int sum=0;
        if(temp.val>=low && temp.val<=high){
            sum=temp.val;
            sum += DFS(low , high, temp.right);
            sum += DFS(low , high, temp.left);
        }
        if(temp.val<low)
          sum += DFS(low , high, temp.right);

        if(temp.val>high)
          sum += DFS(low , high, temp.left);
    
    return sum;
    }
