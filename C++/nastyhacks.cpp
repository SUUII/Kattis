#include <iostream>

using namespace std;

int main()
{
  int q;
  cin>>q;
  for(int i =0;i<q;i++){
    int w,e,r;
    cin>>w>>e>>r;
    if(w<e-r){
        cout<<"advertise"<<'\n';
    }else if(w==(e-r)){
        cout<<"does not matter"<<'\n';
    }else{
        cout<<"do not advertise"<<'\n';
    }
  }
}
