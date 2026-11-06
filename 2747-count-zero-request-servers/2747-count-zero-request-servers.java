class Solution{
    public int[] countServers(int n,int[][] logs,int x,int[] queries){
        Arrays.sort(logs,(a,b)->Integer.compare(a[1],b[1]));
        int[][] q=new int[queries.length][2];
        for(int i=0;i<queries.length;i++){
            q[i][0]=queries[i];
            q[i][1]=i;
        }
        Arrays.sort(q,(a,b)->Integer.compare(a[0],b[0]));
        int[] arr=new int[queries.length];
        int[] freq=new int[n+1];
        int active=0,left=0,right=0;
        for(int[] query:q){
            int start=query[0]-x;
            int end=query[0];
            while(right<logs.length&&logs[right][1]<=end){
                if(freq[logs[right][0]]++==0) active++;
                right++;
            }
            while(left<right&&logs[left][1]<start){
                if(--freq[logs[left][0]]==0) active--;
                left++;
            }
            arr[query[1]]=n-active;
        }
        return arr;
    }
}