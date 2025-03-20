public class Produkt {
    public int id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int iloscWMagazynie;
    public void wyswietlInformacje(){
        System.out.println("Produkt o ID:" + id + ", nazwa: " + nazwa + ", kategoria: " + kategoria + ", cena: " + cena);


    }

    public int getIdProdukt() {
        return id;
    }
    public void setIdProdukt(int idProdukt) {
        this.id = idProdukt;
}
public String getNazwa() {
        return nazwa;
}
public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
}
public String getKategoria() {
        return kategoria;
}
public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
}
public double getCena() {
        return cena;
}
public void setCena(double cena) {
        this.cena = cena;
}
}

