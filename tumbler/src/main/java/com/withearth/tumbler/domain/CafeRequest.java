package com.withearth.tumbler.domain;

import java.util.List;

public class CafeRequest {
	
	private int cafe_idx;
	private String cafe_name; // 카페 상호
	private String location; // 카페 위치
	private int cafe_lat; //위도
	private int cafe_lon; //경도
	private List<Cafe> cafeList;
	
	

	
	
	


	public CafeRequest(int cafe_idx, String cafe_name, String location, int cafe_lat, int cafe_lon) {
		
		this.cafe_idx = cafe_idx;
		this.cafe_name = cafe_name;
		this.location = location;
		this.cafe_lat = cafe_lat;
		this.cafe_lon = cafe_lon;
	}
	
	public CafeRequest(List<Cafe> cafeList) {
		
		this.cafeList = cafeList;
	}

	public int getCafe_idx() {
		return cafe_idx;
	}
	public void setCafe_idx(int cafe_idx) {
		this.cafe_idx = cafe_idx;
	}
	public String getCafe_name() {
		return cafe_name;
	}
	public void setCafe_name(String cafe_name) {
		this.cafe_name = cafe_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	public int getCafe_lat() {
		return cafe_lat;
	}
	public void setCafe_lat(int cafe_lat) {
		this.cafe_lat = cafe_lat;
	}
	public int getCafe_lon() {
		return cafe_lon;
	}
	public void setCafe_lon(int cafe_lon) {
		this.cafe_lon = cafe_lon;
	}
	
	
	public Cafe ToCafe() {
		Cafe cafe = new Cafe();
		cafe.setCafe_idx(cafe_idx);
		cafe.setCafe_name(cafe_name);
		cafe.setLocation(location);
		cafe.setCafe_lon(cafe_lon);
		cafe.setCafe_lat(cafe_lat);
		
		return cafe;
	}
	
	
	
	public List<Cafe> getCafeList() {
		return cafeList;
	}

	public void setCafeList(List<Cafe> cafeList) {
		this.cafeList = cafeList;
	}

	
	@Override
	public String toString() {
		return "CafeRequest [cafe_idx=" + cafe_idx + ", cafe_name=" + cafe_name + ", location=" + location
				+ ", cafe_lat=" + cafe_lat + ", cafe_lon=" + cafe_lon + ", cafeList=" + cafeList + "]";
	}

	
	
	
	
	
	

}
