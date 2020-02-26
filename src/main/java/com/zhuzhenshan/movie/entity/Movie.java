package com.zhuzhenshan.movie.entity;

public class Movie {
	private Integer id;
	private String name;
	private String actor;
	private Double price;
	private String uptime;
	private Integer longtime;
	private String type;
	private String area;
	private Integer years;
	private Integer status;//1��������ӳ 2,������ӳ 3���Ѿ��¼�
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public Integer getLongtime() {
		return longtime;
	}
	public void setLongtime(Integer longtime) {
		this.longtime = longtime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getYears() {
		return years;
	}
	public void setYears(Integer years) {
		this.years = years;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(Integer id, String name, String actor, Double price, String uptime, Integer longtime, String type,
			String area, Integer years, Integer status) {
		super();
		this.id = id;
		this.name = name;
		this.actor = actor;
		this.price = price;
		this.uptime = uptime;
		this.longtime = longtime;
		this.type = type;
		this.area = area;
		this.years = years;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", actor=" + actor + ", price=" + price + ", uptime=" + uptime
				+ ", longtime=" + longtime + ", type=" + type + ", area=" + area + ", years=" + years + ", status="
				+ status + "]";
	}
	
	
	
}
