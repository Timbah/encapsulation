package thembelani.java.tutorials;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
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

        int numberOfSheets = (duplex) ? (pagesToPrint / 2) + (pagesToPrint % 2) : pagesToPrint;
        this.pagesPrinted += numberOfSheets;

        if(duplex){
            System.out.println("Printing in duplex mode");
        }
        return numberOfSheets;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
