package com;



import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMail {

	
	public  static boolean sendMail(String userName,
    		String passWord,
    		String host,
    		String port,
    		String starttls,
    		String auth,
    		boolean debug,
    		String socketFactoryClass,
    		String fallback,
    		String[] to,
    		String[] cc,
    		String[] bcc,
    		String subject,
    		String text,
    		String attachmentPath,
    		String attachmentName)
		{


		   Properties props = new Properties();

           //Properties props=System.getProperties();

   //props.put("mail.smtp.user", userName);

   props.setProperty("mail.smtp.host", host); 

   //        if(!"".equals(port))

   //props.put("mail.smtp.port", port);

   //        if(!"".equals(starttls))

   //props.put("mail.smtp.starttls.enable",starttls);

   //props.put("mail.smtp.auth", auth);
  // props.put("mail.smtps.auth", "true");


   /*        if(debug){

           props.put("mail.smtp.debug", "true");

           }else{

           props.put("mail.smtp.debug", "false");         

           }

           if(!"".equals(port))

   props.put("mail.smtp.socketFactory.port", port);

           if(!"".equals(socketFactoryClass))

   props.put("mail.smtp.socketFactory.class",socketFactoryClass);

           if(!"".equals(fallback))

   props.put("mail.smtp.socketFactory.fallback", fallback);
	*/


   try

   {

       Session session = Session.getDefaultInstance(props);

       session.setDebug(debug);

       MimeMessage msg = new MimeMessage(session);

//       msg.setText(text);

       msg.setSubject(subject);
       //attachment start
       // create the message part 
	    // Set the RFC 822 "From" header field using the
	    // value of the InternetAddress.getLocalAddress method.
      
       
       MimeBodyPart messageBodyPart = new MimeBodyPart();
       messageBodyPart.setText(text);
       
       Multipart multipart = new MimeMultipart();
       multipart.addBodyPart(messageBodyPart);
       
       //part 2 
       messageBodyPart = new MimeBodyPart();
       DataSource source = 
         new FileDataSource(attachmentPath);
       
       
       messageBodyPart.setDataHandler(
         new DataHandler(source));
       
       messageBodyPart.setFileName(attachmentName);
       multipart.addBodyPart(messageBodyPart);
       
       // attachment ends

       // Put parts in message
       msg.setContent(multipart);
       msg.setFrom(new InternetAddress("raghavender@ed-ventures-online.com"));

                   for(int i=0;i<to.length;i++){

       msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));

                   }

                   for(int i=0;i<cc.length;i++){

       msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc[i]));

                   }

                   for(int i=0;i<bcc.length;i++){

       msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc[i]));

                   }

       msg.saveChanges();

	    Transport.send(msg);
					
     return true;

   }

   catch (Exception mex)

   {

       mex.printStackTrace();

       return false;

   }

}

	
	public  static boolean MultipleAttachments(String userName,
    		String passWord,
    		String host,
    		String port,
    		String starttls,
    		String auth,
    		boolean debug,
    		String socketFactoryClass,
    		String fallback,
    		String[] to,
    		String[] cc,
    		String[] bcc,
    		String subject,
    		String text,
    		String[] attachFiles)
		{


			   Properties props = new Properties();
			   props.setProperty("mail.smtp.host", host); 
			   try
			   {
			       Session session = Session.getDefaultInstance(props);
			       session.setDebug(debug);
			       MimeMessage msg = new MimeMessage(session);
			       msg.setSubject(subject);
			       //attachment start
			       MimeBodyPart messageBodyPart = new MimeBodyPart();
			       messageBodyPart.setText(text);
			       
			       Multipart multipart = new MimeMultipart();
			       multipart.addBodyPart(messageBodyPart);
			       
			       //part 2 
			      
			       if (attachFiles != null && attachFiles.length > 0) {
			           for (String filePath : attachFiles) {
			        	   messageBodyPart = new MimeBodyPart();
			        	   DataSource source = 
			  			         new FileDataSource(filePath);
			        	   messageBodyPart.setDataHandler(
			    			       new DataHandler(source));
			        	   
			               MimeBodyPart attachPart = new MimeBodyPart();

			               try {
			                   attachPart.attachFile(filePath);
			               } catch (IOException ex) {
			                   ex.printStackTrace();
			               }

			               multipart.addBodyPart(attachPart);
			           }
			       }
			       
			       // attachment ends
			       
			       // Put parts in message
			       msg.setContent(multipart);
			       msg.setFrom(new InternetAddress("raghavender@ed-ventures-online.com"));
			                   for(int i=0;i<to.length;i++){
			                	   msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));
			                   }
			                   for(int i=0;i<cc.length;i++){
			                	   msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc[i]));
			                   }
			                   for(int i=0;i<bcc.length;i++){
			                	   msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc[i]));
			                   }
			       msg.saveChanges();
			      Transport.send(msg);
				 return true;
			   }
			   catch (Exception mex)
			   {
			       mex.printStackTrace();
			       return false;
			   }
			}
	
	
	
}





//String[] to={"raghavender@ed-ventures-online.com"};
//String[] cc={};
//String[] bcc={};
//	
//SendMail.sendMail("",
//		            "",
//		            "192.168.1.20",
//		            "25",
//		            "false",
//		            "false",
//		            true,
//		            "javax.net.ssl.SSLSocketFactory",
//		            "true",
//		            to,
//		            cc,
//		            bcc,
//		            "User has successfully entered into the course ",
//		            "",
//		            "",
//		            "");











    		                
		    	