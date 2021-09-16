import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
public class jdbcDelete {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","ishan321");
	Statement stm = con.createStatement();
	while(true) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1 to delete record from order details");
		System.out.println("Enter 2 to delete record from customer details");
		System.out.println("Enter 3 to delete record from vendor details");
		System.out.println("Enter 4 to delete record from food item");
		System.out.println("Enter 5 to delete record from login table");
		System.out.println("Enter 6 to quit");
		System.out.println("Enter your choice");
		int ch = in.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter order number to delete the row");
			int r1= in.nextInt();
			int c1= stm.executeUpdate("delete from orderdetails where order_no='"+r1+"'");
			System.out.println(c1+" record deleted");
			break;
		case 2:
			System.out.println("Enter customer id to delete the row");
			int r2 = in.nextInt();
			int c2= stm.executeUpdate("delete from customer where customer_id='"+r2+"'");
			System.out.println(c2+" record deleted");
			break;
		case 3:
			System.out.println("Enter vendor id to delete the row");
			int r3 = in.nextInt();
			int c3=stm.executeUpdate("delete from vendor where vendor_id='"+r3+"'");
			System.out.println(c3+" record deleted");
			break;
		case 4:
			System.out.println("Enter food id to delete the row");
			int r4 = in.nextInt();
			int c4=stm.executeUpdate("delete from fooditem where food_id='"+r4+"'");
			System.out.println(c4+" record deleted");
			break;
		case 5:
			System.out.println("Enter login id to delete the row");
			int r5 = in.nextInt();
			int c5=stm.executeUpdate("delete from login where loginid='"+r5+"'");
			System.out.println(c5+" record deleted");
			break;
		case 6:
			System.exit(0);
		default:
			System.out.println("invalid input");
		}
		
	}
}
}
