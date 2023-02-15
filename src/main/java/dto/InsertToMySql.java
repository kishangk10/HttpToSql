package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "HttpToMySql")
public class InsertToMySql {
	@Id
	private int uid;
	private String gmail;
	private String pwd;
	private String gender;
	private String country;
	
	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}



	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
