public class VisiteurPrefix implements Visiteur{


    public void visit(Addition addition) {
        addition.getOpG().accept(this);
        System.out.println(addition.getOp());
        addition.getOpD().accept(this);
    }
    public void visit(Multiplication multiplication){
        multiplication.getOpG().accept(this);
        System.out.println(multiplication.getOp());
        multiplication.getOpD().accept(this);
    }

}
