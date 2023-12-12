public class Main {
    private int prywatnePole;
    public int publicznePole;
    protected int chronionePole;

    public Main() {
        // Konstruktor dostępny publicznie
    }

    private void metodaPrywatna() {
        // Metoda prywatna
    }

    public void metodaPubliczna() {
        // Metoda publiczna
    }

    protected void metodaChroniona() {
        // Metoda chroniona
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.prywatnePole = 10;   // Niedozowolone
        obj.publicznePole = 20;    // Dozwolone
        obj.chronionePole = 30; // Dozwolone

        obj.metodaPrywatna();
        obj.metodaPubliczna();
        obj.metodaChroniona();
    }
}