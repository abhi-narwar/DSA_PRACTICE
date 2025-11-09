class rotate_array {
    public void rotate(int[] arr) {
        int n = arr.length;

        reverse(arr, 0, n - 1);  
        reverse(arr, 1, n - 1);   
    }

    public void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
