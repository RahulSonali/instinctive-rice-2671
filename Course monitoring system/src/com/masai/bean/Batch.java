package com.masai.bean;

public class Batch {

	private int batchId;
	private String batchName;
	private int courseId;
	private int facultyId;
	private int numberOfStudents;
	private String batchStartDate;
	private String duration;

	public Batch() {
		// TODO Auto-generated constructor stub
	}

	public Batch(int batchId, String batchName, int courseId, int facultyId, int numberOfStudents,
			String batchStartDate, String duration) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
		this.courseId = courseId;
		this.facultyId = facultyId;
		this.numberOfStudents = numberOfStudents;
		this.batchStartDate = batchStartDate;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", courseId=" + courseId + ", facultyId="
				+ facultyId + ", numberOfStudents=" + numberOfStudents + ", batchStartDate=" + batchStartDate
				+ ", duration=" + duration + "]";
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getBatchStartDate() {
		return batchStartDate;
	}

	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

}
