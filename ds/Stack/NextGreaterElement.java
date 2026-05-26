public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans1=new int[nums1.length];
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> s=new Stack<>();

    for(int i=nums2.length-1;i>=0;i--){
        // do not change the seq of popping, top and isEmpty check
            while(!s.isEmpty() && s.peek()<=nums2[i]){
                s.pop();
            }
            if(!s.isEmpty() && s.peek()>nums2[i]){ 
                map.put(nums2[i],s.peek());
            }
        
        if(s.isEmpty()){
            map.put(nums2[i],-1);
        }
        s.push(nums2[i]);
    }
    for(int i=0;i<nums1.length;i++){
        ans1[i]=map.get(nums1[i]);
    }
    return ans1;
}
