package Opps;
class ExamHall{
	void Enter() {
		System.out.println("You can access the "
				+ "exam Hall");
	}
}
class HallTicket extends ExamHall{
	void hallticket() {
		System.out.println("Hallticket is there");
	}
}
class Students extends HallTicket{
	void Exam() {
		System.out.println("I am Writing exam");
	}
}
class staff extends ExamHall{
	void Access() {
		System.out.println("you want to maintain the ExamHall");
	}
}
public class HybridEx {

	public static void main(String[] args) {
		Students obj=new Students();
		obj.hallticket();
		obj.Enter();
		obj.Exam();
		staff obj2=new staff();
		obj2.Access();
		obj2.Enter();
	}
}
