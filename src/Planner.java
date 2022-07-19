
public class Planner {
	/*
  	The Gym hall aggregates several equipments.
 	Each hall opens 12 hours a day.
	Each trainer works 8 hours a day in one hall.
	A trainer submits a daily exercise plan with steps assigned to each equipment for a specified
duration in minutes.
	Each customer subscribe to a particular hall, at a particular time and date, with a particular
trainer, with a specified exercise plan for one month.

 */
	
	Integer planID;
	
	Integer trainerID;

	Integer customerID;
	
	Integer equipmentID;
	
	Integer duration;
	
	public Integer getPlanID() {
		return planID;
	}

	public void setPlanID(Integer planID) {
		this.planID = planID;
	}

	public Integer getTrainerID() {
		return trainerID;
	}

	public void setTrainerID(Integer trainerID) {
		this.trainerID = trainerID;
	}

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

	public Integer getEquipmentID() {
		return equipmentID;
	}

	public void setEquipmentID(Integer equipmentID) {
		this.equipmentID = equipmentID;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	
	
}
