package hotel;
import hotel.room.Room;
import hotel.customer.Customer;
import hotel.employee.Employee;
import hotel.employee.permanent.Permanent;
import hotel.employee.temporary.Temporary;

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
Permanent poj=new Permanent();
Temporary toj=new Temporary();
toj.dispWorkingPeriod();
poj.dispSalary();
roj.addRoom();
coj.addCustomer();
eoj.addEmployee();

}


}