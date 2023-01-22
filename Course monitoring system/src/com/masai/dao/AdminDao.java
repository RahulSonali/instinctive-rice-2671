package com.masai.dao;

import java.util.List;

import com.masai.bean.Batch;
import com.masai.bean.BatchReport;
import com.masai.bean.Course;
import com.masai.bean.CoursePlan;
import com.masai.bean.Faculty;
import com.masai.exceptions.AdminException;

public interface AdminDao {

	public String loginAdmin(String username, String password) throws AdminException;
	
	public String addNewCourse(Course course)throws AdminException;
	
	public String updateFeeBY10Percent(int cid)throws AdminException;
	
	public List<Course> getAllCources() throws AdminException;
	
	public String createNewBatch(Batch batch)throws AdminException;
	
	public String updatenoOfStudentInBatch(int no, int batchId)throws AdminException;
	
	public List<Batch> seeAllOnGoingBatches() throws AdminException;
	
	public String createNewFaculty(Faculty faculty)throws AdminException;
	
	public List<Faculty> showAllFaculty() throws AdminException;
	
	public String allocateFacultyToBatch(int facId, int batchId)throws AdminException;
	
	public String createCoursePlan(CoursePlan cp)throws AdminException;
	
	public String updateStatusInCoursePlan(int planId, int batchId)throws AdminException;
	
	public List<CoursePlan> showAllCoursePlan() throws AdminException;
	
	public List<BatchReport> generatebatchReport() throws AdminException;
	
}
