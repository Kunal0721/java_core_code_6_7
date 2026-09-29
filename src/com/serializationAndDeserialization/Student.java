package com.serializationAndDeserialization;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1604772558180840267L;
	private Integer id;
	private String name;
	private Double marks;

	public Student(Integer id, String name, Double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}
