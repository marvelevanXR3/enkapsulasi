package enkapsulasi;

public class main{
    public static void main(String[] args) {
        
        Pengguna pengguna = new Pengguna("aaa", "bbb");
        Pengguna pengguna1 = new Pengguna();

        pengguna.setUsername("Evan");
        pengguna.setPassword("Evankeren");
        pengguna.setStatus(false);
        pengguna.setId(17);

        System.out.println("Username = "+pengguna.getUsername());
        System.out.println("Password = "+pengguna.getPassword());
    }

}