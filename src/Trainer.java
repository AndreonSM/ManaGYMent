
public class Trainer {
	/* 
	 * 
	 * 	The Gym hall aggregates several equipments.
	 	Each hall opens 12 hours a day.
		Each trainer works 8 hours a day in one hall.
		A trainer submits a daily exercise plan with steps assigned to each equipment for a specified
duration in minutes.
		Each customer subscribe to a particular hall, at a particular time and date, with a particular
trainer, with a specified exercise plan for one month.
	 * */
	
	public Integer id;
	
	String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
