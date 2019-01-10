package com.bonitasoft.hibernatepostgresqlutf8;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@javax.persistence.Entity(name="MyBusinessObject")
@Table(name="MYBUSINESSOBJECT")
public class MyBusinessObject {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="ASHORTSTRING", nullable=true, length=255)
	private String aShortString;
	
	@Column(name="ABIGSTRING", nullable=true)
	@Lob
	private String aBigString;

	public String getaShortString() {
		return aShortString;
	}

	public void setaShortString(String aShortString) {
		this.aShortString = aShortString;
	}

	public String getaBigString() {
		return aBigString;
	}

	public void setaBigString(String aBigString) {
		this.aBigString = aBigString;
	}

}
