import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcUpdate {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","ishan321");
	Statement stm = con.createStatement();
	while(true) {
		System.out.println("");
		System.out.println("Showing Tables to update");
		System.out.println("=================================");
		System.out.println("Enter 1 to update customer table");
		System.out.println("Enter 2 to update vendor table");
		System.out.println("Enter 3 to update food item table");
		System.out.println("Enter 4 to update login table");
		System.out.println("Enter 5 to update order details table");
		System.out.println("Enter 6 to quit");
		System.out.println("enter your choice:");
		Scanner in = new Scanner(System.in);
		int ch = in.nextInt();
		switch(ch) {
		case 1:
			System.out.println("");
			System.out.println("Showing Attributes of customer table to update");
			System.out.println("===============================================");
			System.out.println("Enter 1 to update customer id");
			System.out.println("Enter 2 to update customer name");
			System.out.println("Enter 3 to update customer phone");
			System.out.println("Enter 4 to update customer email");
			System.out.println("Enter 5 to update customer cupon");
			System.out.println("Enter 6 to update customer wallet balance");
			System.out.println("Enter 7 to terminate the program");
			System.out.println("Enter your choice");
			int ch1 = in.nextInt();
			switch(ch1) {
			case 1:
				System.out.println("enter customer id to update");
				int cid1 = in.nextInt();
				System.out.println("enter updated id");
				int cid2 = in.nextInt();
				int c1=stm.executeUpdate("update customer set customer_id='"+cid2+"' where customer_id='"+cid1+"'");
				System.out.println(c1+" rows updated");
				break;
			case 2:
				System.out.println("enter customer id where you want to change your name");
				int cid3=in.nextInt();
				System.out.println("Enter updated Name");
				String cname1=in.next();
				int c2= stm.executeUpdate("update customer set customer_name='"+cname1+"' where customer_id='"+cid3+"'");
				System.out.println(c2+" record updated");
				break;
			case 3:
				System.out.println("enter customer id where you want to change your phone");
				int cid4=in.nextInt();
				System.out.println("Enter updated phone");
				int cphone=in.nextInt();
				int c3= stm.executeUpdate("update customer set customer_phone='"+cphone+"' where customer_id='"+cid4+"'");
				System.out.println(c3+" record updated");
				break;
			case 4:
				System.out.println("enter customer id where you want to change your email");
				int cid5=in.nextInt();
				System.out.println("Enter updated email");
				String cemail=in.next();
				int c4= stm.executeUpdate("update customer set customer_email='"+cemail+"' where customer_id='"+cid5+"'");
				System.out.println(c4+" record updated");
				break;
			case 5:
				System.out.println("enter customer id where you want to change your cupon");
				int cid6=in.nextInt();
				System.out.println("Enter updated coupon");
				String cupon1=in.next();
				int c5= stm.executeUpdate("update customer set customer_coupon='"+cupon1+"' where customer_id='"+cid6+"'");
				System.out.println(c5+" record updated");
				break;
			case 6:
				System.out.println("enter customer id where you want to change your wallet balance");
				int cid7=in.nextInt();
				System.out.println("Enter updated wallet balance");
				float cbal=in.nextFloat();
				int c6= stm.executeUpdate("update customer set customer_walletbal='"+cbal+"' where customer_id='"+cid7+"'");
				System.out.println(c6+" record updated");
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Invalid input");
			}
			break;
		case 2:
			System.out.println("");
			System.out.println("Showing Attributes of vendor table to update");
			System.out.println("==============================================");
			System.out.println("Enter 1 to update vendor id");
			System.out.println("Enter 2 to update  vendor name");
			System.out.println("Enter 3 to update vendor phone");
			System.out.println("Enter 4 to update vendor specs");
			System.out.println("enter your choice");
			int ch2 = in.nextInt();
			switch(ch2) {
			case 1:
				System.out.println("enter vendor id to update");
				int vid1 = in.nextInt();
				System.out.println("enter updated id");
				int vid2 = in.nextInt();
				int c1=stm.executeUpdate("update vendor set vendor_id='"+vid1+"' where vendor_id='"+vid2+"'");
				System.out.println(c1+" rows updated");
				break;
			case 2:
				System.out.println("enter vendor id where you want to change vendor name");
				int vid3=in.nextInt();
				System.out.println("Enter updated Name");
				String cname1=in.next();
				int c2= stm.executeUpdate("update vendor set vendor_name='"+cname1+"' where vendor_id='"+vid3+"'");
				System.out.println(c2+" record updated");
				break;
			case 3:
				System.out.println("enter vendor id where you want to change vendor phone");
				int vid4=in.nextInt();
				System.out.println("Enter updated phone");
				int vphone=in.nextInt();
				int c3= stm.executeUpdate("update vendor set vendor_phone='"+vphone+"' where vendor_id='"+vid4+"'");
				System.out.println(c3+" record updated");
				break;
			case 4:
				System.out.println("enter vendor id where you want to change vendor specs");
				int vid5=in.nextInt();
				System.out.println("Enter updated vendor specs");
				String vspecs=in.next();
				int c4= stm.executeUpdate("update vendor set vendor_spec='"+vspecs+"' where vendor_id='"+vid5+"'");
				System.out.println(c4+" record updated");
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("invalid input");	
			}
			break;
		case 3: 
			System.out.println("");
			System.out.println("Showing Attributes of food Item table to update");
			System.out.println("==============================================");
			System.out.println("Enter 1 to update food id");
			System.out.println("Enter 2 to update food name");
			System.out.println("Enter 3 to update food price");
			System.out.println("Enter 4 to exit");
			System.out.println("enter options:");
			int ch3 = in.nextInt();
			switch(ch3) {
			case 1:
				System.out.println("enter food id to update");
				int fid1 = in.nextInt();
				System.out.println("enter updated food id");
				int fid2 = in.nextInt();
				int c1=stm.executeUpdate("update fooditem set food_id='"+fid2+"' where food_id='"+fid1+"'");
				System.out.println(c1+" rows updated");
				break;
			case 2:
				System.out.println("enter food id where you want to change food name");
				int fid3=in.nextInt();
				System.out.println("Enter updated Name");
				String fname1=in.next();
				int c2= stm.executeUpdate("update fooditem set food_name='"+fname1+"' where food_id='"+fid3+"'");
				System.out.println(c2+" record updated");
				break;
			case 3:
				System.out.println("enter food id where you want to change food price");
				int fid4=in.nextInt();
				System.out.println("Enter updated price");
				int fprice=in.nextInt();
				int c3= stm.executeUpdate("update fooditem set food_price='"+fprice+"' where food_id='"+fid4+"'");
				System.out.println(c3+" record updated");
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("invalid input");	
			}
			break;
		case 4:
			System.out.println("");
			System.out.println("Showing Attributes of login table to update");
			System.out.println("==============================================");
			System.out.println("Enter 1 to update login id");
			System.out.println("Enter 2 to update password");
			System.out.println("Enter 3 to exit");
			System.out.println("enter options:");
			int ch4 = in.nextInt();
			switch(ch4) {
			case 1:
				System.out.println("enter login id to update");
				int lid1 = in.nextInt();
				System.out.println("enter updated login id");
				int lid2 = in.nextInt();
				int c1=stm.executeUpdate("update login set loginid='"+lid2+"' where loginid='"+lid1+"'");
				System.out.println(c1+" rows updated");
				break;
			case 2:
				System.out.println("enter login id where you want to change password");
				int lid3=in.nextInt();
				System.out.println("Enter updated password");
				String lpass=in.next();
				int c2= stm.executeUpdate("update login set password='"+lpass+"' where loginid='"+lid3+"'");
				System.out.println(c2+" record updated");
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("invalid input");	
			}
			break;
		case 5:
			System.out.println("");
			System.out.println("Showing Attributes of order details table to update");
			System.out.println("===============================================");
			System.out.println("Enter 1 to update order no");
			System.out.println("Enter 2 to update vendor ID");
			System.out.println("Enter 3 to update customer ID");
			System.out.println("Enter 4 to update Food ID");
			System.out.println("Enter 5 to update Quantity");
			System.out.println("Enter 6 to update order date & time");
			System.out.println("Enter 7 to update the order value");
			System.out.println("Enter 8 to update order status");
			System.out.println("Enter 9 to exit");
			int ch5 = in.nextInt();
			switch(ch5) {
			case 1:
				System.out.println("enter order number to update");
				int ordid = in.nextInt();
				System.out.println("enter updated order number");
				int ordid1 = in.nextInt();
				int c1=stm.executeUpdate("update orderdetails set order_no='"+ordid1+"' where order_no='"+ordid+"'");
				System.out.println(c1+" rows updated");
				break;
			case 2:
				System.out.println("enter order number where you want to change vendor ID");
				int vid1=in.nextInt();
				System.out.println("Enter updated vendor ID");
				int vid2=in.nextInt();
				int c2= stm.executeUpdate("update orderdetails set vendor_id='"+vid2+"' where order_no='"+vid1+"'");
				System.out.println(c2+" record updated");
				break;
			case 3:
				System.out.println("enter order number where you want to change your customer ID");
				int cid4=in.nextInt();
				System.out.println("Enter updated customer ID");
				int cid5=in.nextInt();
				int c3= stm.executeUpdate("update orderdetails set customer_id='"+cid5+"' where order_no='"+cid4+"'");
				System.out.println(c3+" record updated");
				break;
			case 4:
				System.out.println("enter order number where you want to change your food ID");
				int ord5=in.nextInt();
				System.out.println("Enter updated food ID");
				int ofid=in.nextInt();
				int c4= stm.executeUpdate("update orderdetails set food_id='"+ofid+"' where order_no='"+ord5+"'");
				System.out.println(c4+" record updated");
				break;
			case 5:
				System.out.println("enter order number where you want to change the quantity");
				int ord6=in.nextInt();
				System.out.println("Enter updated quantity");
				int qty6=in.nextInt();
				int c5= stm.executeUpdate("update orderdetails set qty='"+qty6+"' where order_no='"+ord6+"'");
				System.out.println(c5+" record updated");
				break;
			case 6:
				System.out.println("enter order number where you want to change your date & time");
				int ord7=in.nextInt();
				System.out.println("Enter updated date");
				String ordd=in.next();
				int c6= stm.executeUpdate("update orderdetails set datetime='"+ordd+"' where order_no='"+ord7+"'");
				System.out.println(c6+" record updated");
				break;
			case 7:
				System.out.println("enter order number where you want to change order value");
				int ord8=in.nextInt();
				System.out.println("Enter updated order value");
				float ordv=in.nextFloat();
				int c7= stm.executeUpdate("update orderdetails set order_value='"+ordv+"' where order_no='"+ord8+"'");
				System.out.println(c7+" record updated");
				break;
			case 8:
				System.out.println("enter order number where you want to change your order status");
				int ord9=in.nextInt();
				System.out.println("Enter updated order status");
				String ords=in.next();
				int c8= stm.executeUpdate("update orderdetails set order_status='"+ords+"' where order_no='"+ord9+"'");
				System.out.println(c8+" record updated");
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("Invalid input");
			}
			break;
		case 6:
			System.exit(0);
		default:
			System.out.println("invalid input");
		}
	}
}
}
