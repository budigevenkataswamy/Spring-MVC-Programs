package dao;

import java.util.List;

import model.Student;

public interface StudentDao {
	public int save(Student st) throws Exception;
	public boolean update(Student st) throws Exception;
	public boolean delete(Student st) throws Exception;
	public Student findById(int id) throws Exception;
	public Student findByName(String name) throws Exception;
	public Student findByEmail(String email) throws Exception;
	public Student findByAddress(String address) throws Exception;
	public List<Student> findAll( ) throws Exception;




}
