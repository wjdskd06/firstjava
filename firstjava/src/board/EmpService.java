package board;

import java.util.List;

public interface EmpService {

	public Employee getEmployee(int empId);//d

	public List<Employee> getEmpList();//d

	public List<Employee> getEmpList(String hireDate);//�Ի��� ���� �Ի��� �ڿ��ִ� ģ���� ���

	public void insertEmp(Employee emp);

	public void updateEmp(int empId, int salary);

	public void updateEmp(Employee emp);

	public void deleteEmp(int empId);

}
