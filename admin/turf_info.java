package admin;

public class turf_info {
    private String turfname;
    private String ownername;
    
    private    String emailinfo;
    private   String phoneinfo;
    private   String Locationinfo;
       private    String Durationinfo;
               
    private String Rentinfo;

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

 public String getTurfname(String turfname)
{
    return turfname;
}

public String getRentinfo(String Rentinfo)
{
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


}
