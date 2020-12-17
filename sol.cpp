#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

int cmp(int a[3], int b[3]) {
	if(a[0]==b[0]&&a[1]==b[1]&&a[2]==b[2])
		return 0;
	else if(a[0]>=b[0]&&a[1]>=b[1]&&a[2]>=b[2])
		return 1;
	else if(a[0]<=b[0]&&a[1]<=b[1]&&a[2]<=b[2])
		return 1;
	else
		return 0;
}

void solve() {
	int s1[3], s2[3], s3[3];
	for(int i=0; i<3; ++i)
		cin >> s1[i];
	for(int i=0; i<3; ++i)
		cin >> s2[i];
	for(int i=0; i<3; ++i)
		cin >> s3[i];
	int cnt=0;
	cnt+=cmp(s1, s2);
	cnt+=cmp(s2, s3);
	cnt+=cmp(s1, s3);
	cout << (cnt==3?"yes":"no") << "\n";
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int t;
	cin >> t;
	while(t--)
		solve();
}
