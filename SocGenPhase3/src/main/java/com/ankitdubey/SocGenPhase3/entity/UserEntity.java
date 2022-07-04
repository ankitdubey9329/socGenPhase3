package com.ankitdubey.SocGenPhase3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_Id", nullable=false)
	@Size(min=5,max=30)
	private int id;
	
	@Column(name = "user_name", nullable=false)
	@Size(min=5,max=30)
	private String username;
	
	
	
	@Column(name = "email", nullable=false)
	private String email;
	
	@Column(name = "mobile_no", nullable=false)
	@Size(min=10,max=10)
	private String mobile;
	
	@Column(name = "is_admin", nullable=false, insertable=false)
	private String isAdmin;
	
	@Column(name = "confirmed", nullable=false)
	private Boolean confirmed;
	
	@Column(name = "TechSkills", nullable=false)
	private List<Pair<String, Integer>> t_scores = new ArrayList<>();
	
	
	@Column(name = "SoftSkills", nullable=false)
	private List<Pair<String, Integer>> s_scores = new ArrayList<>();
	
	public UserEntity(){
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Boolean getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}
	
	public void setT_score(List<Pair<String, Integer>> t_score) {
		this.t_score = t_score;
	}
	public List<Pair<String, Integer>> getT_score() {
		return t_score;
	}
	
	
	public void setS_score(List<Pair<String, Integer>>s_score) {
		this.s_score =s_score;
	}
	
	public List<Pair<String, Integer>> getS_score() {
		return s_score;
	}
	
	

	
	public UserEntity(String username, String password, String email, String mobile, String isAdmin, Boolean confirmed) {
		super();
		this.username = username;
		
		this.email = email;
		this.mobile = mobile;
		this.isAdmin = isAdmin;
		this.confirmed = confirmed;
		this.s_score=s_score;
		this.t_score=t_score;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + username + ", password=" + password + ", email=" + email + ", mobile="
				+ mobile + ", isAdmin=" + isAdmin + ", confirmed=" + confirmed + "]";
	}
	
	
	
}
