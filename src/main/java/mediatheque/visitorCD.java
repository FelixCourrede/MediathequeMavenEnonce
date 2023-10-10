package mediatheque;

public class visitorCD implements Visitor {
@Override
public String visit(CD cd){
    return(cd.toString());
}
@Override
public String visit(Book book){
    return("");
}
}
