class Solution {
public:
    int countPrimes(int n) {
        vector<bool> seive(n+1,true);
        seive[0]=false;
        seive[1]=true;
        for(int i=2;i*i<=n;i++){
            if(seive[i]){
                for(int p=i;p*p<=n;p+=i){
                    seive[p]=false;
                }
            }
        }
        int ans=0;
        for(int i=2;i<=n;i++){
            if(seive[i]) ans++;
        }
        return ans;
    }
};