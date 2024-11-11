package com.spring.jdbc.Dao;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.entities.Employee;

public class EmpDaoImp implements EmpDao{
		
		JdbcTemplate jdbcTemplate;

		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}


		public int insert(Employee employee) {
			// TODO Auto-generated method stub
			String q = "insert into Employee(eid,ename,dname)values(?,?,?)";
			int r = this.jdbcTemplate.update(q,employee.getEid(), employee.getEname(), employee.getDname());
			return r;
		}	
			
		public int update(Employee employee) {
			String m = "update Employee set ename? where eid=? ";
			int r = this.jdbcTemplate.update(m,employee.getEid(), employee.getEname(), employee.getDname());
			return r;
		}	
		public int delete(Employee employee) {
			String n = "delete from Employee where eid=? ";
			int r = this.jdbcTemplate.update(n,employee.getEid(),employee.getEname(,employee.getDname())
			return r;
		}
		
	   public Employee getEmployee(int Eid) {
		   String ea="select from Employee where Eid=?";
		   RawMapper<Employee> rm=new RawmapperImp();
		   Employee employee=this.jdbcTemplate.queryForObject(ea, rm,eid);
		   return employee;
	   }
	   
	   public List<Employee> getAllEmployee() {
		   String a="select *from Employee";
		   List<Employee> employee=this.jdbcTemplate.query(a, new RawMapperImpl());
	   }
	   
}   
		   