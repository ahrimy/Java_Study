package student;

public class StudentDelete {
private StudentDAO studentDAO;
	
	public StudentDelete(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}	
	public void Delete(String id) {
		if(checkId(id)) {
			System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
		}else {
			studentDAO.delete(id);
			
		}
	}
	public boolean checkId(String id) {
		Student student = studentDAO.select(id);
		return student == null? true:false;
	}

}
