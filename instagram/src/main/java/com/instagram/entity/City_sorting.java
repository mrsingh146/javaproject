package com.instagram.entity;
import java.util.Comparator;
import com.instagram.entity.instauser
;
public class City_sorting implements Comparator<instauser> {
	public int compare(instauser o1,instauser o2)
	{
		return o1.getAddress().compareTo(o2.getAddress());
				}
	

}
