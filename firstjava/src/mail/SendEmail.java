package mail;

import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a, b;

		String host = "smtp.naver.com";
		final String user = "wjdskd06";
		final String password = "tmdcks12";

		String to = "wjdskd06@nate.com";

		// Get the session object
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});

		// Compose the message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Subject
//			message.setSubject("[Subject] Java Mail Test");
			System.out.println("메일 제목을 입력 하세요.");
			b = sc.nextLine();
			message.setSubject(b);

			// Text
//			message.setText("Simple mail test..");
			System.out.println("메일 내용을 입력 하세요.");
			a = sc.nextLine();
			message.setText(a);

			// send the message
			Transport.send(message);
			System.out.println("message sent successfully...");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}