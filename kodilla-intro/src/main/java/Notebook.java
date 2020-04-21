public  class Notebook {

    public static void main(String[] args) {
    }

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if(this.price < 600){
            System.out.println("This notebook is very cheap.");
        } else if (price > 600 && price < 1000){
            System.out.println("The price is good.");
        } else {
            System.out.println("The notebook is expensive.");
        }
    }

        public void checkWeight() {
        if(this.weight < 500){
            System.out.println("This device is light.");
        } else if (weight > 500 && weight < 900){
            System.out.println("The weight isn't very heavy.");
        } else {
            System.out.println("The weight is very heavy.");
        }
    }

    public void checkYearPrice() {
        if(this.year > 1900 &&  this.year < 2014 && this.price > 1 && this.price < 998){
            System.out.println("Your laptop is old!");
        } else if (year > 2014 && year < 2017 && price > 999 && price < 1399){
            System.out.println("Your laptop is quite old!");
        } else if (year > 2017 && year < 2019 && price > 1400 && price < 2000){
            System.out.println("Your laptop is quite new!");
        } else {
            System.out.println("Your laptop is just like a fresh roll from bakery at 6 a.m.!");
        }
    }


}
