
public class Book extends Document {
    private String ISBN;
    private int pup_year;
    private int price;

    public Book(String title, Person[] authors, String ISBN, int pup_year, int price) {
        super(title, authors);
        this.ISBN = ISBN;
        this.pup_year = pup_year;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPup_year() {
        return pup_year;
    }

    public void setPup_year(int pup_year) {
        this.pup_year = pup_year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String out = "";
        out = out + getTitle() + "\n" + getPup_year() + "\n" + getISBN() + "\n" + super.toString();
        return out;
    }

    public double SalePrice(Person buyer) {
        boolean isAuthor = false;
        boolean qualified = false;
        double final_price = 0;
        for (Person a : getAuthors()) {
            isAuthor = buyer == a;
            if (buyer == a) {
                break;
            }
        }
        if (2025 - buyer.getBirthyear() < 20) {
            qualified = true;
        }

        if (isAuthor) {
            return 0;
        } else {
            if (qualified) {
                return getPrice() * 0.8;
            } else
                return getPrice();
        }

    }
}