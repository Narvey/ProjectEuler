#include<iostream>

using namespace std;

int main(){
	int first=999,second=999,ans;//924*962=888888
	int o,m,i;//outer,middle,inner digits of the palindrome.
	for(;first>500;first--){
		for(second=999;second>500;second--){
			ans=first*second;
			o=ans/100000;
			m=(ans%100000)/10000;
			i=(ans%10000)/1000;
			if( ((ans%1000)/100==i)&&((ans%100)/10==m)&&(ans%10==o) )
			{
				cout<<ans<<' '<<o<<' '<<m<<' '<<i<<endl;
//				return 0;
			}
		}
	}
	cout<<ans;
	return 0;
}
