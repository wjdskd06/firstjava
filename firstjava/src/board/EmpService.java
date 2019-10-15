package board;

import java.util.List;

public interface EmpService {

	public Employee getEmployee(int empId);//d

	public List<Employee> getEmpList();//d

	public List<Employee> getEmpList(String hireDate);//입사일 기준 입사일 뒤에있는 친구들 출력

	public void insertEmp(Employee emp);

	public void updateEmp(int empId, int salary);

	public void updateEmp(Employee emp);

	public void deleteEmp(int empId);

}
