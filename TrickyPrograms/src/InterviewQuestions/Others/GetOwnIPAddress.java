package InterviewQuestions.Others;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetOwnIPAddress {

	public static void main(String[] args) throws UnknownHostException {

		System.out.println(InetAddress.getLocalHost());

	}

}
