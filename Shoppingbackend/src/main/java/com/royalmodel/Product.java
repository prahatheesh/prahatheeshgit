package com.royalmodel;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;
 


@Entity
@Table(name = "PROD")
public class Product 
{
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	@NotEmpty
	private String productmanufacturer;
	@NotEmpty
	private String productstrength;
	@NotNull
	private int productprice;
	@NotEmpty
	private String pname;
	@NotEmpty
	private String category;
	
	@Transient
	private MultipartFile gt; 
	
	public MultipartFile getGt() {
		return gt;
	}
	public void setGt(MultipartFile gt) {
		this.gt = gt;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductmanufacturer() {
		return productmanufacturer;
	}
	public void setProductmanufacturer(String productmanufacturer) {
		this.productmanufacturer = productmanufacturer;
	}
	public String getProductstrength() {
		return productstrength;
	}
	public void setProductstrength(String productstrength) {
		this.productstrength = productstrength;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}