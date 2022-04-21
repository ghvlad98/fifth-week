package ex3;

public class Esame {
    private String nome;
    private int crediti;
    private int voto;

    public Esame(String unNomeEsame, int numCrediti) {
        this.nome = unNomeEsame;
        this.crediti = numCrediti;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCrediti() {
        return crediti;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int unVoto) {
        this.voto = unVoto;
    }

    public String toString(){
        return "Esame di " + this.nome + " con crediti: " + this.crediti;
    }
}
