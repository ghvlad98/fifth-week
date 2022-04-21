package ex1;

import java.util.ArrayList;

public class InsiemeDiStringhe {
    private String[] T;

    InsiemeDiStringhe(int max) {
        this.T = new String[max];
    }

    public void setT(String[] array) {
        T = array;
    }

    public String stringaLunga() {
        if (this.T.length == 0) {
            return null;
        } else {
            int max = 0;
            for (int i = 1; i < this.T.length; i++) {
                if (this.T[i].length() > T[max].length()) {
                    max = i;
                }
            }
            return T[max];
        }
    }

    public String spaziStringa() {
        if (this.T.length == 0) {
            return null;
        } else {
            int max = 0;
            int maxCount = 0;
            for (int i = 0; i < this.T.length; i++) {
                String curr = T[i];
                int count = 0;
                for (int j = 0; j < curr.length(); j++) {
                    if (curr.charAt(j) == ' ') {
                        count +=1;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    max = i;
                }
            }
            return this.T[max];
        }
    }

    public ArrayList<String> preStringa(String prefix) {
        ArrayList<String> res = new ArrayList<>();
        for (String s: this.T) {
            if (s.startsWith(prefix)) {
                res.add(s);
            }
        }
        return res;
    }
}
