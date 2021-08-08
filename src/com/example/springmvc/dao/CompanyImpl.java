package com.example.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.springmvc.dao.UserDaoImpl.UserMapper;
import com.example.springmvc.model.Companylogin;
import com.example.springmvc.model.Companyregistration;
import com.example.springmvc.model.StudentLogin;
import com.example.springmvc.model.User;

@Component
public class CompanyImpl implements CompanyDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void register(Companyregistration user) {

		String sql = "insert into company values(?,?,?,?,?,?,?,?)";

		jdbcTemplate.update(sql, new Object[] { user.getId(), user.getUsername(), user.getPassword(),
				user.getFirstname(), user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });
	}

	public User validateUser(Companylogin login) {
		String sql = "select * from company where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";
		List<User> users = jdbcTemplate.query(sql, new UserMapper());

		return users.size() > 0 ? users.get(0) : null;
	}

	
	  @Override
	  
	  public List<Companyregistration> empList() { // TODO Auto-generated method stub List<User>
		  List<Companyregistration> list = jdbcTemplate.query("SELECT * FROM company", new RowMapper<Companyregistration>() {
	  
	  @Override public Companyregistration mapRow(ResultSet rs, int rowNum) throws SQLException {
	  Companyregistration user = new Companyregistration(); 
	  user.setId(rs.getInt("id"));
	  user.setUsername(rs.getString("username"));
	  user.setPassword(rs.getString("password"));
	  user.setFirstname(rs.getString("firstname"));
	  user.setLastname(rs.getString("lastname"));
	  user.setEmail(rs.getString("email"));
	  user.setAddress(rs.getString("address")); user.setPhone(rs.getInt("phone"));
	  
	  return user; }
	  
	  });
	  
	  return list; }
	 

	class UserMapper implements RowMapper<User> {

		public User mapRow(ResultSet rs, int arg1) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setFirstname(rs.getString("firstname"));
			user.setLastname(rs.getString("lastname"));
			user.setEmail(rs.getString("email"));
			user.setAddress(rs.getString("address"));
			user.setPhone(rs.getInt("phone"));

			return user;
		}
	}

	/*
	 * @Override public void delete(int id) { // TODO Auto-generated method stub
	 * String sql="delete from users where id="+id+""; jdbcTemplate.update(sql);
	 * 
	 * }
	 */

}
