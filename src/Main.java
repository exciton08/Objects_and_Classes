public class Main {
    public static void main(String[] args) {
        Author alexandreDumas = new Author("Alexandre", "Dumas");
        Book firstBook = new Book("The Count of Monte Cristo", alexandreDumas, 1845);
        Author jackLondon = new Author("Jack", " London");
        Book secondBook = new Book("Love of live", jackLondon, 1907);
        System.out.println(firstBook.getBookName() + ", " + alexandreDumas.getName() + alexandreDumas.getSurname() + ", "+ firstBook.getPublishYear());
        firstBook.setPublishYear(2021);
        System.out.println(firstBook.getBookName() + ", " + alexandreDumas.getName() + alexandreDumas.getSurname() + ", "+ firstBook.getPublishYear());



    }
}