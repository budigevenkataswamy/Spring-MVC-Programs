package business;

import dao.StudentDao;
import model.Student;

public class StudentBoImpl implements StudentBo {
	
	private StudentDao dao;
	 public void setDao(StudentDao dao) {
		this.dao = dao;
	}
	 

	@Override
	public int createStudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return dao.save(st);
	}

	@Override
	public boolean updateStudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
