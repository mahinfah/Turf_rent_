package core;

public class User {

    private static String username;
    private static String nidno;
    private static String phone;
    private static String password;
    private static String repassword;
        
    public User(String name, String nidno, String phone , String password , String repassword)
    {// System.out.println("called"); 

        this.username = name;
        this.nidno = nidno ;
        this.phone = phone;
        this.password = password;
        this.repassword = repassword;
       // System.out.println(nid); 
        System.out.println(name); 
    
    }    
    public User()
    {

    }

    public static void setName(String name)
    {
        name=username;
        System.out.println("CALLED"+name);
    }
   
    public static String getName() {
        return username;
    }
    public static void setnid(String nidno)
    {
     nidno = nidno;
        System.out.println("CALLED"+nidno);
    }
   //  System.out.println(getName());
        public static String getnid(){
         return nidno;
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