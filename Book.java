public class Book<T> {
    private T title;

    public Book(T title) {
        this.title = title;
    }

    public T getTitle() {
        return title;
    }
}
