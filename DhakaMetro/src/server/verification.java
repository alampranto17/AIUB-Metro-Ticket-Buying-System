package server;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class verification extends user{

public verification()
{
}
public verification(String name, String email, String nid, String address, String dateofbirth, String phone, String Bloodgroup, String religion, String Status, String gender,String password)
{
    super(name,email,nid,address,dateofbirth,phone,Bloodgroup,religion,Status,gender,password);
}


    @Override
    public boolean isnameverification(String name) {
        String regex="^[a-zA-Z ]{1,50}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(name);
        if(matcher.matches())
        {
            return true;
        }

        return false;
    }

    @Override
    public boolean isemailverification(String email) {

        String regex="^(.+)@(\\S+)$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        if(matcher.matches())
        {
            return true;
        }

        return false;
    }

    @Override
    public boolean isdateofbirthverification(String date) {
        Boolean x=true;

        DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        Date date1=null;
        df.setLenient(false);
        try {
            date1=df.parse(date);
        }catch(Exception ex)
        {
            x=false;
        }
        return x;
    }



    @Override
    public boolean isphoneverification(String number) {

        boolean x=true;
        try
        {
            Integer.parseInt(number);
        }catch (Exception ex)
        {
            x=false;
        }

        return x;
    }

    @Override
    public boolean isnidverification(String nid) {

        boolean x=true;
        try
        {
        int number =Integer.parseInt(nid);
        }catch (Exception ex)
        {
            x=false;
        }

        return x;

    }


}
