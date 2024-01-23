package server;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class user {
    private String name;

    private String Email;

    private String dateofbirth;

    private String nid;
    private String address;
    private String Religion;
    private String  Phone;
    private String Bloodgroup;
    private String  status;

    private String gender;

    private String password;

   public  user()
    {
    }
    public user(String name,String email,String nid,String address,String dateofbirth,String phone,String Bloodgroup,String religion,String Status,String gender,String password)
    {
        this.name=name;
        this.Email=email;
        this.address=address;
        this.dateofbirth=dateofbirth;
        this.Phone=phone;
        this.nid=nid;
        this.Bloodgroup=Bloodgroup;
        this.Religion=religion;
        this.gender=gender;
        this.status=Status;
        this.password=password;

        datasave();
        password();
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getNid() {
        return nid;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPhone() {
        return Phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setBloodgroup(String bloodgroup) {
        Bloodgroup = bloodgroup;
    }

    public String getBloodgroup() {
        return Bloodgroup;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setReligion(String religion) {
        Religion = religion;
    }

    public String getReligion() {
        return Religion;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public  abstract boolean isnameverification(String name);
    public abstract boolean isemailverification(String email);
    public abstract boolean isdateofbirthverification(String date);
    public abstract boolean isphoneverification(String number);



    public abstract boolean  isnidverification(String nid);


    void datasave()
    {
        StringBuilder sb=new StringBuilder();
//        sb.append("Name").append(",").append("Email").append(",").append("Date of birth").append(",").append("Nid").append(",").append("Address").append(",").append("religion").append(",").append("Phone").append(",").append("Blood Group").append(",").append("Status").append(",").append("Gender");
        StringBuilder sI=new StringBuilder();
        sI.append(getName()).append(",").append(getEmail()).append(",").append(getDateofbirth()).append(",").append(getNid()).append(",").append(getAddress()).append(",").append(getReligion()).append(",").append(getPhone()).append(",").append(getBloodgroup()).append(",").append(getStatus()).append(",").append(getGender()).append(",").append(getPassword());
        try{
            File file=new File("D://DhakaMetro//src//server//data//registerinfo.CSV");
            FileWriter e=new FileWriter(file,true);
            PrintWriter writer =new PrintWriter(e);
            writer.append(sI.toString());
            writer.append("\n");
            writer.flush();
            writer.close();


        }catch(Exception ex){
            System.out.println("  "+ex);
        }

    }
    void password()
    {
        StringBuilder sI=new StringBuilder();
        sI.append(getEmail()).append(",").append(getPassword());
        try{
            File file=new File("D://DhakaMetro//src//server//data//password.CSV");
            FileWriter e=new FileWriter(file,true);
            PrintWriter writer =new PrintWriter(e);
            writer.append(sI.toString());
            writer.append("\n");
            writer.flush();
            writer.close();


        }catch(Exception ex){
            System.out.println("  "+ex);
        }

    }





}









