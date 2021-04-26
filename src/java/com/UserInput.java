/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author becca
 */
public class UserInput {
    private int id,turnover,jans, febs, marchs, EQ1,EQ2,EQ3,EQ4,EQ5,EQ6,EQ7,EQ8,EQ9,lates;
    private String name,username,password,role,address,type,option,date,time,amount,medi,dose,reason,dob,permUsername,transferID,ReQ,Place,CName,startDate,endDate,DN, price,issue,Cdate,MadeBy, EQname, un,BR,KIT,BAR,SERVICE,DF;
    
    



    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }
     public int getlates(){
        return lates;
    }
    public void setlates(int id){
        this.lates = lates;
    }
     public int getjans(){
        return jans;
    }
    public void setjans(int jans){
        this.jans = jans;
    }
    
      public int getfebs(){
        return febs;
    }
    public void setfebs(int febs){
        this.febs = febs;
    }
    
      public int getmarchs(){
        return marchs;
    }
    public void setmarchs(int marchs){
        this.marchs = marchs;
    }
    //name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //Username
    public String getUsername() {
	return username;
    }
    public void setUsername(String username) {
            this.username = username;
    }
    //Password
    public String getPassword() {
            return password;
    }
    public void setPassword(String password) {
            this.password = password;
    }
    //dob
    public String getDob(){
            return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    //Role
    public String getRole() {
            return role;
    }
    public void setRole(String role) {
            this.role = role;
    }   
    //address
    public String getAddress() {
            return address;
    }
    public void setAddress(String address) {
            this.address = address;
    }
    //type
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    //option
    public String getOption(){
        return option;
    }
    public void setOption(String option){
        this.option = option;
    }
    
    
    
    
    //LOGGED IN USERNAME
    
    public String getPermUsername(){
        return permUsername;
    }
    public void setPermUsername(String permUsername){
        this.permUsername = permUsername;
    }
    
    
    //BOOKINGS
    //Dates
    public String getReason() {
	return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public String getDate() {
	return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getTime() {
	return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
     public String getDN() {
	return DN;
    }
    public void setDN(String DN) {
        this.DN = DN;
    }



//invoice
    //payments
   
     public String getAmountDue(){
       return amount;
    }
    public void setAmountDue(String name){
       this.amount = name;
    }
    public String getCost(){
        return amount;
    }
    public void setCost(String name){
        this.amount = name;
    }
    public String getDose(){
        return dose;
    }
    public void setDose(String dose){
        this.dose = dose;
    }
    public String getMedication(){
        return medi;
    }
    public void setMedication(String medi){
        this.medi = medi;
    }
    public String getMedi(){
        return medi;
    }
    public void setMedi(String medi){
        this.medi = medi;
    }
    
    public String gettransferID(){
        return transferID;
    }
    
    public void settransferID(String transferID){
        this.transferID = transferID;
    }

    public String getReQ(){
        return ReQ;
    }
    public void setReQ(String medi){
        this.medi = ReQ;
    }
    
    public String getPlace(){
        return Place;
    }
    public void setPlace(String Place){
        this.Place = Place;
    }
    //Calculate Turnover
    public String getStartDate(){
        return startDate;
    }
    public void setstartDate(String startDate){
        this.startDate = startDate;
    }
    
    public String getendDate(){
        return endDate;
    }
    public void setendDate(String endDate){
        this.endDate = endDate;
    }
    public int getTurnover(){
        return turnover;
    }
    public void setTurnover(int turnover){
        this.turnover = turnover;
    }
    public String getprice(){
        return price;
    }
    public void setprice(String price){
        this.price = price;
    ////////////////////complaints varibles //////////////////////
    }
    public String getissue(){
        return issue;
    }
    public void setissue(String issue){
        this.issue = issue;
    }
    public String getCdate(){
        return Cdate;
    }
    public void setCdate(String Cdate){
        this.Cdate = Cdate;
    }
     public String getMadeBy(){
        return MadeBy;
    }
    public void setMadeBy(String MadeBy){
        this.MadeBy = MadeBy;
    }
    public String getCName(){
        return CName;
    }
    public void setCName(String CName){
        this.CName = CName;
    }
    //////////////////////////SELFEVALUATION//////////////////////
     public int getEQ1(){
        return EQ1;
    }
    public void setEQ1(int EQ1){
        this.EQ1 = EQ1;
    }
      public String getEQname(){
        return EQname;
    }
    public void setEQname(String EQname){
        this.EQname = EQname;
    }
    public int getEQ2(){
        return EQ2;
    }
    public void setEQ2(int EQ2){
        this.EQ2 = EQ2;
    }
    public int getEQ3(){
        return EQ3;
    }
    public void setEQ3(int EQ3){
        this.EQ3 = EQ3;
    }
    public int getEQ4(){
        return EQ4;
    }
    public void setEQ4(int EQ4){
        this.EQ4 = EQ4;
    }
    public int getEQ5(){
        return EQ5;
    }
    public void setEQ5(int EQ5){
        this.EQ5 = EQ5;
    }
    public int getEQ6(){
        return EQ6;
    }
    public void setEQ6(int EQ6){
        this.EQ6 = EQ6;
    }
    public int getEQ7(){
        return EQ7;
    }
    public void setEQ7(int EQ7){
        this.EQ7 = EQ7;
    }
    public int getEQ8(){
        return EQ8;
    }
    public void setEQ8(int EQ8){
        this.EQ8 = EQ8;
    }
    public int getEQ9(){
        return EQ9;
    }
    public void setEQ9(int EQ9){
        this.EQ9 = EQ9;
    }
    
      public String getun(){
        return un;
    }
    public void setun(String un){
        this.un = un;
    }
      public String getBR(){
        return BR;
    }
    public void setBR(String BR){
        this.BR = BR;
    }
      public String getKIT(){
        return KIT;
    }
    public void setKIT(String KIT){
        this.KIT = KIT;
    }
      public String getBAR(){
        return BAR;
    }
    public void setBAR(String BAR){
        this.BAR = BAR;
    }
      public String getSERVICE(){
        return SERVICE;
    }
    public void setSERVICE(String SERVICE){
        this.SERVICE = SERVICE;
    }
      public String getDF(){
        return DF;
    }
    public void setDF(String DF){
        this.DF = DF;
    }


}
