import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int point[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				point[i][j]=sc.nextInt();
			}
		}
		int not=100000;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j&&point[i][j]==0)
				{
					point[i][j]=not;
				}
			}
		}
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					point[j][k]=Math.min(point[j][k], point[j][i]+point[i][k]);
				}
			}
		}
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(point[i][j]+1);
			}
			
		}
		

	}

}
