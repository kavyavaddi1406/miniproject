
package com.zensar.bean;
import java.util.Comparator;
public class TripCustomerComparator implements Comparator<TripBooking> {
	@Override
public int compare(TripBooking o1, TripBooking o2) {
return o1.getCustomerId()-o2.getCustomerId();
}
}

