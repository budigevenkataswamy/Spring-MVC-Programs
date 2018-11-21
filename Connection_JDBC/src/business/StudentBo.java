package business;

import model.Student;

public interface StudentBo {
	public int createStudent(Student st)throws Exception;
	public boolean updateStudent(Student st)throws Exception;
	public boolean deleteStudent(Student st)throws Exception;


}
