/*#include <math.h>
#include <string>
#include <sstream>
#include <vector>
#include <algorithm>
#include <conio.h>*/

#include <iostream>
#include <string>
using namespace std;

int main(){
    string q;
    int w;
    cin>>q>>w;
    bool qwe = false;
    if(q=="OCT"&&w==31||q=="DEC"&&w==25){
            qwe = true;
    }
    if(qwe){
        cout<<"yup";
    }else{
        cout<<"nope";
    }





    /*
    int q;
    cin>>q;
    int qwe[q];
    for(int i =0;i<q;++i){
        int w,total = 1;
        cin>>w;
        for(int j = w;j>0;j--){
            total*=j;
        }
        qwe[i] = total;
    }
    for(int i=0;i<q;i++){
    cout<<(qwe[i]%10)<<'\n';
    }
    */


    /*
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
*/


 /*int dominant(char q){
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
    //tambah main
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
*/




 /*   int q;
    std::cin>>q;
    int qwe[100][100];
    for(int i = 0;i < 2;i++){
        for(int j = 0;j<q;j++){
            std::cin>>qwe[i][j];
        }
    }
int z;
std::cin>>z;
    for(int i = 0;i<z;i++){
            char r,t;
    int w,e;
    std::cin>>r>>w>>t>>e;
    w--;
    e--;
    if(r=='A'&&t=='A'){
        int sementara = qwe[0][w];
        qwe[0][w]=qwe[0][e];
        qwe[0][e]=sementara;
    }else if(r=='A'&&t=='B'){
        int sementara = qwe[0][w];
        qwe[0][w]=qwe[1][e];
        qwe[1][e]=sementara;
    }else if(r=='B'&&r=='A'){
        int sementara = qwe[1][w];
        qwe[1][w]=qwe[0][e];
        qwe[0][e]=sementara;
    }else if(r=='B'&&t=='B'){
        int sementara = qwe[1][w];
        qwe[1][w]=qwe[1][e];
        qwe[1][e]=sementara;
    }
    }
       for(int i = 0;i < 2;i++){
        for(int j = 0;j<q;j++){
                if(j==0){
                std::cout<<qwe[i][j];
                }else{
                std::cout<<' '<<qwe[i][j];
                }
        }std::cout<<'\n';
    }*/








 /*int r[100][100];
int t[100][100];
int y[100][100];
int q,w,e;
std::cin>>q>>w>>e;
for(int i=0;i<q;i++){
    for(int j=0;j<w;j++){
       std::cin>>r[i][j];
    }
}
for(int i=0;i<w;i++){
    for(int j=0;j<e;j++){
       std::cin>>t[i][j];
    }
}
int keluar=0;
for(int k=0;k<q;k++){
    for(int i=0;i<e;i++){
        for(int j=0;j<w;j++){
              std::cout<<k<<','<<j<<"   "<<j<<','<<i<<"   ";
                std::cout<<r[k][j]<<','<<t[j][i]<<"   ";
            int sementara= r[k][j]*t[j][i];
            keluar += sementara;
           std::cout<<"total"<<keluar<<' '<<'\n';
        }
      std::cout<<'\n';
      if(i==0){
       std::cout<<keluar;
        keluar=0;
      }else{
       std::cout<<' '<<keluar;
        keluar=0;
      }
    }
   std::cout<<'\n';
}




    int e[100][100];
    int q ,w;
    std::cin>>q;
    std::cin>>w;
    for(int i=0;i<q;i++){
        for(int j = 0;j<w;j++){
            std::cin>>e[i][j];
        }
    }
        for(int i = 0; i <w; i++){
    for(int j = q-1; j >=0; j--){
            std::cout<<"lokasi : "<<j<<','<<i<<' ';
            if(j==q-1){
            std::cout<<e[j][i];
            }else{
            std::cout<<' '<<e[j][i];
            }

        }
        std::cout<<'\n';
    }




    int q,e;
    std::cin>>q;
    int w[q];
    for(int i = 0; i<q;i++){
        std::cin>>e;
        w[i] =e;
    }
    std::vector<int> z (w, w+q);
    std::sort (z.begin(), z.end());
    int tambah = 1;
    int palingbanyak = 0;
    int angka =0;

      for(int i = 0; i<q;i++){
        std::cout<< z[i] << ' ';
    }std::cout<<'\n';
            std::cout<<"tambah : "<<tambah<<'\n';
            std::cout<<"angka : "<<angka<<'\n';
            std::cout<<"palingbanyak : "<<palingbanyak<<'\n';
     for(int i = 0; i<q-1;i++){
     if(z[i]==z[i+1]){
                std::cout<<z[i]<<' '<<z[i+1]<<'\n';
            ++tambah;
            std::cout<<"tambah : "<<tambah<<'\n';
     }else{
            std::cout<<"palingbanyak : "<<palingbanyak<<'\n';
            if(tambah > palingbanyak||tambah == palingbanyak){
                std::cout<<"masuk if ganti";
                palingbanyak=tambah;
                angka = z[i];
                std::cout<<"angka : "<<angka<<'\n';
            }else{
            std::cout<<"zonk"<<'\n';}
            tambah =1;
     }
    }
     if(tambah > palingbanyak||tambah == palingbanyak){
                std::cout<<"masuk if ganti";
                palingbanyak=tambah;
                angka = z[q-1];
                std::cout<<"angka : "<<angka<<'\n';}
    std::cout<<angka;




    int q;
    int w[100] = {0};
    int tambah = 0;
        while(std::cin>>q){
    w[tambah]=q;
    ++tambah;
}
for(int i =99;i>=0;i--){
        if(w[i]>0){
    std::cout<<w[i]<<'\n';
        }
}


    int q,w;
    bool prima = true;
    std::cin>>q;
    for(int i =0;i<q;++i){
        std::cin>>w;
        if(w>1){
           for(int j =2;j<=sqrt(w);++j){
            if(w%j==0){
                    std::cout<<"BUKAN\n";
            prima = false;
               break;
            }
            }
        }else{
        std::cout<<"BUKAN\n";
        prima = false;
        }

            if(prima){
                std::cout<<"YA"<<'\n';
            }
            prima = true;
        }


   int q,w=0;
    std::cin>>q;
    for(int i =1;i <=q;i++){
        for(int j=0;j<i;j++){
            std::cout<<w;
            if(w<9){
            ++w;
            }else{
            w=0;
            }

        }
        std::cout<<'\n';
    }


    int q;
    std::cin>>q;
    for(int i =1;i <=q;i++){
        for(int j = q-i; j > 0; j--){
            std::cout<<' ';
        }
        for(int j = 0; j < i; j++){
            std::cout<<'*';
        }
        std::cout<<'\n';
    }


    int q;
    std::cin>>q;
    for(int i=1;i <=q;i++){
        if(i%10==0){
            continue;
        }else if(i==42){
            std::cout<<"ERROR"<<'\n';
            break;
        }else{
            std::cout<<i<<'\n';
        }
    }


    int q ,w;
    std::cin>>q>>w;
            if(1%w==0){
                std::cout<<"*";
                for(int i =1;i<q;i++){
                    std::cout<<" *";
            }
            }else{
                for(int i=1;i<=q;i++){
                     if(i==1){
                        std::cout<<i;
                    }else if(i%w==0){
                        std::cout<<" *";
                    }else{
                        std::cout<<' '<<i;
                    }}}
    std::cout<<'\n';


    int q, w=100000, e=-100000;
    std::cin>>q;
    for(int i =0;i<q;i++){
        int r;
        std::cin>>r;
        if(r<w){
            w=r;
        }
        if(r>e){
            e=r;
        }
    }
    std::cout<<e<<' '<<w<<'\n';



  int q ;
    std::cin>>q;
    std::cout<<q<<'\n';
  for(int i =q/2;i>0;i--){x
    if(q%i==0){
        std::cout<<i<<'\n';
    }
  }


    double q ;
    std::cin>>q;
    while(q>=2){
            q/=2;
    }

      if(q==1){
        std::cout<<"ya"<<'\n';
      }else{
      std::cout<<"bukan"<<'\n';
      }




    int q,w=0;
while(std::cin>>q){
    w+=q;
}
std::cout<<w<<'\n';



    int q, w=0;
    int e;
    std::cin>>q;
    for(int i = 0;i<q;i++){
        std::cin>>e;
        w+=e;

    }
    std::cout<<w<<'\n';


    int q,w,e,r;
    std::cin>>q>>w>>e>>r;
    int a = q-e;
    int s = w-r;
    int d = std::abs(a)+std::abs(s);
    std::cout<<d<<'\n';

    double q;
   std::cin>>q;
   if(q<trunc(q)){
    std::cout<<trunc(q-1)<<" "<<trunc(q)<<'\n';
   }else if(q>trunc(q)){
    std::cout<<trunc(q)<<" "<<trunc(q+1)<<'\n';
   }else{
    std::cout<<trunc(q)<<" "<<trunc(q)<<'\n';
   }*/


 /*   int q;
   std::cin>>q;
   switch(std::to_string(q).length()){
   case 1 : std::cout<<"satuan"<<'\n';  break;
   case 2 : std::cout<<"puluhan"<<'\n';  break;
   case 3 : std::cout<<"ratusan"<<'\n';  break;
   case 4 : std::cout<<"ribuan"<<'\n';  break;
   case 5 : std::cout<<"puluhribuan"<<'\n';  break;
   case 6 : std::cout<<"ratusribuan"<<'\n';  break;
   }
  if(std::to_string(q).length()==1){
    std::cout<<"satuan"<<'\n';
   }else if(std::to_string(q).length()==2){
    std::cout<<"puluhan"<<'\n';
   }else if(std::to_string(q).length()==3){
       std::cout<<"ratusan"<<'\n';
   }else if(std::to_string(q).length()==4){
       std::cout<<"ribuan"<<'\n';
   }else if(std::to_string(q).length()==5){
       std::cout<<"puluhribuan"<<'\n';
   }else if(std::to_string(q).length()==6){
       std::cout<<"ratusribuan"<<'\n';
   }*/

}
