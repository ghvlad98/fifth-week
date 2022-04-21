package ex3;

public class test {
    public static void main(String[] args) {
        Studente st = new Studente("Vlad", 1794);
        CorsoLaurea cl = new CorsoLaurea("Informatica");
        cl.iscrivi("Vlad");
        Esame es1 = new Esame("BD1", 6);
        Esame es2 = new Esame("BD2", 6);
        Esame es3 = new Esame("Java", 9);
        Esame es4 = new Esame("Python", 9);
        st.promosso("BD1", 30);
        st.aggiungiEsame("BD1", 6);
        st.promosso("BD1", 30);
        System.out.println(st.getEsamiSostenuti());
        System.out.println(cl);
        cl.laurea();
    }
}
