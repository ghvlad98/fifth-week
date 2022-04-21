package ex3;

import java.util.ArrayList;

public class CorsoLaurea {
    private String nome;
    private ArrayList<Studente> immatricolati = new ArrayList<>();
    public static int prossimaMatricola;
    public static final int MIN_CREDITI = 180;

    public CorsoLaurea(String unNomeCorso) {
        iscrivi(unNomeCorso);
    }

    public String getNome() {
        return nome;
    }

    public void iscrivi(String unNomeStudente){
        prossimaMatricola++;
        Studente studente = new Studente(unNomeStudente, prossimaMatricola);
        this.immatricolati.add(studente);
    }

    public Studente cercaStudente(String unNomeStudente) {
        for (Studente st: this.immatricolati) {
            if (st.getNome().equals(unNomeStudente)) {
                return st;
            }
        }
        return null;
    }

    public void ritira(String unNomeStudente){
        if (cercaStudente(unNomeStudente) == null) {
            System.out.println("Studente non immatricolato!");
        } else {
            Studente st = cercaStudente(unNomeStudente);
            this.immatricolati.remove(st);
        }
    }

    public void appello(String unNomeEsame, ArrayList<Studente> iscritti){
        for (Studente st: iscritti) {
            if (st.cercaEsame(unNomeEsame) != null) {
                Esame es = st.cercaEsame(unNomeEsame);
                es.setVoto((int) Math.floor(Math.random() * 30));
                st.getEsamiSostenuti().add(es);
            }
        }
    }

    public void laurea() {
        for (Studente st: this.immatricolati) {
            if (st.crediti() > MIN_CREDITI) {
                this.immatricolati.remove(st);
            }
        }
    }
}
