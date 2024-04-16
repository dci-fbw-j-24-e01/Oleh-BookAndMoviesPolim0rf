public class MovieWithDirector extends Movie {
    protected String director;


    public MovieWithDirector(int productId, int price, String title, MovieGenre genre, String director) {
        super(productId, price, title, genre);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {

        return "--- Movie Details (with Director)---" +
                "\nId: " + getProductId() +
                "\nTitle: " + getTitle() +
                "\nGenre: " + getGenre() +
                "\nPrice: " + getPrice() +
                "\nDirector: " + getDirector();
    }

    @Override
    public void printDetails() {
        System.out.println(toString());

    }
}
