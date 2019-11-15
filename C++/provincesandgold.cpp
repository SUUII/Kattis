#include <iostream>

using namespace std;

int main(){
    int q,w,e, total =0;
    cin>>q>>w>>e;
    total += q*3;
    total += w*2;
    total += e*1;
    if(total>=8){
        cout<<"Province or Gold";
    }else if(total>=6){
        cout<<"Duchy or Gold";
    }else if(total>=5){
        cout<<"Duchy or Silver";
    }else if(total>=3){
        cout<<"Estate or Silver";
    }else if(total>=2){
        cout<<"Estate or Copper";
    }else{
        cout<<"Copper";
    }
}