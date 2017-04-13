package ques1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aa_feedback_two")
public class FeedBack2 {
	@Id
	@GeneratedValue
	int id;
	String eventFeedBack;
	String empName;
	
	public FeedBack2() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventFeedBack() {
		return eventFeedBack;
	}

	public void setEventFeedBack(String eventFeedBack) {
		this.eventFeedBack = eventFeedBack;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public FeedBack2(String eventFeedBack, String empName) {
		super();
		this.eventFeedBack = eventFeedBack;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "FeedBack2 [id=" + id + ", eventFeedBack=" + eventFeedBack
				+ ", empName=" + empName + "]";
	}
	
	
	
	

	
}
