/*
#include<cstdio>
#include<cstdlib>
#include<iostream>
#include<algorithm>
using namespace std;
struct point {
    int x,y;
};
int f(point a ,point b) {
    if(a.x==b.x) return a.y<b.y;
    return a.x<b.x;
}

int main()
{
    int m,n,k;
    cin>>m>>n>>k;
    point p[1001];
    for(int i=0;i<k;i++) {
        cin>>p[i].x>>p[i].y;
    }
    sort(p,p+k,f);
    int pos=0,flag=0;
    char ans[300];
    int x = p[0].x,y = p[0].y;
    while(x-->1){
        ans[pos++]='D';
    }
    while(y-->1) {
        ans[pos++]='R';
    }
    for(int i=1;i<k;i++) {
        x = p[i].x - p[i-1].x;
        y = p[i].y - p[i-1].y;
        if(x<0||y<0) {
            flag = 1;
            break;
        }
        while(x--){
            ans[pos++]='D';
        }
        while(y--) {
            ans[pos++]='R';
        }
    }
    x = m - p[k-1].x;
    y = n - p[k-1].y;
    while(x--){
        ans[pos++]='D';
    }
    while(y--) {
        ans[pos++]='R';
    }
    ans[pos] = '\0';
    if(!flag)cout<<ans<<"\n";
    else cout<<"Impossible\n";
}
*/