package MyBean;

import javax.ejb.Stateless;


@Stateless
public class Addition {
    
    private int i, j, k;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
    public void add(){
        k = i + j;
    }
    
    public void subtract(){
        k = i - j;
    }
    
    public void multiply(){
        k = i * j;
    }
    
    public void divide(){
        k = i / j;
    }
    
    public void modulus(){
        k = i % j;
    }
}
