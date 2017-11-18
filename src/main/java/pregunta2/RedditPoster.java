package pregunta2;

public class RedditPoster extends Sharing{
	@Override
    public void share(String text) {
        System.out.println("Message '" + text + "' posted to Reddit");
    }


}
