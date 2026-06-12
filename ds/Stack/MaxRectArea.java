class Solution {
    public static int getMaxArea(int arr[]) {
     // 2 stack, 3 array 
     // arr[i]=height
    int len=arr.length;
    int[] nsl=new int[len];
    int[] nsr=new int[len];
    int[] ans=new int[len];
    Stack<int[]> ls=new Stack<>();
    Stack<int[]> rs=new Stack<>();
    
    for(int i=0;i<len;i++){
        //need small
        while(!ls.isEmpty() && ls.peek()[0]>=arr[i]){
           ls.pop(); 
        }
        if(!ls.isEmpty() && ls.peek()[0]<arr[i]){
            nsl[i]=ls.peek()[1];
        }
        if(ls.isEmpty()){
            nsl[i]=-1; 
        }
        ls.push(new int[]{arr[i],i});
      }
    for(int i=len-1;i>=0;i--){
        
        while(!rs.isEmpty() && rs.peek()[0]>=arr[i]){  //need small remove equal or larger
           rs.pop(); 
        }
        if(!rs.isEmpty() && rs.peek()[0]<arr[i]){
            nsr[i]=rs.peek()[1];
        }
        if(rs.isEmpty()){
            nsr[i]=arr.length;
        }
        rs.push(new int[]{arr[i],i});
    }
    int max=0;
    for(int i=0;i<len;i++){
        ans[i]=arr[i]*(nsr[i]-nsl[i]-1);
        if(max<ans[i]){
            max=ans[i];
        }
    }
    return max;
        
    }
}
