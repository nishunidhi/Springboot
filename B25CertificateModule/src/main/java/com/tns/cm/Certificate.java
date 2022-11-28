package com.tns.cm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Certificate
{
private Integer id;
private String College;
private Integer year;
public Certificate()
{
}
public Certificate(Integer id, String College, Integer year)
{
this.id = id;
this.College = College;
this.year = year;
}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getId()
{
return id;
}
public void setId(Integer id)
{
this.id = id;
}

@Override
public String toString()
{
return "Product [id=" + id + ", College=" + College + ", year=" + year + "]";
}
public Integer getYear() {
	return year;
}
public void setYear(Integer year) {
	this.year = year;
}
public String getCollege() {
	return College;
}
public void setCollege(String college) {
	College = college;
}
}