package mediatheque;

public interface Visitor {
    public String visit(CD cd);
        public String visit(Book book);
}

