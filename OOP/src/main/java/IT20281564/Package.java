package IT20281564;

public class Package {
	
	private int idpackage;
	private String packagename, packageprice, peakdata,offpeakdata;
	
	
	public Package(int idpackage, String packagename, String packageprice, String peakdata, String offpeakdata) {
		
		this.idpackage = idpackage;
		this.packagename = packagename;
		this.packageprice = packageprice;
		this.peakdata = peakdata;
		this.offpeakdata = offpeakdata;
	}
	public int getIdpackage() {
		return idpackage;
	}
	public String getPackagename() {
		return packagename;
	}
	public String getPackageprice() {
		return packageprice;
	}
	public String getPeakdata() {
		return peakdata;
	}
	public String getOffpeakdata() {
		return offpeakdata;
	}

	
}
