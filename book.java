public class book {
	
	public String title;
	public String author;
	public int pub;
	public book(String title,String author,int pub){
		this.title=title;
		this.author=author;
		this.pub=pub;
	}
	public void CALL() {
	    System.out.println("Title: " + title);
	    System.out.println("Author: " + author);
	    System.out.println("publication year: " + pub);
	}
