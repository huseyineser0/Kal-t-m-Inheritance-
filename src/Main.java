public class Main {
    public static void main(String[] args) {

        OgretimGorevlisi o1 = new OgretimGorevlisi("hüseyin eser", "05453120522", "hsy_esr@hotmail.com", "matematik", "prof", "58");
        o1.senatoToplantisi();
        o1.sinavYap();


        Asistan a1 = new Asistan("eser 1", "456446", "has@hotmail.com", "ceng", "as", "10-13");
        a1.quizYap();
    }
}