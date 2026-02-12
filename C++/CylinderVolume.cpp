#include<iostream>
using namespace std;
int main()
{
    float r, h, v;
    int trunc_vol;
    cout<<"Enter radius:";
    cin>>r;
    cout <<"Enter height:";
    cin>>h;
    v= 3.14*r*r*h;
    trunc_vol = v;
    cout<<"volume"<<v<<endl;
    cout<<"truncated volume"<<trunc_vol<<endl;
    if trunc_vol>100 
    {
        cout<<"trunc_vol is greater than 100"<<endl;
    }



}