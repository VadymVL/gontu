package springTutorial;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UserModel {
	@Size(min=6, max=32)
	private String name;
	@Size(min=6, max=32)//, message="Password must be more then {min} characters and less then {max}!")
	private String password;
	//private Date dateOfBirth;
	@NotEmpty @NotNull
	private String dateOfBirth;
	private Long mobileNumber;
	private List<String> skills;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	/*
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) { //Convert Date to formatted string
		SimpleDateFormat dateFormat = new SimpleDateFormat("E, d MMM yyyy");
		this.dateOfBirth = dateFormat.format(dateOfBirth);;
	}
	
	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
}
