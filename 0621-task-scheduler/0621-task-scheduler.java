class Solution {
    public int leastInterval(char[] tasks, int n) {
        int arr[] = new int[26];
        
        for(char ch : tasks){
            arr[ch-'A']++;
        }
        Arrays.sort(arr);

        int chunk = arr[25]-1;
        int idle = chunk*n;

        for(int i=24 ;i>=0;i--){
            idle -= Math.min(chunk , arr[i]);
        }

        return idle < 0 ? tasks.length : tasks.length + idle;                         
       
    }
}