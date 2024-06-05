package core;

public class User {

    private static String username;
    private String nid;
    private String phone;
    private String password;
    private String repassword;
        
    public User(String name, String nid, String phone , String password , String repassword)
    {
        this.username = name;
        this.nid = nid ;
        this.phone = phone;
        this.password = password;
        this.repassword = repassword;
    }    
    public User()
    {

    }

    public static void setName(String name)
    {
        name=username;
    }
    public static String getName() {
        return username;
    }
        public String getnid(){
         return nid;
        }

        public String getPhone() {
        return phone;
        } 
        public String getPassword() {
        return password;
    }
    public String getRepassword() {
        return repassword;
    }   
           
}