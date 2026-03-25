package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String momment = "21/03/2018 13:05:44";
		String title = "Traveling to New Zeland";
		int likes = 12;
		String content = "I'm going to visit this wonderful Country";
		String comment1 = "Have a nice Trip";
		String comment2 = "Wow that's awesome!";

		Post post = new Post(sdf.parse(momment), title, content, likes);
		
		Comment c1 = new Comment(comment1);
		Comment c2 = new Comment(comment2);
		post.addComment(c1);
		post.addComment(c2);
		
		momment = "28/07/2018 33:14:34";
		title = "Good Night Guys";
		likes = 5;
		content = "See you tomorrow";
		String comment3 = "Good Night";
		String comment4 = "May the force be with you!";

		Post p2 = new Post(sdf.parse(momment), title, content, likes);
		
		Comment c3 = new Comment(comment3);
		Comment c4 = new Comment(comment4);
	    p2.addComment(c3);
	    p2.addComment(c4);
     		
		System.out.println(post);
		System.out.println(p2);
	}

}
