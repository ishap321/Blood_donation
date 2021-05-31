package Arrays;

import java.time.LocalDateTime;

public class Address {
	String city;
	String line1;
	String zip;
	private static LocalDateTime t=LocalDateTime.now();
	
	Address(String city, String line1, String zip)
	{
		this.city=city;
		this.line1=line1;
		this.zip=zip;
	}
	 public String toString()
	 {
		 return String.format("city- %s , line- %s  , zip- %s ",city,line1,zip);
		 
	 }
	
	 public static void main(String[] args) {
		System.out.println(t.getDayOfMonth()+"-"+t.getMonthValue()+"-"+t.getYear());
		System.out.println("SourceCity"+"\t"+"IntermediateCity1"+"\t"+"IntermediateCity2"+"\t"+"DestinationCity"+"\t"+
				"Date"+"\t"+"arrivalTime"+"\t"+"DepartureTime"+"\t"+"StationName");
		 int ans = Integer.MAX_VALUE;
	 System.out.println(ans);
	 }
	 
	

	 
}
