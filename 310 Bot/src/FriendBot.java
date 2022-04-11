import net.dv8tion.jda.api.JDABuilder;

public class FriendBot {
	public static JDABuilder jda;
	
	public static void main(String [] args) throws Exception{
		try {
			JDABuilder jda = JDABuilder.createDefault("OTQ2NTU3NjM5ODg4ODc1NTIx.Yhgcfw.8pwpxMu-dczDed_8-ECWbZ6CPzk");
			jda.addEventListeners(new MyEventListener());	//Adds Event Listener
			jda.build();	//Builds Bot
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}