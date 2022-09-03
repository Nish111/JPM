package section7.challenges;

public class EncapsulationCE38 {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("Initial page cont = " + printer.getPagesPrinted());
        int pagesPrinter = printer.printPages(4);
        System.out.println("Pages printed was = " + pagesPrinter +
                " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinter = printer.printPages(2);
        System.out.println("Pages printed was = " + pagesPrinter +
                " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinter = printer.printPages(5);
        System.out.println("Pages printed was = " + pagesPrinter +
                " new total print count for printer = " + printer.getPagesPrinted());

        System.out.println("-- Non duplex printer --");
        Printer simplePrinter = new Printer(50, false);
        System.out.println("Initial page cont = " + simplePrinter.getPagesPrinted());
        int pagesPrinterSimple = simplePrinter.printPages(4);
        System.out.println("Pages printed was = " + pagesPrinterSimple +
                " new total print count for printer = " + simplePrinter.getPagesPrinted());
        pagesPrinterSimple = simplePrinter.printPages(2);
        System.out.println("Pages printed was = " + pagesPrinterSimple +
                " new total print count for printer = " + simplePrinter.getPagesPrinted());
        pagesPrinterSimple = simplePrinter.printPages(5);
        System.out.println("Pages printed was = " + pagesPrinterSimple +
                " new total print count for printer = " + simplePrinter.getPagesPrinted());

    }
}
