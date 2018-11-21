package dao;

import java.util.List;

import model.Student;

public interface StudentDao {
	
	
	public int save(Student st) throws Exception;
	public boolean upadte(Student st) throws Exception;
	public boolean delete(Student st) throws Exception;
	public Student findByPK(int id) throws Exception;
	public List<Student> findByName(String name) throws Exception;
	public List<Student> findByEmail(String email) throws Exception;
	public List<Student> findByAddress(String address) throws Exception;
	public List<Student> findByAll() throws Exception;


}
