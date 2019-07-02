package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2293 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int []coin = new int[n+1];
		for(int i=1;i<n+1;i++) {
			coin[i]=Integer.parseInt(br.readLine());
		}
		
		
		int []dp=new int[k+1];
		dp[0]=1;
		for(int i=1;i<n+1;i++) {
			for(int j=coin[i];j<k+1;j++) {
				dp[j]+=dp[j-coin[i]];
			}
		}
		
		
		System.out.println(dp[k]);
		
	}

}
