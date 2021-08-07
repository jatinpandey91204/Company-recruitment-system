package com.example.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import com.example.springmvc.model.StudentLogin;
import com.example.springmvc.model.User;
@Component
public class UserDaoImpl implements UserDao {


	@Autowired
	JdbcTemplate jdbcTemplate;

	public void register(User user) {

		String sql = "insert into users values(?,?,?,?,?,?,?,?)";

		jdbcTemplate.update(sql, new Object[] { user.getId(),user.getUsername(), user.getPassword(), user.getFirstname(),
				user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });
	}
	

	  public User validateUser(StudentLogin login) {
		    String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
		        + "'";
		    List<User> users = jdbcTemplate.query(sql, new UserMapper());

		    return users.size() > 0 ? users.get(0) : null;
		  }


	@Override
	public List<User> empList() {
		// TODO Auto-generated method stub
		List<User> list = jdbcTemplate.query("SELECT * FROM users", new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
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

		});

		return list;
	}	
		
	   


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


@Override
public void delete(int id) {
	// TODO Auto-generated method stub
	 String sql="delete from users where id="+id+"";
	 jdbcTemplate.update(sql);
	
}

/*
 * public int update(Emp p){ String
 * sql="update Emp99 set name='"+p.getName()+"', salary="+p.getSalary()+
 * ",designation='"+p.getDesignation()+"' where id="+p.getId()+""; return
 * template.update(sql); }
 */








}