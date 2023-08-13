package Enum;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

enum Days{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	
	
}

public class EnumMapDemo {
	public static void main(String[] args) {
		
		EnumMap<Days,Integer>mymap=new EnumMap(Days.class);
		
		mymap.put(Days.THURSDAY,2 );
		mymap.put(Days.TUESDAY,4 );
		mymap.put(Days.FRIDAY,6 );
		mymap.put(Days.SATURDAY,8 );
		mymap.put(Days.SUNDAY,10 );
		mymap.put(Days.MONDAY,12 );
		mymap.put(Days.WEDNESDAY,14 );
		
		System.out.println(mymap);
		
		//Iterator <Days>itr=mymap.keySet().iterator();
			
		//	while(itr.hasNext())
			//	System.out.println(itr.next());
			
			
			
		
	
	Iterator <Entry<Days,Integer>> itr=mymap.entrySet().iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		
	}
}


