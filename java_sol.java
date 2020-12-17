import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int t=in.nextInt();
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		int cmp(int[] a, int[] b) {
			if(a[0]==b[0]&&a[1]==b[1]&&a[2]==b[2])
				return 0;
			else if(a[0]>=b[0]&&a[1]>=b[1]&&a[2]>=b[2])
				return 1;
			else if(a[0]<=b[0]&&a[1]<=b[1]&&a[2]<=b[2])
				return 1;
			else
				return 0;
		}
		
		Solver() {
			int[] s1 = new int[3];
			int[] s2 = new int [3];
			int[] s3 = new int[3];
			for(int i=0; i<3; ++i)
				s1[i]=in.nextInt();
			for(int i=0; i<3; ++i)
				s2[i]=in.nextInt();
			for(int i=0; i<3; ++i)
				s3[i]=in.nextInt();
			int cnt=0;
			cnt+=cmp(s1, s2);
			cnt+=cmp(s2, s3);
			cnt+=cmp(s1, s3);
			out.println(cnt==3?"yes":"no");
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
