package admin;

public class turf_info {
private String turfname ;
 String ownername;
    
   String emailinfo;  String phoneinfo;
      String Locationinfo;
    String Durationinfo;
               
   String Rentinfo;

    turf_info(String ownername, String turfname, String emailinfo, String phoneinfo , String Locationinfo ,String Durationinfo,
               String Rentinfo)
               {
                this.ownername = ownername;
                this.turfname = turfname;
                this.emailinfo = emailinfo;
                this.phoneinfo = phoneinfo;
                this.Locationinfo = Locationinfo;
                this.Durationinfo= Durationinfo;
                this.Rentinfo = Rentinfo;
               }
               turf_info()
               {
                
               }

 public String getTurfname()
{
    System.out.println("sssss");
    return turfname;
}

public String getRentinfo()
{     System.out.println("success");  
  return Rentinfo;
}

public String getLocationinfo(String Locationinfo)
{
    return Locationinfo;
}
public String getDurationinfo(String Durationinfo)
{
    return Durationinfo;
}
public void turfname()

{
    this.turfname = turfname;
}
 public static void main(String[] args)
 {

 }
}
