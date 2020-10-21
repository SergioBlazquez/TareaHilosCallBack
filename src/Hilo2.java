public class Hilo2 extends Thread{

    ClasePrincipal clasePrincipal;

    public Hilo2(ClasePrincipal clasePrincipal) {this.clasePrincipal=clasePrincipal;}

    @Override
    public void run() {

        for(int i=0; i<5;i++){
            //Pongo 5 porque el número aleatorio no me sale otra cosa distinto a 0

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Me he dormido "+(i+1)+" veces");


        }


    }
}
