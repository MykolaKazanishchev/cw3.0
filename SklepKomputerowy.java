public class SklepKomputerowy {
    private Produkt[] produkty;
    private Klient[] klienci;
    private Zamowienie[] zamowienia;
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamowien;

    public SklepKomputerowy() {
        this.produkty = new Produkt[100];
        this.klienci = new Klient[100];
        this.zamowienia = new Zamowienie[100];
        this.liczbaProduktow = 0;
        this.liczbaKlientow = 0;
        this.liczbaZamowien = 0;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public Zamowienie[] getZamowienia() {
        return zamowienia;
    }

    public void setZamowienia(Zamowienie[] zamowienia) {
        this.zamowienia = zamowienia;
    }

    public Klient[] getKlienci() {
        return klienci;
    }

    public void setKlienci(Klient[] klienci) {
        this.klienci = klienci;
    }

    public int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    public void setLiczbaProduktow(int liczbaProduktow) {
        this.liczbaProduktow = liczbaProduktow;
    }

    public int getLiczbaKlientow() {
        return liczbaKlientow;
    }

    public void setLiczbaKlientow(int liczbaKlientow) {
        this.liczbaKlientow = liczbaKlientow;
    }

    public int getLiczbaZamowien() {
        return liczbaZamowien;
    }

    public void setLiczbaZamowien(int liczbaZamowien) {
        this.liczbaZamowien = liczbaZamowien;
    }

    public void dodajProdukt(Produkt produkt) {
        if (liczbaProduktow < produkty.length) {
            produkty[liczbaProduktow++] = produkt;
            System.out.println("Dodano produkt: " + produkt.getNazwa());
        } else {
            System.out.println("Brak miejsca na nowe produkty.");
        }
    }

    public void dodajKlienta(Klient klient) {
        if (liczbaKlientow < klienci.length) {
            klienci[liczbaKlientow++] = klient;
            System.out.println("Dodano klienta: " + klient.getImie() + " " + klient.getNazwisko());
        } else {
            System.out.println("Brak miejsca na nowych klientów.");
        }
    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        if (liczbaZamowien < zamowienia.length) {
            Zamowienie noweZamowienie = new Zamowienie(liczbaZamowien + 1, klient, produkty, ilosci, "2025-03-22", "Nowe");
            zamowienia[liczbaZamowien++] = noweZamowienie;
            System.out.println("Złożono nowe zamówienie ID: " + noweZamowienie.getId());
            return noweZamowienie;
        } else {
            System.out.println("Brak miejsca na nowe zamówienia.");
            return null;
        }
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        for (int i = 0; i < zamowienie.getProdukty().length; i++) {
            // Aktualizowanie stanów magazynowych (zakładając, że obniżamy liczbę produktów)
            System.out.println("Zaktualizowano stan magazynowy produktu: " + zamowienie.getProdukty()[i].getNazwa());
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getId() == idZamowienia) {
                zamowienia[i].setStatus(nowyStatus);
                System.out.println("Zmieniono status zamówienia ID: " + idZamowienia + " na: " + nowyStatus);
                return;
            }
        }
    }
    public void wyswietlProduktyWKategorii(String kategoria){
        System.out.println("Produkty w kategorii " + kategoria + ":");
        for (int i = 0; i < liczbaProduktow; i++) {
            if (produkty[i].getKategoria().equals(kategoria)) {
                System.out.println(produkty[i].getNazwa() + " - " + produkty[i].getCena() + " zł");
            }
        }
    }
    public void wyswietlZamowieniaKlienta(int idKlienta) {
        System.out.println("Zamówienia klienta o ID " + idKlienta + ":");
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getKlient().equals(klienci[idKlienta])) {
                System.out.println("ID Zamówienia: " + zamowienia[i].getId() + " - Status: " + zamowienia[i].getStatus());
            }
        }
    }
    }


