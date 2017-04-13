package ques1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="aa_Event_Two")

public class EventTwo {
	@Id
	@GeneratedValue
	int id;
	String eventName;
	String duration;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="event_id")
	List<FeedBack2>list;
	
	public EventTwo() {
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<FeedBack2> getList() {
		return list;
	}

	public void setList(List<FeedBack2> list) {
		this.list = list;
	}

	public EventTwo(String eventName, String duration) {
		super();
		this.eventName = eventName;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "EventTwo id= " + id + ", eventName=" + eventName
				+ ", duration=" + duration + ", list=" + list ;
	}
	
	

}
