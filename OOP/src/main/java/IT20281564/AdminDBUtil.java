package IT20281564;



import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class AdminDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	//validate Admin login
	public static boolean validate(String username, String password) {

		try {
			con = DataBaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from administrator where AdministratorUsername='"+username+"' and AdministratorcolPassword='"+password+"'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}


	//create admin object to display
	public static List<Administrator> getAdministrator(String Username){
		ArrayList<Administrator> administrator = new ArrayList<Administrator>();
		try {
			con = DataBaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from administrator where AdministratorUsername='"+Username+"' ";
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String username = rs.getString(3);
				String password = rs.getString(4);

				Administrator admin = new Administrator(id, name, username, password);
				administrator.add(admin);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		return administrator;
	}

	//validate package
	public static boolean packageValidate(String packagename) {

		try {
			con = DataBaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from package where packagename='"+packagename+"' ";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	//create package object
	public static List<Package> getPackageDetails(String PackageName){
		ArrayList<Package> pack = new ArrayList<Package>();
		try {
			con = DataBaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from package where packagename='"+PackageName+"' ";
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				int iidpackaged = rs.getInt(1);
				String packagename = rs.getString(2);
				String packageprice = rs.getString(3);
				String peakdata = rs.getString(4);
				String offpeakdata = rs.getString(5);


				Package package1 = new Package(iidpackaged, packagename, packageprice, peakdata, offpeakdata);

				pack.add(package1);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		return pack;
	}

	//insert new package to the database
	public static boolean InsertPackage(String packagename, String packageprice, String peakdata, String offpeakdata) {
		isSuccess =false;
		try {
			con = DataBaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into package values(0,'"+packagename+"','"+packageprice+"','"+peakdata+"','"+offpeakdata+"')";
			int result = stmt.executeUpdate(sql);

			if (result > 0) {
				isSuccess =true;
			}else {
				isSuccess =false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	//update package in database
	public static boolean UpdatePackage(String idpackage, String packagename, String packageprice, String peakdata, String offpeakdata) {

		try {
			con = DataBaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update package set packagename='"+packagename+"',packageprice='"+packageprice+"',peakdata='"+peakdata+"',offpeakdata='"+offpeakdata+"' where idpackage='"+idpackage+"'";
			int result = stmt.executeUpdate(sql);

			if (result > 0) {
				isSuccess = true;

			}else {
				isSuccess = false;
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	//retrieve data after update
	public static List<Package> getUpdatedPackageDetails(String ID){

		int convertedID = Integer.parseInt(ID);
		ArrayList<Package> packa = new ArrayList<Package>();

		try {
			con = DataBaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from package where idpackage='"+convertedID+"' ";
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				int id = rs.getInt(1);
				String paName = rs.getString(2);
				String paprice = rs.getString(3);
				String papeak = rs.getString(4);
				String paoffpeak = rs.getString(5);

				Package package2 = new Package(id, paName, paprice, papeak, paoffpeak);

				packa.add(package2);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return packa;
	}
	
	//Delete Staff Data
	public static boolean DeleteStaff(String Id) {
		
		int convertedStaffID = Integer.parseInt(Id);
		
		try {
			con = DataBaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from staff where idstaff='"+convertedStaffID+"' ";
			int rs = stmt.executeUpdate(sql);
			
			if (rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	//insert new Customer to the database
	public static boolean InsertCustomer(String name, String adreess, String phone, String email) {
		isSuccess =false;
		try {
			con = DataBaseConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into customer values(0,'"+name+"','"+adreess+"','"+phone+"','"+email+"')";
			int result = stmt.executeUpdate(sql);

			if (result > 0) {
				isSuccess =true;
			}else {
				isSuccess =false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}
}








