
package tv;


public class TvCanais {
    
    int canal;
    int idade;
    String nome;
    boolean controle;
    boolean hdmi;
    
    
    void metodo1(){
        
        if(canal<12){
        System.out.println(this.nome );
                System.out.println("Você está assistindo um canal aberto");
    }
        if(canal>12){
            System.out.println(this.nome );
            System.out.println("Você está assistindo a um canal fechado");
        }
        if(idade<18){
            System.out.println(this.nome );
            System.out.println("Você está proibido de assistir canais adultos");
        }
    }
    void metodo2(){
        if(controle==true){
            System.out.println(this.nome);
                System.out.println("O controle está com bateria :D");
        }else{
            System.out.println(this.nome);
                System.out.println("O controle está sem bateria");
        }
        
    }
    
    void metodo3(){
        if(hdmi==true){
            System.out.println(this.nome);
                System.out.println("Você está habilitado para assistir todos os canais!");
        }else {
            System.out.println(this.nome);
                System.out.println("Você só poderá assistir canais abertos");
        }
        
    }
    
    
}
