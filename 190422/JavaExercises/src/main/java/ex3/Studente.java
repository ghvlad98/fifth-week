package ex3;

import java.util.ArrayList;

public class Studente {
    private String nome;
    private int matricola;
    private ArrayList<Esame> esamiSostenuti = new ArrayList<>();
    private ArrayList<Esame> pianoStudio = new ArrayList<>();

    public Studente(String unNomeStudente, int unaMatricola){
        this.nome = unNomeStudente;
        this.matricola = unaMatricola;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricola() {
        return matricola;
    }

    public ArrayList<Esame> getEsamiSostenuti() {
        return esamiSostenuti;
    }

    public void aggiungiEsame(String unNomeEsame, int numCrediti){
        pianoStudio.add(new Esame(unNomeEsame, numCrediti));
    }

    public Esame cercaEsame(String unNomeEsame) {
        if (this.pianoStudio == null) {
            return null;
        }
        for (Esame es: this.pianoStudio) {
            if (es.getNome().equals(unNomeEsame)) {
                return es;
            }
        }
        return null;
    }

    public void promosso(String unNomeEsame, int unVoto){
        if (cercaEsame(unNomeEsame) == null) {
            System.out.println("Esame non presente nel piano studio!");
        } else {
            Esame es = cercaEsame(unNomeEsame);
            es.setVoto(unVoto);
            this.esamiSostenuti.add(es);
        }
    }

    public void cancella(String unNomeEsame){
        Esame es = cercaEsame(unNomeEsame);
        if (es != null) {
            this.pianoStudio.remove(es);
        }
    }

    public double media(){
        double sum = 0;
        for (Esame es: this.esamiSostenuti) {
            sum += es.getVoto();
        }
        return sum / this.esamiSostenuti.size();
    }

    public double crediti(){
        double tot = 0;
        for (Esame es: this.esamiSostenuti) {
            tot += es.getCrediti();
        }
        return tot;
    }

    public String toString(){
        String strPiano = "";
        for (Esame es: this.pianoStudio) {
            strPiano += es.toString() + " ";
        }

        String strSos = "";
        for (Esame es: this.esamiSostenuti) {
            strSos += es.toString() + " voto: " + es.getVoto() + " ";
        }

        return "Studente di nome " + this.nome + " con matricola " + this.matricola +
                "Esami nel piano studio: " + strPiano + "Esami sostenuti: " + strSos;
    }
}
