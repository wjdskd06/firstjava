package com.yedam.control;

import com.yedam.impl.EmpServiceImpl;
import com.yedam.model.EmpService;

public class EmpProc {
	EmpService service = new EmpServiceImpl();
	public void execute() {
		service.getEmpList();
	}

}
