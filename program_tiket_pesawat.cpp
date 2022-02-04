#include <iostream>
using namespace std;
clrscr;
cout<<"PROGRAM TIKET PESAWAT">>endl;
cout<<"JAKATRA - SINGAPURA">>endl;
cout<<"====================">>endl;

cout<<"MASUKA KODE PESAWAT[MPT/GRD/BTV]=";
cout<<"kodepesawat;
cout<<"KELAS PEASWAT:"<<endl;
cout<<" 1. EXECUTIVE "<<endl;
cout<<" 2. BISNIS    "<<endl;
cout<<" 2. EKONOMI   "<<endl;
cout<<"--------------"<<endl;
cout<<endl;

cout<<"PLILIHAN KELAS[1/2/3]:";
cin>>kelas;
cout<<endl;

if(strcmp(kodepesawat,"mpt")==0)||(strcmp(kodepesawat,"mpt")==0)){
    strcpy(namapesawat,"MERPATI");
    if(kelas==1){   
        harga = 1500000;
        }
    else if(kelas==2){
        harga = 900000;
        }
    else if(kelas==3){
        harga = 500000;
        }
        else{
        cout<<"KODE YAN ANDA MASUKAN SALAH";
        harga=0;
        exit(0);
        }
        }

else if(strcmp(kodepeasawat,"GRD")==0)||(strcmp(kodepeasawat,"grd")==0)){
    strcpy(nsmprasawat,"GARUDA");
    if(kelas==1){   
        harga = 1200000;
        }
    else if(kelas==2){
        harga = 800000;
        }
    else if(kelas==3){
        harga = 400000;
        }
    else{
        cout<<"KODE YAN ANDA MASUKAN SALAH";
        harga=0;
        exit(0);
        }
        }
else if(strcmp(kodepeasawat,"BTV")==0)||(strcmp(kodepeasawat,"btv")==0)){
    strcpy(nsmprasawat,"BATAVIA");
    if(kelas==1){   
        harga = 1000000;
        }
    else if(kelas==2){
        harga = 700000;
        }
    else if(kelas==3){
        harga = 300000;
        }
    else{
        cout<<"KODE YAN ANDA MASUKAN SALAH";
        harga=0;
        exit(0);
        }
        }
     else{
        cout<<"KODE YAN ANDA MASUKAN SALAH";
        harga=0;
        exit(0);
        }
cout<<"NAMA PESAWAT ="<<namapesawat<<endl;
cout<<"NAMA HARGA TIKET ="<<HARGA<<endl;
cout<<"JUMLAH TIKET =";
cin>>jumlah;

total=harga*jumlah;
cout<<"TOTAOL BAYAR="<<total<<endl;
cout<<"--------------------"<<endl;
    
cout<,endl;
cout<<'\t\tINGIN LAGI[Y/T]:";
cin>>konfir;

if(konfir=='Y'||konfir=='y'){
goto awal;
}
else
}
exit(0);
}
getch();
}
----------------------------------------