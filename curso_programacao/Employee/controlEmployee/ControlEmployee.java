package controlEmployee;

import java.util.List;

public class ControlEmployee {
	private Integer id;
	private String name;
	private Double salary;
	
	
	public ControlEmployee() {
	}


	public ControlEmployee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public boolean hasId(List<ControlEmployee> list, int id) {
		ControlEmployee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employee != null;
	}
	
	public void increaseSalary(double percentage) {
		salary += (salary * percentage / 100.0);
	}
	
	public Integer positionID(List<ControlEmployee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}


	@Override
	public String toString() {
		return "ID = " + id + ", "
				+ "Name = " + name + ", "
				+ "Salary = " + salary;
	}
	
	

}
