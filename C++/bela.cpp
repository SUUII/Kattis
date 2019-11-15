#include <iostream>

using namespace std;
int dominant(char q){
switch(q){
    case 'A' : return 11; break;
    case 'K' : return 4; break;
    case 'Q' : return 3; break;
    case 'J' : return 20; break;
    case 'T' : return 10; break;
    case '9' : return 14; break;
    case '8' : return 0; break;
    case '7' : return 0; break;
}
}
int nondominant(char q){
switch(q){
    case 'A' : return 11; break;
    case 'K' : return 4; break;
    case 'Q' : return 3; break;
    case 'J' : return 2; break;
    case 'T' : return 10; break;
    case '9' : return 0; break;
    case '8' : return 0; break;
    case '7' : return 0; break;
}
}

int main(){
    int q;
    char w;
    int total =0;
    cin>>q>>w;
    for(int i = 0;i < q*4;i++){
        char e,f;
        cin>>e>>f;
        if(f==w){
            total +=dominant(e);
        }else{
            total += nondominant(e);
        }
    }
    cout<<total;
}