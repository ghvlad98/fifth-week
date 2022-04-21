package ex1;

import ex1.InsiemeDiStringhe;

public class main {
    public static void main(String[] args) {
        InsiemeDiStringhe ins = new InsiemeDiStringhe(4);
        ins.setT(new String[]{"al", " ", "test", "Try this command!"});
        System.out.println(ins.stringaLunga());
        System.out.println(ins.spaziStringa());
        System.out.println(ins.preStringa("t"));
    }
}
