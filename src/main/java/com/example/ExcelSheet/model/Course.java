package com.example.ExcelSheet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="COURSE_DB")
public class Course {
	
	@Id
	private Integer cid;
	private String cname;
	private Double price;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Integer cid, String cname, Double price) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", price=" + price + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
