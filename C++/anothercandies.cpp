#include <iostream>

using namespace std;

int main()
{
    int q;
    cin>>q;
    for(int j = 0;j<q;j++){
    cout<<'\n';
        int w;
        cin>>w;
        long long total = 0;
        for(int i = 0;i<w;i++){
            long long permen;
            cin>>permen;
            total += permen;
            if(total>w){
                total %= w;
            }
        }
        total==0||total==w ? cout<<"YES\n" : cout<<"NO\n";
    }
}
