package things;

import java.util.Objects;

public class FunDay {
	
	private String name;
	private String day;
	private String timings;
	private String location;
	private String theme;
	private String coordinator;
	
	
	public FunDay() {
		
	}
	public FunDay(String name, String day, String timings, String location, String theme, String coordinator) {
		super();
		this.name = name;
		this.day = day;
		this.timings = timings;
		this.location = location;
		this.theme = theme;
		this.coordinator = coordinator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coordinator, day, location, name, theme, timings);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FunDay other = (FunDay) obj;
		return Objects.equals(coordinator, other.coordinator) && Objects.equals(day, other.day)
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Objects.equals(theme, other.theme) && Objects.equals(timings, other.timings);
	}

	@Override
	public String toString() {
		return "FunDay [name=" + name + ", day=" + day + ", timings=" + timings + ", location=" + location + ", theme="
				+ theme + ", coordinator=" + coordinator + "]";
	}
	
	
	

}
