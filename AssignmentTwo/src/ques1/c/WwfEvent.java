package ques1.c;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ques1.FeedBack2;

@Entity
@Table(name="aa_w_event")
public class WwfEvent {

	@Id
	@GeneratedValue
	int id;
	@Column(unique=true)
	String eventName;
	@Column(unique=true)
	String eventDuration;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	Set<WwfFeedback>feedbacks;
	
	
	public WwfEvent() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public String getEventDuration() {
		return eventDuration;
	}


	public void setEventDuration(String eventDuration) {
		this.eventDuration = eventDuration;
	}


	public Set<WwfFeedback> getFeedbacks() {
		return feedbacks;
	}


	public void setFeedbacks(Set<WwfFeedback> feedbacks) {
		this.feedbacks = feedbacks;
	}


	public WwfEvent(String eventName, String eventDuration) {
		super();
		this.eventName = eventName;
		this.eventDuration = eventDuration;
	}


	@Override
	public String toString() {
		return "WwfEvent id=  " + id + "  , eventName=   " + eventName
				+ "  , eventDuration=  " + eventDuration + "  , feedbacks= "
				+ feedbacks ;
		
	}
	
	
	
	
	
}
