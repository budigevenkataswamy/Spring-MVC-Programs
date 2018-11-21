package dao;

import java.sql.Connection;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;

import model.Student;

public class StudentDaoImpl implements StudentDao {
	
	private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int save(Student st) throws Exception {
		Connection con=ds.getConnection();
		//save
		con.close();
		 
		return 0;
	}

	@Override
	public boolean update(Student st) throws Exception {
		Connection con=ds.getConnection();
		//update
		con.close();	
		return false;
	}

	@Override
	public boolean delete(Student st) throws Exception {
		Connection con=ds.getConnection();
		//delete
		con.close();
		return false;
	}

	@Override
	public Student findById(int id) throws Exception {
		Connection con=ds.getConnection();
		//findById
		con.close();
		return null;
	}

	@Override
	public Student findByName(String name) throws Exception {
		Connection con=ds.getConnection();
		//find by name
		con.close();
		return null;
	}

	@Override
	public Student findByEmail(String email) throws Exception {
		Connection con=ds.getConnection();
		//fing by email
		con.close();
		return null;
	}

	@Override
	public Student findByAddress(String address) throws Exception {
		Connection con=ds.getConnection();
		//find by address
		con.close();
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		Connection con=ds.getConnection();
		//find by all
		con.close();
		return null;
	}

}
