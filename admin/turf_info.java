package admin;

public class turf_info {
    private  static String turfname ;
    private  static   String capacity;
    private  static   String emailinfo; 
    private  static  String phoneinfo;
    private  static  String Locationinfo;
    private  static  String Durationinfo;
    private  static  String Rentinfo;

    turf_info(String turfname,String capacity, String emailinfo, String phoneinfo , String Locationinfo ,String Durationinfo,
               String Rentinfo)
               {
              System.out.println("turf_in");
                this.turfname = turfname;
                this.capacity = capacity;
                this.emailinfo = emailinfo;
                this.phoneinfo = phoneinfo;
                this.Locationinfo = Locationinfo;
                this.Durationinfo= Durationinfo;
                this.Rentinfo = Rentinfo;
               }
               turf_info()
               {
                
               }
 
 public static void setTurfname(String turfname)
 {
turfname =turfname;
 }              

 public static String getTurfname()
{
    System.out.println("getturfname callled");
    return turfname;
}

public String getRentinfo()
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
public void turfname()

{
   // this.turfname = turfname;
  //  System.out.println("CALLED");
   // System.out.println(turfname);
}
 public static void main(String[] args)
 {

 }
}
