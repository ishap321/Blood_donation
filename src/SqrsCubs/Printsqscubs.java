package SqrsCubs;

public class Printsqscubs {
	static int no;
      Printsqscubs(int n)
      {
    	no=n; 
      }
      static void Squares()
      {
    	  int i=1;
    	  while(i<no)
    	  {
    		  System.out.println(i*i);
    		  i++;
    	  }
    	  
      }
      static void cubes()
      {
    	  int j=1;
		  System.out.println("CUBES");
    	  while(j<no)
    	  {
    		  System.out.println( j*j*j);
    		  j++;
    	  }
      }
	public static void main(String[] args) {
		Printsqscubs sc = new Printsqscubs(5);
		sc.Squares();
		sc.cubes();
		
	}

}
