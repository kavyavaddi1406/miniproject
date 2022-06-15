
package com.zensar.bean;
import java.util.Comparator;
public class TripDateComparator implements Comparator<TripBooking> { 
	@Override
public int compare(TripBooking t1, TripBooking t2) {
return t1.getFromDateTime().compareTo(t2.getFromDateTime());
}
	}

