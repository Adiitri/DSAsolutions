/* In a deep-space transmission relay, binary signals are streamed continuously.  
  1 represents a stable signal pulse.  
  0 represents a disruption caused by cosmic interference.  
The stability of a transmission session is measured by the longest uninterrupted chain of stable pulses.  
Your task is to determine the maximum number of consecutive 1s in the signal log.  

Input: [1,1,0,1,1,1,0,1]
Output: 3  
Input: [0,0,0,0]
 Output: 0 */
public int FindLongesSubstring(int[] arr){
int max=0, len=arr.length;
int start=0;
for(int i=0;i<len;i++){
  if(arr[i]==0){
    max= Math.max(max,i-start);
    start=i+1;
  }
}
  max=Math.max(max,len-start);
return max;
