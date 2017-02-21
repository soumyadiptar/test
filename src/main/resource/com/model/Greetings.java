package resource.com.model;

public class Greetings {
	
	private String id;
	private String content;
	
	public Greetings(String id, String content) {
		this.id = id;
		this.content=content;
		
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
