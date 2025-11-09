class  rotate_array_by_d_steps {
    
    void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; 
        
        reverse(arr, 0, d - 1);
        
        
        reverse(arr, d, n - 1);
        
  
        reverse(arr, 0, n - 1);
    }
    
  
    void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
