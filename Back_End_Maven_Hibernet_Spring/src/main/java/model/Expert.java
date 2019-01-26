package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("Expert")
public class Expert extends Users {
	public String expertIn;
	public Float expertSalary;

	

	public Float getExpertSalary() {
		return expertSalary;
	}

	public void setExpertSalary(Float expertSalary) {
		this.expertSalary = expertSalary;
	}

	public String getExpertIn() {
		return expertIn;
	}

	public void setExpertIn(String expertIn) {
		this.expertIn = expertIn;
	}

}