package Subscription;

import app_Enum.SubscriptionDuration;

public class GrowerSub extends Subscription{



	public GrowerSub(double amount, SubscriptionDuration durationInMonth, String name, int totalNoOfTodos) {
		super(amount, durationInMonth, name, totalNoOfTodos);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean canAddToDo() {
		// TODO Auto-generated method stub
		return true;
	}

}
