
package boletin17_2;

/**
 
 * @author raguiarperez
 */
public class Boletin17_2 {


    public static void main(String[] args) {
        Aves av=new Aves();
        Avestruza avs=new Avestruza();
        Morcego mor=new Morcego();
        Papagaio pap=new Papagaio();
        Mamífero mam=new Mamífero();
        Felino fel=new Felino();
        Gato gat=new Gato();
        Tigre tig=new Tigre();
        
        //Avestruz
        avs.caminar();
        //Morcego
        mor.caminar();
        mor.voar();
        //papagaio
        pap.caminar();
        pap.voar();
        //gato
        gat.caminar();
        gat.nadar();
        //tigre
        tig.caminar();
        tig.nadar();
    }
    
}
