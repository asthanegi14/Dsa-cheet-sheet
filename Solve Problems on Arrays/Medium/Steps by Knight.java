class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public class Pair{
        int first;
        int second;
        
        Pair(int first, int second){
            this.first=first;
            this.second=second;
        }
    }
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int n)
    {
        // Code here
        int kposX=KnightPos[0]-1;
        int kposY=KnightPos[1]-1;
        int tposX=TargetPos[0]-1;
        int tposY=TargetPos[1]-1;
        
        if(kposX==tposX && kposY==tposY){
            return 0;
        }
        Queue<Pair> q = new LinkedList<>();
        boolean vis[][] = new boolean[n][n];
        
        q.add(new Pair(kposX,kposY));
        vis[kposX][kposY]=true;
        
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            ans++;
            while(size!=0){
                
                int[] x = {1, 1, -1, -1, 2, -2, 2, -2};
                int[] y = {2, -2, 2, -2, 1, 1, -1, -1};
                
                Pair p = q.poll();
                int a = p.first;
                int b = p.second;
                for(int i=0;i<8;i++){
                    int pos1=a+x[i];
                    int pos2=b+y[i];
                    
                    if(pos1==tposX && pos2==tposY){
                        return ans;
                    }
                    if(pos1>=0 && pos1<n && pos2>=0 && pos2<n && vis[pos1][pos2]==false){
                        vis[pos1][pos2]=true;
                        q.add(new Pair(pos1,pos2));
                    }
                }
                size--;
            }
        }
        return -1;
    }
}
