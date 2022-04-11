import java.io.File;
import java.util.Scanner;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class pics extends ListenerAdapter {
	public static void main(String[] args) throws LoginException{
		
		JDABuilder builder = JDABuilder.createDefault("OTQ2OTc5MTA4OTU1NTA0NjYx.YhmlBQ.RHrHtbz4NHAqGqZ2lvV57y1rfG8");
		builder.addEventListeners(new pics());
		builder.build();
	}
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		System.out.println("We received a message from "+event.getAuthor().getName()+": "+event.getMessage().getContentDisplay());
		
		String input = event.getMessage().getContentRaw();
		MessageChannel channel = event.getChannel();
		String prefix = "&";
		
		if(input.startsWith(prefix)) {
			try{
				int pickImg = ((int)Math.round(Math.random() * 35));
				
				String[] descriptions = {
					"Itachi Uchiha",
					"Itachi Uchiha",
					"Itachi Uchiha",
					"Pain",
					"C.C.",
					"C.C.",
					"Akaza",
					"Akaza 'Destructive Death: Annihilation Type'",
					"Giyu Tomioka",
					"Mahito 'Domain Expansion: Self Embodiment of Perfection'",
					"Mahito",
					"Todo Vs. Megumi",
					"Todo Vs. Yuji",
					"Cursed Tweaker",
					"Yuji X Sukuna",
					"Yuji Itadori",
					"Lucy",
					"Echidna",
					"Beako",
					"Natsuno",
					"Megumi Shimizu",
					"Eleventh",
					"Satoru Gojo",
					"Satoru Gojo 'Cursed Technique Reversal: Red'",
					"Satoru Gojo",
					"Sukuna",
					"Kento Nanami",
					"Sasori",
					"Hidan",
					"Skele Hidan",
					"Kakashi 'Chidori'",
					"Kakashi Hatake",
					"Kakashi Hatake",
					"REAL Naruto",
					"Naruto"
				};
				String description = descriptions[pickImg-1];
				
				EmbedBuilder embed = new EmbedBuilder();
				File file = new File("rsc/theGoods");
				Scanner in = new Scanner(file);
				String first = "";
				for(var i=0; i < pickImg; i++) {
					first = in.next();
				}
				in.close();
				embed.setImage(""+first).setDescription("#"+pickImg+" "+description);
			
				channel.sendFile(file, first).embed(embed.build()).queue();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}