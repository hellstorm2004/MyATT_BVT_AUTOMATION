package com.test.helper;

/**
 * @author sm187t
 *
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	public static void main (String args []) {
		// Recipient's email ID needs to be mentioned.
		String recipient1  = "sm187t@att.com";
		String recipient2  = "ds7331@att.com";
		String recipient3  = "bm522y@att.com";
		String recipient4  = "rg615f@att.com";
		String recipient5  = "js0057476@techmahindra.com";

		// Sender's email ID needs to be mentioned
		String from = "sm187t@att.com";

		// Assuming you are sending email from localhost
		String host = "135.31.41.113";

		// Get system properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.put("mail.host", host);
		properties.put("mail.transport.protocol.", "smtp");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.", "true");
		properties.put("mail.smtp.port", "25");
		properties.put("mail.smtp.socketFactory.fallback", "false");
		// properties.put("mail.smtp.ssl.enable", true);

		// Get the default Session object.
		Session session = Session.getDefaultInstance(properties, null);

		try{
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient1));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient2));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient3));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient4));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient5));
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/YYYY");
			String todaysDate = simpleDateFormat.format(new Date());
			// Set Subject: header field
			message.setSubject("BVT Validation: " + todaysDate);

			// Send the actual HTML message, as big as you like
			message.setContent("<h1>The Login Process was Completed Successfully</h1>",
					"text/html" );

			// Send message
			Transport transport = session.getTransport("smtp");
			transport.connect(host, "sm187t", "Hellstorm2100");
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}

	}

	public void sendMail () {

		// Recipient's email ID needs to be mentioned.
		String recipient1  = "sm187t@att.com";
	/*	String recipient2  = "ds7331@att.com";
		String recipient3  = "bm522y@att.com";
		String recipient4  = "rg615f@att.com";
		String recipient5  = "js0057476@techmahindra.com";*/

		// Sender's email ID needs to be mentioned
		String from = "sm187t@att.com";

		// Assuming you are sending email from localhost
		String host = "135.31.41.113";

		// Get system properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.put("mail.host", host);
		properties.put("mail.transport.protocol.", "smtp");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.", "true");
		properties.put("mail.smtp.port", "25");
		properties.put("mail.smtp.socketFactory.fallback", "false");

		// Get the default Session object.
		Session session = Session.getDefaultInstance(properties, null);

		try{
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient1));
			/*message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient2));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient3));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient4));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient5));*/

			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/YYYY");
			String todaysDate = simpleDateFormat.format(new Date());
			// Set Subject: header field
			message.setSubject("BVT Validation: " + todaysDate);

			// Send the actual HTML message, as big as you like
			message.setContent("<h1>The Login Process was Completed Successfully</h1>", "text/html" );

			// Send message
			Transport transport = session.getTransport("smtp");
			transport.connect(host, "sm187t", "Hellstorm2100");
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}

}

