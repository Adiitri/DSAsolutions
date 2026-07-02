// Qs. Check if a given array is a valid rotation of a non-decreasing sorted array
public boolean check(int[] arr) {
    int len = arr.length;
    int drops = 0;
    for (int i = 0; i < len; i++) {
        // compare each element with next (wrap around using %)
        if (arr[i] > arr[(i + 1) % len]) { 
            drops++;
        }
        if (drops > 1) return false;  // if 0,1- valid rotation else not valid-rotation
    }
    return true;
}
