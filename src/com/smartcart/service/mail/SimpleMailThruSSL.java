package com.smartcart.service.mail;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
 import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SimpleMailThruSSL {
public static void main(String[] args)
{
ResourceBundle rb= ResourceBundle.getBundle("com//smartcart//service//mail",Locale.US);
final String usname= rb.getString("usname");
final String pssword= rb.getString("paswd");
String fromAddr=rb.getString("from");
String toAddr=rb.getString("to");
String subject=rb.getString("subject");
String text=rb.getString("text");

Properties props= new Properties();
props.put("mail.smtp.host", "smtp.gmail.com");
props.put("mail.smtp.socketFactory.port", "465");
props.put("mail.smtp.socketFactory.class",
		"javax.net.ssl.SSLSocketFactory");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.port", "465");


Session session = Session.getDefaultInstance(props,
		new javax.mail.Authenticator() {
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(usname, pssword);
	}
});

Message message= new MimeMessage(session);
message.setFrom(new InternetAddress (fromAddr));
message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddr));
message.setSubject(subject+"-SimplemailThruSSL");
message.setText(text);

Transport.send(message);

System.out.println("Sent!");

}
