package hotel;
import hotel.room.Room;
import hotel.customer.Customer;
import hotel.employee.Employee;

public class Hotel{
	

public void addHotel(String hname){
	
	System.out.println("i am calling from add hotel");
}



public static void main(String args[]){
	
Hotel obj=new Hotel();
obj.addHotel("Raddison");

Room roj=new Room();
Customer coj=new Customer();
Employee eoj=new Employee();
roj.addRoom();
coj.addCustomer();
eoj.addEmployee();

}


}