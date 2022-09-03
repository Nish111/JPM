package section7.part94;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if(tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        } else
        {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = isDuplexPrinter;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount <=100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        } else{ return -1; }
    }
    public int printPage(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = pages/2 + pages%2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
 /*   private int tonerLevel = 0;
    private int numberOfPagesPrinted = 0; // pagesPrinted
    private boolean isDuplexPrinter; //duplex

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillToner(int level){
        if(level>0 && level <100){
            this.tonerLevel += level;
        }
    }
    public void printPage(int pages){
        if(pages > 0){
            this.numberOfPagesPrinted += pages;
        }
    }*/
}
