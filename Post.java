public class Post{
	
	private String accountName;
	private String fileName;
	private String title;
	private String likes;
	
	public Post(String accountName, String title, String fileName, String likes){
		this.accountName = accountName;
		this.title = title;
		this.fileName = fileName;
		this.likes = likes;
	}
	public String getPostAccount(){
		return accountName;
	}
	public String getFileName(){
		return fileName;
	}
	public String getDescription(){
		return title;
	}
	public String getNumberOfLikes(){
		return likes;
	}
	
}
