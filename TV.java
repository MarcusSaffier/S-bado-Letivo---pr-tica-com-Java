
package tv;


public class TV {

  
    public static void main(String[] args) {
        TvCanais u1 = new TvCanais();
        u1.nome="Pedro";
        u1.idade=18;
        u1.canal=10;
        u1.controle=false;
        u1.hdmi=false;
        u1.metodo1();
        u1.metodo2();
        u1.metodo3();
        
        
        TvCanais u2 = new TvCanais();
        u2.nome="Amanda";
        u2.idade=15;
        u2.canal=17;
        u2.controle=true;
        u2.hdmi=true;
        u2.metodo1();
        u2.metodo2();
        u2.metodo3();
    }
    
}
