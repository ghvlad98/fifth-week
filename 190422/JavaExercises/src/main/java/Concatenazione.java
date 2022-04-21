public class Concatenazione {
    String a;
    String b;
    Concatenazione(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String res() {
        if (this.b.length() == 0) {
            return this.a;
        } else {
            this.a += b.charAt(0);
            this.b = b.substring(1);

            return res();
        }
    }
}
