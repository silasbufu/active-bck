package com.iuri.active_bck.entity.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.iuri.active_bck.entity.event.TestEventAttendance;

@Entity
@Table(name = "active_user")
public class User {

	private Integer userId;
	private String username;
	private String password;
	private String fullName;
	private String email;
	private String role;
	private String phone;
	private byte[] avatar;
	
	private Set<TestEventAttendance> attendance = new HashSet<TestEventAttendance>(0);

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "active_user_gen")
	@SequenceGenerator(name = "active_user_gen", sequenceName = "active_user_user_id_seq")
	@Column(name = "user_id")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public byte[] getAvatar() {
		return avatar;
	}

	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pk.userId", cascade=CascadeType.ALL)
	public Set<TestEventAttendance> getAttendance() {
		return this.attendance;
	}

	public void setAttendance(Set<TestEventAttendance> attendance) {
		this.attendance = attendance;
	}



}
