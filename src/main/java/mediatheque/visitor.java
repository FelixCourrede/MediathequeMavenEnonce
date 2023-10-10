package mediatheque;

public class visitor {
    public String visitCD(CD cd){
        return cd.toString();
    }
        public String visitBook(Book book){
        return book.toString();
    }
}

