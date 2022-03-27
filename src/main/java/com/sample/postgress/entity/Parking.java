package com.sample.postgress.entity;

public class Parking {

	String id;
	String parking_number;
	String client_free;
	String client_busy;
	String vip_busy;
	String reserved_free;
	String reserved_busy;
	Boolean active;

	public String getParkingId() {
		return id;
	}

	public String getParkingNumber() {
		return parking_number;
	}

	public String getClient_free() {
		return client_free;
	}

	public String getClient_busy() {
		return client_busy;
	}

	public String getVip_busy() {
		return vip_busy;
	}

	public String getReserved_free() {
		return reserved_free;
	}

	public String getReserved_busy() {
		return reserved_busy;
	}

	public Boolean getActive() {
		return active;
	}
}
