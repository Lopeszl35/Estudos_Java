package program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities2.Comment;
import entities2.Post;

public class Program2 {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome");
		
		LocalDateTime date = LocalDateTime.parse("21/06/2018 13:05:44", dtf);
		
		Post p1 = new Post(date, 
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country", 
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);

	}

}
