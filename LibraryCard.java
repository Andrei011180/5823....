public class LibraryCard<K, V> {
    private K cardNumber;
    private V bookInfo;

    public LibraryCard(K cardNumber, V bookInfo) {
        this.cardNumber = cardNumber;
        this.bookInfo = bookInfo;
    }

    public K getCardNumber() {
        return cardNumber;
    }

    public V getBookInfo() {
        return bookInfo;
    }
}

