package model.domain;

public class PeopleVO {
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String birthday;
	
	public PeopleVO(){}

	public PeopleVO(String id, String pw, String name, String gender, String birthday) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "PeopleVO [id=" + id + ", pw=" + pw + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
