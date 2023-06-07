package com.edu.service.impl;

import java.util.ArrayList;

import com.edu.exception.DuplicateIDException;
import com.edu.service.EmployeeListService;
import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;

public class EmployeeListServiceImpl implements EmployeeListService{
	
	private ArrayList<Employee> list = new ArrayList<>();
	
	private static EmployeeListServiceImpl service = new EmployeeListServiceImpl();
	
	private EmployeeListServiceImpl() {
		list = new ArrayList<>();
	}
	
	public static EmployeeListServiceImpl getInstance() {
		return service;
	}
	
	@Override
	public void addEmployee(Employee e) throws DuplicateIDException {
		// TODO Auto-generated method stub
		//추가하려는 직원이 있따면 추가안되도록
		//추가하려는 직원이 없다면 추가되도록
		boolean find = false;
		
		for (Employee emp : list) {
			if(emp.getEmpId().equals(e.getEmpId())) {
				find = true;
//				System.out.println(e.getName() + "이미 직원이 등록되어있습니다.");
//				return;
				//예외처리로 변환
				throw new DuplicateIDException("이미 직원이 등록되어 있습니다.");
			}//if
		}//false
		
		if(find == false) { //추가하려는 직원이 없다면
			list.add(e);
			System.out.println(e.getName() + "님은 직원으로 등록되었습니다.");
		}
	}

	@Override
	public void deleteEmployee(String empId) {
		
		boolean find = false;
		
		for (Employee emp : list) {
			if (emp.getEmpId().equals(empId)) {
				find = true;
				System.out.println(emp.getName()+"님이 퇴사처리 되었습니다.");
				list.remove(emp);
				break;
			}// if
			if (find == false) {
				System.out.println("삭제하려는 직원은 존재하지 않습니다.");
			}
		}// for
	}

	@Override
	public void updateEmployee(Employee e) {
		
		boolean find = false;
		
		for (Employee emp : list) {
			if (emp.getEmpId().equals(e.getEmpId())) {
				//name, addr, salary
				find = true;
				emp.setName(e.getName());
				emp.setAddr(e.getAddr());
				emp.setSalary(e.getSalary());
				
				if(emp instanceof Manager) {
					((Manager) emp).changeDept(((Manager) e).getDept());
				} else {
					((Engineer) emp).changeTech(((Engineer) e).getTech());
					((Engineer) emp).changeBonus(((Engineer) e).getBonus());
				}// if
			}// for
		}
		if (find==false) System.out.println("수정할 정보가 존재하지 않습니다. ");
	}

	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		// TODO Auto-generated method stub
		ArrayList<Employee> temp = new ArrayList<Employee>();
		
		for (Employee emp : list) {
			if (emp.getAddr().equals(addr)) {
				temp.add(emp);
			}
		}
		return temp;
	}

	@Override
	public void findEmployees() {
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}
}
