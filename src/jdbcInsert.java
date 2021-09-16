import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class jdbcInsert{
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","ishan321");
		Statement stm = con.createStatement();
		
		
		while(true) {
		System.out.println("");
		System.out.println("Enter 1 to insert into customer table");
		System.out.println("Enter 2 to insert into vendor table");
		System.out.println("Enter 3 to insert into food item table");
		System.out.println("Enter 4 to insert into login table");
		System.out.println("Enter 5 to insert into order details table");
		System.out.println("Enter 6 to quit");
		Scanner in = new Scanner(System.in);
		int ch = in.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter customer ID");
			int cid = in.nextInt();
			System.out.println("Enter customer name");
			String cname = in.next();
			System.out.println("Enter phone no of customer");
			int cphone = in.nextInt();
			System.out.println("Enter customer email");
			String cemail = in.next();
			System.out.println("enter customer cupon");
			String cupon = in.next();
			System.out.println("Enter customer wallet balance");
			float walletbal = in.nextFloat();
			int c1;
			c1 = stm.executeUpdate("insert into customer values('"+cid+"','"+cname+"','"+cphone+"','"+cemail+"','"+cupon+"','"+walletbal+"')");
			System.out.println(c1+" record inserted");
			break;
		case 2:
			System.out.println("enter vendor id");
			int vid = in.nextInt();
			System.out.println("enter vendor name");
			String vname = in.next();
			System.out.println("Enter vendor phone");
			int vphone = in.nextInt();
			System.out.println("Vendor specs");
			String vspec = in.next();
			int c2;
			c2=stm.executeUpdate("insert into vendor values('"+vid+"','"+vname+"','"+vphone+"','"+vspec+"')");
			System.out.println(c2+" record inserted");
			break;
		case 3:
			System.out.println("enter food ID");
			int fid = in.nextInt();
			System.out.println("enetr food name");
			String fname = in.next();
			System.out.println("enter food price");
			float fprice = in.nextFloat();
			int c3;
			c3=stm.executeUpdate("insert into fooditem values('"+fid+"','"+fname+"','"+fprice+"')");
			System.out.println(c3+" record inserted");
			break;
		
		case 4:
			System.out.println("enter login ID");
			int lid = in.nextInt();
			System.out.println("enter password");
			String pass= in.next();
			int c4;
			c4 = stm.executeUpdate("insert into login values('"+lid+"','"+pass+"')");
			System.out.println(c4+" record inserted");
			break;
		case 5:
			System.out.println("enter order number");
			int ordno=in.nextInt();
			System.out.println("enter vendor id");
			int ovid = in.nextInt();
			System.out.println("enter customer id");
			int ocid = in.nextInt();
			System.out.println("enter food id");
			int ofid = in.nextInt();
			System.out.println("enter quantity");
			int qty = in.nextInt();
			System.out.println("Enter date & time");
			String dt= in.next();
			System.out.println("enter order value incl gst");
			int ordval= in.nextInt();
			System.out.println("enter status of the order");
			String ordst=in.next();
			int c5;
			c5=stm.executeUpdate("insert into orderdetails values('"+ordno+"','"+ovid+"','"+ocid+"','"+ofid+"','"+qty+"','"+dt+"','"+ordval+"','"+ordst+"')");
			System.out.println(c5+" Record Inserted");
			break;
		case 6:
			System.exit(0);
		}
	}
}
}