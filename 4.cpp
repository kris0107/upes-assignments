#include <stdio.h>
#include <bits/stdc++.h>
 

// Defining some regularly used attributes

#define mod 1000000007
#define maximum 100001

using namespace std;


int freq[maximum];
int multiples[maximum];
long long int G[maximum];


long long int mpow(long long int a, long long int b, long long int m)
{
    long long int answer=1;
    while(b)
    {
        if(b&1)answer=(answer*a)%m;
        a=(a*a)%m;
        b>>=1;
    }
    return answer;
}


int main()
{
    int t, n, i, x, j;
    
// Enter the test cases
    cin>>t;
    

    while(t--)
    {
        cin>>n;
        
        memset(multiples, 0, sizeof multiples);
        memset(freq, 0, sizeof freq);
        memset(G, 0, sizeof G);
        
        for(i=0;i<n;i++)
        {
            cin>>x;
            freq[x]++;
        }
        
        for(i=1;i<maximum;i++)
        for(j=i;j<maximum;j+=i)
        {
            multiples[i]+=freq[j];
        }
        
        i=maximum-1;
        long long int answer=1;
        
        while(i>0)
        {
            //rem contains subsets whose GCD is multiple of i i.e. 2*i, 3*i ....
            long long int rem=0;
            
            for(j=2*i;j<maximum;j+=i)
            {
                rem += G[j];
                if(rem>=mod-1)rem-=(mod-1);
            }
            
            G[i] = mpow(2, multiples[i], mod-1)-1 - (rem%(mod-1));
            
            while(G[i]<0)G[i]+=(mod-1);
            answer=answer*mpow(i, G[i], mod);
            answer%=mod;
            i--;
        }
        
        cout<<answer<<endl;
    }
}