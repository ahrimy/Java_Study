package student;

public class StudentDelete {
private StudentDAO studentDAO;
	
	public StudentDelete(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}	
	public void Delete(String id) {
		if(checkId(id)) {
			System.out.println("존재하지 않는 아이디 입니다.");
		}else {
			studentDAO.delete(id);
			
		}
	}
	public boolean checkId(String id) {
		Student student = studentDAO.select(id);
		return student == null? true:false;
	}

}
