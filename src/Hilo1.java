import java.util.Random;

public class Hilo1 extends Thread{

    ClasePrincipal clasePrincipal;

    public Hilo1(ClasePrincipal clasePrincipal) {this.clasePrincipal=clasePrincipal;}

    int numRandom=0;

    @Override
    public void run() {


        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        do{
        numRandom=(int) Math.random(); //No consigo que me de otro número distinto de 0
        System.out.println("El número que me da es: "+numRandom);

        }while(numRandom>=4 && numRandom<=20);
        //La condición para estar bien tendría que ser con || pero para que el programa continue pongo &&

        System.out.println("Número random: "+numRandom);

    }



}



