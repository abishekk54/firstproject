package ques2;

import javax.persistence.Embeddable;

@Embeddable
public class Manufacturer {
	int manf_id;
	String manuf_name;

	public Manufacturer() {
		// TODO Auto-generated constructor stub
	}

	public Manufacturer(int manf_id, String manuf_name) {
		super();
		this.manf_id = manf_id;
		this.manuf_name = manuf_name;
	}

	public int getManf_id() {
		return manf_id;
	}

	public void setManf_id(int manf_id) {
		this.manf_id = manf_id;
	}

	public String getManuf_name() {
		return manuf_name;
	}

	public void setManuf_name(String manuf_name) {
		this.manuf_name = manuf_name;
	}

}
