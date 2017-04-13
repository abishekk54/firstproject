package ques1.c;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aa_w_feedback")
public class WwfFeedback {
	
	@Id
	@GeneratedValue
	int id;
	String feedback;
	String name;
	
	public WwfFeedback() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WwfFeedback( String feedback, String name) {
		super();
		
		this.feedback = feedback;
		this.name = name;
	}

	@Override
	public String toString() {
		return "WwfFeedback  id=  " + id + " , feedback=  " + feedback + "  , name="
				+ name +"\n";
	}
	
	

}
