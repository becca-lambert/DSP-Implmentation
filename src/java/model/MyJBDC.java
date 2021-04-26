/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
import java.sql.*;
/**
 *
 * @author BECCA
 */
public class MyJBDC {
    //Connect to DB
    public static Connection getConnection() {
        Connection con=null;
        try {
            //Connect to MyDB
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MyDB", "admin", "admin");
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }return con;
    }
    //Code for login auth
    public static int loginauth(com.UserInput e){
        int status=0;
     
        
        try {
            Connection con=MyJBDC.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select * from APP.USERS where UNAME = ? and PASSWD = ?  and ROLE = 'teamleader'");
            ps.setString(1,e.getUsername());
            ps.setString(2,e.getPassword());
            
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            boolean test = rs.next();
            if (test){
                status = 2;
                return status;
            }
            else{
                status = 0;
            }
            con.close();
            
        }catch(Exception ex) {ex.printStackTrace();}
        
        try {
            Connection con=MyJBDC.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select * from APP.USERS where UNAME = ? and PASSWD = ?  and ROLE = 'employee'");
            ps.setString(1,e.getUsername());
            ps.setString(2,e.getPassword());
            
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            boolean test = rs.next();
            if (test){
                status = 3;
                return status;
            }
            else{
                status = 0;
            }
            con.close();
            
        }catch(Exception ex) {ex.printStackTrace();}
        
        try {
            Connection con=MyJBDC.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select * from APP.USERS where UNAME = ? and PASSWD = ?  and ROLE = 'headoffice'");
            ps.setString(1,e.getUsername());
            ps.setString(2,e.getPassword());
            
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            boolean test = rs.next();
            if (test){
                status = 5;
                return status;
            }
            else{
                status = 0;
            }
            con.close();
            
        }catch(Exception ex) {ex.printStackTrace();}
        
        try {
            Connection con=MyJBDC.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select * from APP.USERS where UNAME = ? and PASSWD = ?  and ROLE = 'manager'");
            ps.setString(1,e.getUsername());
            ps.setString(2,e.getPassword());
            
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            boolean test = rs.next();
            if (test){
                status = 6;
                return status;
            }
            else{
                status = 0;
            }
            con.close();
            
        }catch(Exception ex) {ex.printStackTrace();}
        
        try {
            Connection con=MyJBDC.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select * from APP.USERS where UNAME = ? and PASSWD = ?  and ROLE = 'admin'");
            ps.setString(1,e.getUsername());
            ps.setString(2,e.getPassword());
            
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            boolean test = rs.next();
            if (test){
                status = 4;
                return status;
            }
            else{
                status = 0;
            }
            con.close();
            
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
    }
    //Code for adding to USERS table
    public static int saveuser(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.USERS(UNAME, PASSWD, ROLE) values (?,?,?)");   
            ps.setString(1,e.getUsername());
            ps.setString(2,e.getPassword());
            ps.setString(3,e.getRole());
            
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
    }
    public static int saveEmployeeDetails(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.EMPLOYEE(ENAME, EADDRESS, UNAME) values (?,?,?)");   
            ps.setString(1,e.getName());
            ps.setString(2,e.getAddress());
            ps.setString(3,e.getUsername());
            
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
    }
    
    //Code for adding DATES to BOOKING table
    public static int savedate(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.MEETINGS(DATE, TIME, REASON, NAME, MANAGER) values (?,?,?,?,?)");  

            ps.setString(1,e.getDate());
            ps.setString(2,e.getTime());
            ps.setString(3,e.getReason());
            ps.setString(4,e.getName());
            ps.setString(5,e.getDN());
              
            
            
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
    }
    
    
    
    
    //Code for adding to CLIENT & USER table
    public static int savepatient(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.USERS(UNAME, PASSWD, ROLE) values (?,?,?)");
            PreparedStatement ts=con.prepareStatement("insert into APP.CLIENTS(CNAME, CADDRESS, CTYPE, UNAME) values (?,?,?,?)");   
            
            ps.setString(1,e.getUsername());
            ps.setString(2,e.getPassword());
            ps.setString(3,e.getRole());
            ts.setString(1,e.getName());
            ts.setString(2,e.getAddress());
            ts.setString(3,e.getType());
            ts.setString(4,e.getUsername());
            
            status=ps.executeUpdate();
            status=ts.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
    }
    public static List<com.UserInput> getAllPatients(com.UserInput e){
        List list=new ArrayList();
        try{
            Connection con=MyJBDC.getConnection();
            
            PreparedStatement ps=con.prepareStatement("select * from APP.CLIENTS where CTYPE = ?");
            
            ps.setString(1,e.getType());
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                com.UserInput x= new com.UserInput();
                x.setID(rs.getInt(1));
                x.setUsername(rs.getString(2));
                x.setName(rs.getString(3));
                x.setAddress(rs.getString(4));
                x.setType(rs.getString(5));
                list.add(x);
            }
            con.close();
        }catch(Exception x){x.printStackTrace();}
        return list;
    }
    
    public static List<com.UserInput> getAllDates(){
        List list=new ArrayList();
        try{
            Connection con=MyJBDC.getConnection();
            
          
            PreparedStatement ps=con.prepareStatement("select * from APP.SCHEDULE");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                com.UserInput e= new com.UserInput();
            
                e.setDate(rs.getString(1));
                e.setBR(rs.getString(2));
                e.setKIT(rs.getString(3));
                e.setBAR(rs.getString(4));
                e.setSERVICE(rs.getString(5));
                e.setDF(rs.getString(6));
              
                list.add(e);
            }
            con.close();
        }catch(Exception x){x.printStackTrace();}
        return list;
    }
    //Code for adding to invoices to the table
    //Code for adding to invoices to the table
    public static int saveinvoice(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.PAYMENT(NAME, RName, PTYPE,MEDI, APPDATE, AMOUNTDUE, PAID) values (?,?,?,?,?,?,?)");   
            ps.setString(1,e.getName());
            ps.setString(2,e.getCName());
            ps.setString(3,e.getType());
            ps.setString(4,e.getMedi());
            ps.setString(5,e.getDate());
            ps.setString(6,e.getAmountDue());
            ps.setString(7,"False");
            
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
    }
   public static List<com.UserInput> paybill(com.UserInput e){
        List list=new ArrayList();
        try{
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from APP.PAYMENT where NAME = ?");
            
            ps.setString(1,e.getCName());
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                com.UserInput x= new com.UserInput();

                x.setName(rs.getString(1));
                x.setDate(rs.getString(2));
                x.setAmountDue(rs.getString(3));
                x.setType(rs.getString(5));
                x.setMedi(rs.getString(6));

             
                

                list.add(x);
            }
            con.close();
        }catch(Exception x){x.printStackTrace();}
        return list;
    }

   public static int prescription(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.PRESCRIPTION(CPID, MEDICATION, DOSE, COST) values (?,?,?,?)");   
            ps.setString(1,e.getCName());
            ps.setString(2,e.getMedication());
            ps.setString(3,e.getDose());
            ps.setString(4,e.getCost());
            
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
   }
   //Remove date
   public static int deletedate(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from APP.BOOKING_SLOTS where SID = ?");   
            ps.setInt(1,e.getID());
            
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
   }
    public static int savetransferID(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.TRANSFER_LIST(TRANSFERS, DATE, DESTINATION) values (?,?,?)");
            ps.setString(1,e.gettransferID());
            ps.setString(2,e.getDate());
            ps.setString(3,e.getPlace());
            


           status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
    }
     public static int changeBill(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.PAYMENT where CPID = ?");   
            ps.setString(1,e.getCName());
            ps.setString(2,e.getMedication());
            ps.setString(3,e.getDose());
            ps.setString(4,e.getCost());
            
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
   }
     //Remove patient
   public static int deletepatient(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from APP.CLIENTS where CID = ?");   
            ps.setInt(1,e.getID());
            
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
   }
   public static int getTurnover(com.UserInput e){
      int status = 0;
      try{
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("SELECT SUM(AMMOUNTDUE) FROM APP.PAYMENT WHERE SDATE BETWEEN ? AND ?");   
            ps.setInt(1,e.getTurnover());
            
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
   }
   
    public static int Complaint(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.COMPLAINTS(NAME,ISSUE, MADEBY, DATE) values (?,?,?,?)");   
            ps.setString(1,e.getCName());
            ps.setString(2,e.getissue());
            ps.setString(3,e.getCdate());
            ps.setString(4,e.getMadeBy());
            
            
            
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
    }
    public static List<com.UserInput> getprice(){
        List list=new ArrayList();
        try{
            Connection con=MyJBDC.getConnection();
            
            // CHANGE THIS TO A CERTAIN DATE  PreparedStatement ps=con.prepareStatement("select * from APP.CLIENTS where CTYPE = 'NHS'");
            PreparedStatement ps=con.prepareStatement("select * from APP.PRICES");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                com.UserInput e= new com.UserInput();
                e.setprice(rs.getString(1));
               ;
                list.add(e);
            }
            con.close();
        }catch(Exception x){x.printStackTrace();}
        return list;
    }
     public static int SelfEvaluation(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.SELFEVALUATION(Q1,Q2, ENAME,Q3,Q4,Q5,Q6,Q7,Q8,Q9) values (?,?,?,?,?,?,?,?,?,?)");   
            ps.setInt(1,e.getEQ1());
            ps.setString(3,e.getEQname());
            ps.setInt(2,e.getEQ2());
            ps.setInt(4,e.getEQ3());
            ps.setInt(5,e.getEQ4());
            ps.setInt(6,e.getEQ5());
            ps.setInt(7,e.getEQ6());
            ps.setInt(8,e.getEQ7());
            ps.setInt(9,e.getEQ8());
            ps.setInt(10,e.getEQ9());
            
      
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
     }
      public static List<com.UserInput> getSchedule(com.UserInput e){
        List list=new ArrayList();
        try{
            Connection con=MyJBDC.getConnection();
            
            PreparedStatement ps=con.prepareStatement("select * from APP.SCHEDULE where NAME = ?");
            
            ps.setString(1,e.getun());
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                com.UserInput x= new com.UserInput();
           
          
                x.setName(rs.getString(1));
                x.setAddress(rs.getString(3));
                
                list.add(x);
            }
            con.close();
        }catch(Exception x){x.printStackTrace();}
        return list;
    }
       public static List<com.UserInput> getMeetings(){
        List list=new ArrayList();
        try{
            Connection con=MyJBDC.getConnection();
            
            
            PreparedStatement ps=con.prepareStatement("select * from APP.MEETINGS");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                com.UserInput e= new com.UserInput();
                 
                e.setDate(rs.getString(2));
                e.setTime(rs.getString(4));
                e.setReason(rs.getString(3));
                e.setName(rs.getString(1));
                e.setDN(rs.getString(5));
                list.add(e);
            }
            con.close();
        }catch(Exception x){x.printStackTrace();}
        return list;
    }
       
       public static List<com.UserInput> getComplaints(){
        List list=new ArrayList();
        try{
            Connection con=MyJBDC.getConnection();
            
           
            PreparedStatement ps=con.prepareStatement("select * from APP.COMPLAINTS");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                com.UserInput e= new com.UserInput();
                 
                e.setCName(rs.getString(1));
                e.setissue(rs.getString(2));
                e.setCdate(rs.getString(3));
                e.setMadeBy(rs.getString(4));
               
                list.add(e);
            }
            con.close();
        }catch(Exception x){x.printStackTrace();}
        return list;
    }
      public static int EmployeeEvaluation(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.EVALUATION(Q1,Q2, ENAME,Q3,Q4,Q5,Q6,Q7,Q8,Q9) values (?,?,?,?,?,?,?,?,?,?)");   
            ps.setInt(1,e.getEQ1());
            ps.setString(3,e.getEQname());
            ps.setInt(2,e.getEQ2());
            ps.setInt(4,e.getEQ3());
            ps.setInt(5,e.getEQ4());
            ps.setInt(6,e.getEQ5());
            ps.setInt(7,e.getEQ6());
            ps.setInt(8,e.getEQ7());
            ps.setInt(9,e.getEQ8());
            ps.setInt(10,e.getEQ9());
            
      
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
     }
             public static List<com.UserInput> getBranch(){
        List list=new ArrayList();
        try{
            Connection con=MyJBDC.getConnection();
            
           
            PreparedStatement ps=con.prepareStatement("select * from APP.BRANCHDATA");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                com.UserInput e= new com.UserInput();
                e.setjans(rs.getInt(1));
                e.setfebs(rs.getInt(2));
                e.setmarchs(rs.getInt(3));
              
                list.add(e);
            }
            con.close();
        }catch(Exception x){x.printStackTrace();}
        return list;
    }
             
     public static int Schedule(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into APP.SCHEDULE(DATE,BR, KIT,BAR,SERVICE,DAYOFF) values (?,?,?,?,?,?)");   
            ps.setString(1,e.getDate());
            ps.setString(2,e.getBR());
            ps.setString(3,e.getKIT());
            ps.setString(4,e.getBAR());
            ps.setString(5,e.getSERVICE());
            ps.setString(6,e.getDF());
            
            
            
            status=ps.executeUpdate();
            con.close();
        }catch(Exception ex) {ex.printStackTrace();}
        return status;
    }
     
     
     
     public static int secondloginauth(com.UserInput e){
        int status=0;
        try {
            Connection con=MyJBDC.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select * from APP.DATA where ID = '?' and ROLE = 'becca' ");
            ps.setInt(1,e.getID());
     
            
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            boolean test = rs.next();
            if (test){
                status = 1;
                return status;
            }
            else{
                status = 0;
            }
            con.close();
            
        }catch(Exception ex) {ex.printStackTrace();}
        
        return status;
    }

    
     
}