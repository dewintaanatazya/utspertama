package pengguna;

public class Mhs extends User{
    private String nama;
    private String nim;
    private int smt;

    public Mhs (String username, String password){
        super("username", "password");
        this.nama = nama;
        this.nim = nim;
        this.smt = smt;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void setSmt(int smt){
        this.smt = smt;
    }

    public int getSmt(){
        return smt;
    }
}
