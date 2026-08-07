/* Leetcode-4 
https://leetcode.com/problems/median-of-two-sorted-arrays/description*/

// Brute - force ' t.c = O( (m+n)log(m+n) )
/*  Copy both arrays into a new array.
    Sort the new array.
    Find the median. */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int len=len1+len2;
       
        int isEven=0;
        int[] arr=new int[len];  // mergedArray
          if((len1+len2)%2==0){
              //even
              isEven=1;
          }
    int pos=0;
    // Copy first array
    for(int i=0;i<len1;i++){
        arr[pos]=nums1[i];
        pos++;
    }
    // Copy second array
    for(int i=0;i<len2;i++){
        arr[pos]=nums2[i];
        pos++;
    }
     if(len==1)
            return (double)arr[0];
        
    Arrays.sort(arr);
        
    if(isEven==1){ 
        int first=(int)(len/2)-1;
        int second=(int)len/2;
        return ((double)arr[first] + arr[second])/(double)2;
    }
    else{
        return (double)arr[(int)len/2];
    }
    }
