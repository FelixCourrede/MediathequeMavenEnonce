package mediatheque;

public class visitorMain implements Visitor{
    @Override
public String visit(CD cd){
    return(cd.toString());
}
@Override
public String visit(Book book){
    return(book.toString());
}
}
