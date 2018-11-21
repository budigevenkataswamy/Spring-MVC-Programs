package dao;

 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import model.Student;

public class StudentDaoImplJDBC implements StudentDao {
	
	private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	

	@Override
	public int save(Student st) throws Exception {
		Connection con=ds.getConnection();
		PreparedStatement ps= con.prepareStatement("insert into student values(?,?,?,?)");
		ps.setInt(1,st.getId());
		ps.setString(2, st.getName());
		ps.setString(3, st.getEmail());
		ps.setString(4, st.getAddress());
		int i=ps.executeUpdate();
		con.close();
	
		return  i;
	}

	@Override
	public boolean upadte(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Student st) throws Exception {
		
		
		return false;
	}

	@Override
	public Student findByPK(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByAddress(String address) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
