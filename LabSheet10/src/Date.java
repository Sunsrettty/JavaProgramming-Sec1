
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	Date(){
		dMonth=1;
		dDay=1;
		dYear=1900;
	}
	public Date(int year,int month,int day){
		dYear=year;
		dMonth=month;
		dDay=day;
	}
	public void setDate(int month,int year,int day) {
		dYear=year;
		dMonth=month;
		dDay=day;
	}
	public int getYear() {
		return dYear;
	}
	public int getMonth() {
		return dMonth;
	}
	public int getDay() {
		return dDay;
	}
	public String toString() {
		return dMonth+"-"+dDay+"-"+dYear;
	}
	
}
