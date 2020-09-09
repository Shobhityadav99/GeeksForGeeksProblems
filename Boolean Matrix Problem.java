import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	     StringBuilder br1=new StringBuilder();
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t!=0)
	    {
	        t--;
	        String data[]=br.readLine().split(" ");
	        int n=Integer.parseInt(data[0]);
	        int m=Integer.parseInt(data[1]);
	        int [][] arr=new int[n][m];
	        int[] row=new int[n];
	        int[] col=new int[m];
	        for(int i=0;i<n;i++){
	            data=br.readLine().split(" ");
    	        for(int j=0;j<m;j++)
	                arr[i][j]=Integer.parseInt(data[j]);
	            
    	        for(int j=0;j<m;j++){
    	            if(arr[i][j]==1)
    	            {
    	                row[i]=1;
    	                col[j]=1;
    	            }
    	        }
	        }
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                if(row[i]==1||col[j]==1)
	                    br1.append(1+" ");
	                else
	                    br1.append(0+" ");
	            }
	            br1.append("\n");
	        }
	    }
	    System.out.println(br1);
	 }
}
