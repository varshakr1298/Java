/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdb;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author ABC
 */
@JMSDestinationDefinition(name = "jms/myQueue", interfaceName = "javax.jms.Queue", resourceAdapter = "jmsra", destinationName = "myQueue")
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/myQueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class MyBeans implements MessageListener {
    
    public MyBeans() {
    }
    
    @Override
    public void onMessage(Message message) {
        try{
            String ID=message.getStringProperty("ID");
            TextMessage textMessage=(TextMessage)message;
            System.out.print("ID: "+ID);
            System.out.print("Message Received: "+textMessage.getText());
            
        } catch (JMSException ex) {
            Logger.getLogger(MyBeans.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
