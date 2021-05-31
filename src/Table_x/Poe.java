package Table_x;
import java.util.*;

public class Poe {

	public static void main(String[] args) {
		
		System.out.println("enter the size of array");
		        Scanner sc=new Scanner(System.in);
		        int f=sc.nextInt();
		        int flag=0;
		        int fa[]=new int[20];
		        for(int i=1;i<=f;i++)
		        {
		            fa[i]=sc.nextInt();
		            if(fa[i]<0)
		            {
		                System.out.println("Negative Elements not allowed");
		                System.exit(0);
		            }
		        }
		        int s=sc.nextInt();
		        int []sa=new int[20];
		        if(f!=s){
		            System.out.println("Invalid array size");
		        }
		        else {
		            for(int i=1;i<=s;i++){
		                sa[i]=sc.nextInt();
		                if(sa[i]<0){
		                    System.out.println("Negative Elements not allowed");
		                    System.exit(0);
		                }
		                for(int k=1;k<=f;k++){
		                    for(int j=1;j<=s;j++){
		                        if(fa[k]==sa[j]){
		                            flag=1;
		                            System.out.println("("+k+","+j+")");
		                        }
		                    }
		                }
		            }
		            if(flag==0){
		                System.out.println("No matching scores");
		            }
		        }
		    }
		}




