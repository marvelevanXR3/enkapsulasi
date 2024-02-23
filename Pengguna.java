package enkapsulasi;

public class Pengguna {

    private String username;
    private String password;
    private int id;
    private boolean status; //True : menikah, false : belum

    public Pengguna(){
        System.out.println("ini constructor");
    }

    public Pengguna(String hmm, String hoo){
        this.username = hmm;
        this.password = hoo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 



}