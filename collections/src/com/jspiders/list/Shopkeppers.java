package com.jspiders.list;

public class Shopkeppers {
	int shops;
	double lease;
	public Shopkeppers(int shops, double lease) {
		super();
		this.shops = shops;
		this.lease = lease;
	}
	@Override
	public String toString() {
		return "Shopkeppers [shops=" + shops + ", lease=" + lease + "]";
	};
	

}
