class Solution{
    public:
    int kthSmallest(int arr[], int l, int r, int k) {
        priority_queue<int>a;
        int n=r-l+1;
        for(int i=0;i<k;i++){
            a.push(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(arr[i]<a.top()){
                a.pop();
                a.push(arr[i]);
            }
        }
        return a.top();
    }
};
