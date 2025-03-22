public class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;


    public int getId() {
        return id;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public void setCzyStaly(boolean czyStaly) {
        this.czyStaly = czyStaly;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isCzyStaly() {
        return czyStaly;
    }
    public void wyswietlInformacje() {
        System.out.println("ID: " + id + ", Imię: " + imie + ", Nazwisko: " + nazwisko + ", Email: " + email +
                ", Stały klient: " + (czyStaly ? "Tak" : "Nie"));
    }
}

