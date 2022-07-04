package com.greatlearning.debate.event.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.debate.event.dao.IStudentDao;
import com.greatlearning.debate.event.entity.Student;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
	
	
	@Autowired
	private IStudentDao studentDao;

	@Override
	public Student add(Student student) {
		return studentDao.insertStudentDetails(student);
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudentDetails(Student student);
	}

	@Override
	public Student getStudent(int studentId) {
		return studentDao.findStudent(studentId);
	}

	@Override
	public boolean deleteStudent(int studentId) {
		
	
		return studentDao.deleteStudentDetails(studentId);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.retrieveStudentDetails();
	}

}
