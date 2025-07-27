package Activities;
abstract class Book 
{
	String title;
	abstract void settitle(String S);
	
     String gettitle()
     {
     return title;
     }
}

class Books extends Book
{
	public void settitle(String S) 
	{
		title=S;
	}	
}
public class Activity5
{
	public static void main(String[] args)
	{
		String title="The racer";
		Books b=new Books();
		b.settitle(title);
		System.out.println("The title of the book "+b.gettitle());
	}
}