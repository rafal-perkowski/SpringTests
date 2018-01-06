package pl.reaktor.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TimeData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private int hours;
	private int minutes;
	private int seconds;
	
	public TimeData() {
		super();
	}

	public TimeData(long id, String firstName, String lastName, int hours, int minutes, int seconds) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return "TimeData [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", hours=" + hours
				+ ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

}
