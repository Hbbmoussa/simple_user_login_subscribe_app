package Subscription;
import app_Enum.SubscriptionDuration;

public abstract class Subscription {
	private double amount;
	private SubscriptionDuration durationInMonth;
	private String name;
	private int totalNoOfTodos;
	
	
	
	public Subscription(double amount, SubscriptionDuration durationInMonth, String name, int totalNoOfTodos) {
		super();
		this.amount = amount;
		this.durationInMonth = durationInMonth;
		this.name = name;
		this.totalNoOfTodos = totalNoOfTodos;
	}



	abstract boolean canAddToDo();



	public int getTotalNoOfTodos() {
		return totalNoOfTodos;
	}



	public void setTotalNoOfTodos(int totalNoOfTodos) {
		this.totalNoOfTodos = totalNoOfTodos;
	}

	
}
