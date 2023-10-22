package entities2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime moment;
	private String tittle;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
		
	}
	
	public Post(LocalDateTime date, String tittle, String content, Integer likes) {
		this.moment = date;
		this.tittle = tittle;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getDate() {
		return moment;
	}

	public void setDate(LocalDateTime date) {
		this.moment = date;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comment> getComments() {
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	public void addLikes() {
		this.likes++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(tittle + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(dtf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
		
	}
	
}
