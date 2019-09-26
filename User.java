package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User implements OpstiDomen, Serializable {
	private int id_user;
	private String username;
	private String email;
	private String fullName;
	private String password;
	private String status;

	public User() {

	}

	/*
	 * public User(int id_user, String username, String email, String fullName,
	 * String password) { super(); this.id_user = id_user; this.username = username;
	 * this.email = email; this.fullName = fullName; this.password = password; }
	 */

	public int getId_user() {
		return id_user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return " user ";
	}

	@Override
	public String nazivKolona() {
		// TODO Auto-generated method stub
		return " ( full_name,username,email,password,status ) ";
	}

	@Override
	public String vrednostKolona() {
		// TODO Auto-generated method stub
		return " values ( ?,?,?,?,? ) ";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, fullName);
			preparedStatement.setString(2, username);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
			preparedStatement.setString(5, status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return "id_user";
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen> list = new ArrayList<>();
		try {
			if (resultSet.next()) {
				User user = new User();
				username = resultSet.getString("username");
				password = resultSet.getString("password");
				email = resultSet.getString("email");
				status = resultSet.getString("status");
				fullName = resultSet.getString("full_name");
				id_user = resultSet.getInt("id_user");
				user.setEmail(email);
				user.setFullName(fullName);
				user.setId_user(id_user);
				user.setPassword(password);
				user.setStatus(status);
				user.setUsername(username);
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
