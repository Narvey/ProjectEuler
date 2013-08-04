#include<iostream>

using namespace std;

int main(){
	unsigned int ans=1;
	for(int i=20;i>1;i--){
		int j=i;
		while(j%2==0){j/=2;}
		while(j%3==0){j/=3;}
		if(ans%j) {  ans*=j;
		cout<<ans<<' '<<i<<' '<<j<<endl;  }
	}
	cout<<ans*16*9<<endl;
}
