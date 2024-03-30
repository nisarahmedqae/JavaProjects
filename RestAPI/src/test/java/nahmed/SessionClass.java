package nahmed;

import io.restassured.filter.session.SessionFilter;

public class SessionClass {

	public static void main(String[] args) {
		
		SessionFilter sessionFilter = new SessionFilter();
		/* Used in given().filter(sessionFilter) to keep authorized from previous login to check 
		other APIs which required previous session */
		
		/* given().urlEncodingEnabled(false); 
		 * This urlEncodingEnabled is used to ignore % or special characters and read them as string*/

	}

}
