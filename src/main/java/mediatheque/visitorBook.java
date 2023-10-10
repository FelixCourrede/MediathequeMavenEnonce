package mediatheque;

public class visitorBook implements Visitor {
    @Override
public String visit(CD cd){
    return("");
}
@Override
public String visit(Book book){
    return(book.toString());
}
}
