/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartClassEx;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author JITHIN.P
 */
  enum MessageResult
    {
        YES_OK ,
        NO,
        CANCEL,
        VOID
    }

 enum MessageType
  {
    SIMPLE,
    CONFIRM,
    OPTION,
    INTERNAL
  }

public class MessageBox
{
     public static MessageResult showMessage( String sMessage  ,MessageType messageType )
    {
      int nResult = 256;
      
      if(messageType == MessageType.SIMPLE )
      {
          JOptionPane.showMessageDialog(null, sMessage);
      }
      else if(messageType == MessageType.CONFIRM )
      {
           nResult = JOptionPane.showConfirmDialog(null, sMessage);
      }
      return getMessageResult(nResult);
              
              
    }
    public static MessageResult showMessage(JFrame parent, String sMessage  ,MessageType messageType )
    {
      int nResult = 256;
      
      if(messageType == MessageType.SIMPLE )
      {
          JOptionPane.showMessageDialog(parent, sMessage);
      }
      else if(messageType == MessageType.CONFIRM )
      {
           nResult = JOptionPane.showConfirmDialog(parent, sMessage);
      }
      return getMessageResult(nResult);
              
              
    }
     
   public static MessageResult showMessage(JDialog parent, String sMessage  ,MessageType messageType )
    {
      int nResult = 256;
      
      if(messageType == MessageType.SIMPLE )
      {
          JOptionPane.showMessageDialog(parent, sMessage);
      }
      else if(messageType == MessageType.CONFIRM )
      {
           nResult = JOptionPane.showConfirmDialog(parent, sMessage);
      }
     
      return getMessageResult(nResult);
              
              
    }
     public static MessageResult showMessage( String sMessage,String sTitle,MessageType messageType)
    {  
      int nResult =256;
    
      if(messageType == MessageType.SIMPLE )
      {
          JOptionPane.showMessageDialog(null, sMessage,sTitle,JOptionPane.PLAIN_MESSAGE);
      }
      else if(messageType == MessageType.CONFIRM )
      {
          nResult = JOptionPane.showConfirmDialog(null, sMessage,sTitle,JOptionPane.PLAIN_MESSAGE);
      }
      
      return getMessageResult(nResult);
    }
    public static MessageResult showMessage(JFrame parent, String sMessage,String sTitle,MessageType messageType)
    {  
      int nResult =256;
    
      if(messageType == MessageType.SIMPLE )
      {
          JOptionPane.showMessageDialog(parent, sMessage,sTitle,JOptionPane.PLAIN_MESSAGE);
      }
      else if(messageType == MessageType.CONFIRM )
      {
          nResult = JOptionPane.showConfirmDialog(parent, sMessage,sTitle,JOptionPane.PLAIN_MESSAGE);
      }
      
      return getMessageResult(nResult);
    }
        
    public static MessageResult showMessage(JDialog parent, String sMessage,String sTitle,MessageType messageType)
    {  
      int nResult =256;
    
      if(messageType == MessageType.SIMPLE )
      {
          JOptionPane.showMessageDialog(parent, sMessage,sTitle,JOptionPane.PLAIN_MESSAGE);
      }
      else if(messageType == MessageType.CONFIRM )
      {
          nResult = JOptionPane.showConfirmDialog(parent, sMessage,sTitle,JOptionPane.PLAIN_MESSAGE);
      }
      
      return getMessageResult(nResult);
    }
    
    
    public static MessageResult showMessage(JFrame parent, String sMessage,String sTitle,int messageOption ,MessageType messageType)
    {
      int nResult = 256;
       if(messageType == MessageType.SIMPLE )
      {
          JOptionPane.showMessageDialog(parent, sMessage,sTitle,messageOption);
      }
      else if(messageType == MessageType.CONFIRM )
      {
          nResult = JOptionPane.showConfirmDialog(parent, sMessage,sTitle,messageOption);
      }
      return getMessageResult(nResult);
    }
    
    public static MessageResult showMessage(JDialog parent, String sMessage,String sTitle,int messageOption ,MessageType messageType)
    {
      int nResult = 256;
       if(messageType == MessageType.SIMPLE )
      {
          JOptionPane.showMessageDialog(parent, sMessage,sTitle,messageOption);
      }
      else if(messageType == MessageType.CONFIRM )
      {
          nResult = JOptionPane.showConfirmDialog(parent, sMessage,sTitle,messageOption);
      }
      return getMessageResult(nResult);
    }
    
    
    public static MessageResult showMessage(JFrame parent, String sMessage,String sTitle,int messageOption ,int messageType)
    {
       
        int nResult =  JOptionPane.showOptionDialog(parent, sMessage, sTitle,messageOption, messageType, null,null, null);
         
        return getMessageResult(nResult);
    }
    
    
    private static MessageResult getMessageResult(int nResult)
    {
         switch(nResult)
         {
          case JOptionPane.YES_OPTION:
          {
           return MessageResult.YES_OK;
          }
          case JOptionPane.NO_OPTION:
          {
           return MessageResult.NO;
          }    
          case JOptionPane.CANCEL_OPTION:
          {
           return MessageResult.CANCEL;
          }  
      }
      return MessageResult.VOID;
    }
}
