package algorithmsandconstructs.s2019148;

import java.io.BufferedReader;
import java.io.IOException;

import algorithmsandconstructs.FeedFactoryInterface;
import algorithmsandconstructs.FeedInterface;
import algorithmsandconstructs.FeedItem;

public class FeedFactory implements FeedFactoryInterface {

	@Override
	public FeedInterface createFeed(BufferedReader in) throws IOException {

		FeedInterface feed = new Feed();
		while (in.ready()) {
			try {

				feed.addItem(new FeedItem(in.readLine(), in.readLine()));
			}

			catch (Exception e) {
				
				System.err.println("Error");
			}

		}
		return feed;
	}
}

/**
 * 
 * while ( (line1=in.readLine()) != null){ line2= in.readLine();
 * myFeed.addItem(new FeedItem(line1,line2)); }
 */
