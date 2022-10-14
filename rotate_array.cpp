#include <iostream>
using namespace std;
int main()
{
	int n,d;
	cout<<"Enter the value of n:"<<endl;
	cin>>n;
	cout<<"Enter the value of d:"<<endl;
	cin>>d;
	int a[n];
	cout<<"Enter the array elements : ";
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	cout<<"Array elements after rotation : ";
	for(int i=0;i<n;i++)
	{
		cout<<a[(i+d)%n]<<" ";
	}
	return 0;
}
