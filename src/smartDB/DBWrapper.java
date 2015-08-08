/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartDB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author JITHIN.P
 */
public  class DBWrapper {
    
   public static Statement statementInsert  = null;
   public static Statement statementSelect  = null;

    public static Statement getStatement() 
    {
        return statementSelect;
    }
   public  DBWrapper()
   {
        
   }
   
   public static void initDBWrapper()
   {
        try 
        {
            statementInsert = connectDB().createStatement();
            statementInsert.executeQuery("USE  smartClassEx");
            statementSelect = connectDB().createStatement();    
            statementSelect.executeQuery("USE  smartClassEx");
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DBWrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   public static  DBWrapper getInstance()
   {
       return null;
   }
   
    public static Connection connectDB()
    {
        try
        {
           DriverManager.registerDriver( (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance());
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
           return connection;       
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
         
        }
        catch(Exception ex)
        {
                    System.out.println("Jithin");
        }  
        return null;
    }
    public static String[] getUsers(String sDomain)
    {  
        String sUsers[] = null;
        try 
        {
             int nI =0; 
             ResultSet resultSet = statementSelect.executeQuery(("SELECT UserName FROM Users Where Domain ='"+ sDomain+ "'"));
             int nCount = 5;
             sUsers = new String[5];
            while (resultSet.next())
            {
               String userName = resultSet.getString(1);
               sUsers[nI++] = userName;
            }
            while(nI<nCount)
            {
                 sUsers[nI++] = null;
            }
            
        } 
        catch (SQLException ex) 
        {
                Logger.getLogger(DBWrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return sUsers;
    }
    public static void main(String[] args)
    {
           initDBWrapper();
         
        
    }
    public static boolean insertData(String sQuery)
    {
        try {
            statementInsert.executeUpdate(sQuery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBWrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean isValidPassword(String sDomain,String sUser,String sPassword)
    {
        try 
        {
            ResultSet resultSet = statementSelect.executeQuery(("SELECT Password FROM users WHERE  Domain ='"+ sDomain+ "' AND Username ='"+sUser+"'"));
            resultSet.next();
            if(resultSet.getString(1).equals(sPassword))
            {  
                return true;
            }
         
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(DBWrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
