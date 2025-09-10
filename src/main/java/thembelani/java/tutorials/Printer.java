package thembelani.java.tutorials;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {

        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {

        if ((this.tonerLevel + tonerAmount) > 100 || (this.tonerLevel + tonerAmount < 0)) {
            return -1;
        } else {
            this.tonerLevel += tonerAmount;
        }

        return this.tonerLevel;
    }

    public int printPages(int pagesToPrint) {

        int numberOfSheets = 0;

        if (this.duplex) {
            numberOfSheets = pagesToPrint / 2;
            numberOfSheets += pagesToPrint % 2 > 0 ? 1 : 0;
        } else {
            numberOfSheets += pagesToPrint;
        }

        this.pagesPrinted += numberOfSheets;

        return this.pagesPrinted;
    }
}
