package GarbaggeCollection;

public class ReassigningReferenceDemo {

    // to store object name 
    String obj_name;

    public ReassigningReferenceDemo(String obj_name) {
        this.obj_name = obj_name;
    }

    // Driver method 
    public static void main(String args[]) {
        ReassigningReferenceDemo t1 = new ReassigningReferenceDemo("t1");
        ReassigningReferenceDemo t2 = new ReassigningReferenceDemo("t2");
        //t1 now referred to t2 
        t1 = t2;

        // calling garbage collector 
        System.gc();
    }

    @Override
    /* Overriding finalize method to check which object 
     is garbage collected */
    protected void finalize() throws Throwable {
        // will print name of object 
        System.out.println(this.obj_name + " successfully garbage collected\n");
    }

}
