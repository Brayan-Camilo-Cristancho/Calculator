package Model;

public class modelConector {

    private final IOperations iOperations;
    
    public modelConector(){
        this.iOperations = new OperationsImp();
    }

    public IOperations getiOperations() {
        return iOperations;
    }
    
}
