package com.seleniumexpress.models;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student { // enitity -> primary key

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;  // value type

	@Column(name = "name", length = 70, nullable = false)
	private String name;

	@Column(name = "contact_no", length = 15)
	private long mobileNo;

	  @Embedded
	    @AttributeOverrides({
	            @AttributeOverride(name="addressLine1", 
	                               column=@Column(name="address_line_1")),
	            @AttributeOverride(name="addressLine2", 
	                               column=@Column(name="address_line_2")),
	            @AttributeOverride(name="country", 
                                   column=@Column(name="country")),
	            @AttributeOverride(name="city", 
                                   column=@Column(name="city"))
	    })

	private Address address; // composite value type

	  
	  @Embedded
	    @AttributeOverrides({
	            @AttributeOverride(name="addressLine1", 
	                               column=@Column(name="hostel_address_line_1")),
	            @AttributeOverride(name="addressLine2", 
	                               column=@Column(name="hostel_address_line_2")),
	            @AttributeOverride(name="country", 
                                  column=@Column(name="hostel_country")),
	            @AttributeOverride(name="city", 
                                  column=@Column(name="hostel_city"))
	    })

	private Address hostelAddress;
	  
	  
	  
	public Address getHostelAddress() {
		return hostelAddress;
	}

	public void setHostelAddress(Address hostelAddress) {
		this.hostelAddress = hostelAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

}
