class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int []> heap = new PriorityQueue<>(Comparator.comparingDouble(a-> (double)a[0]/a[1]));
        for(int i = 0 ; i < arr.length;i++ ){
            for(int j = i+1 ; j < arr.length ; j++){
                heap.offer(new int [] {arr[i] , arr[j]});
            }

        }
        int [] result = null ;
        for(int i  = 0 ; i < k ; i++){
            result = heap.poll();
        }
        return result ;
    }
}
