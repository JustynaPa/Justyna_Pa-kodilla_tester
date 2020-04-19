public class FirstClass {

    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2016);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2018);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2012);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();

        Notebook newLaptop = new Notebook(1700, 2900, 2020);
        System.out.println(newLaptop.weight + " " + newLaptop.price + " " + newLaptop.year);
        newLaptop.checkPrice();
        newLaptop.checkWeight();
        newLaptop.checkYearPrice();

        Notebook ultraBook = new Notebook(500, 1700, 2018);
        System.out.println(ultraBook.weight + " " + ultraBook.price + " " + ultraBook.year);
        ultraBook.checkPrice();
        ultraBook.checkWeight();
        ultraBook.checkYearPrice();

    }


}

