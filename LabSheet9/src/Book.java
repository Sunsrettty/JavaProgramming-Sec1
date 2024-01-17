import java.time.Year;
public class Book {
	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return this.title;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public float getprice() {
		return this.price;
	}
	public void setpublishyear(int year) {
		this.publishyear=year;
	}
	public int getpublisheyear() {
		return this.publishyear;
	}
	public int getTotalYear() {
			return Year.now().getValue()-publishyear;
	}
	public String toString() {
		return String.format("Title: "+title+" published for "+getTotalYear()+" year "+price+" baht.");
	}
}
