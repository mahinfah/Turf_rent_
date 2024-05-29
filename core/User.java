package core;

public class User {

    private String name;
    private String nid;
    private String phone;
    private String password;
    private String repassword;
        
    public User(String name, String nid, String phone , String password , String repassword)
    {
        this.name = name;
        this.nid = nid ;
        this.phone = phone;
        this.password = password;
        this.repassword = repassword;
    }    
    public User()
    {

    }

    public void setName()
    {
        this.name=name;
    }
    public String getName() {
        return name;
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