package dao;

import java.util.List;

import model.Student;

public interface StudentDaoInterface {
	
	public int save(Student st);
	public boolean update(Student st);
	public boolean delete(Student st);
	public Student fingByPK(int  pk);
	public List<Student> findAllUsingHQL();
	public List<Student> findAllUsingCriteria();

}
