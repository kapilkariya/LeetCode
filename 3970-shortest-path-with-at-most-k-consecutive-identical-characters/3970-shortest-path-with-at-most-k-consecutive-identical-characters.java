class Solution {
    public int shortestPath(int n,int[][] edges,String labels,int k){
        List<int[]>[] a=new ArrayList[n];
        for(int i=0;i<n;i++) a[i]=new ArrayList<>();
        for(int[] e:edges) a[e[0]].add(new int[]{e[1],e[2]});
        long[][] d=new long[n][k+1];
        for(long[] x:d) Arrays.fill(x,Long.MAX_VALUE);
        PriorityQueue<long[]> q=new PriorityQueue<>((x,y)->Long.compare(x[0],y[0]));
        d[0][1]=0;
        q.offer(new long[]{0,0,1});
        while(!q.isEmpty()){
            long[] x=q.poll();
            long cost=x[0];
            int node=(int)x[1],cnt=(int)x[2];
            if(cost!=d[node][cnt]) continue;
            if(node==n-1) return (int)cost;
            for(int[] e:a[node]){
                int next=e[0],w=e[1];
                int c=1;
                if(labels.charAt(node)==labels.charAt(next)) c=cnt+1;
                if(c>k) continue;
                if(cost+w<d[next][c]){
                    d[next][c]=cost+w;
                    q.offer(new long[]{cost+w,next,c});
                }
            }
        }
        return -1;
    }
}