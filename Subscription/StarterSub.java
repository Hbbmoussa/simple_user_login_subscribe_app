package Subscription;

import app_Enum.SubscriptionDuration;

public class StarterSub extends Subscription{


	public StarterSub(double amount, SubscriptionDuration durationInMonth, String name, int totalNoOfTodos) {
		super(amount, durationInMonth, name, totalNoOfTodos);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean canAddToDo() {
		// TODO Auto-generated method stub
		boolean isAbleToAddTodo = this.getTotalNoOfTodos() < 2;
		return isAbleToAddTodo;
	}

}
