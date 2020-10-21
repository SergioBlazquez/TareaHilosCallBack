public class ClasePrincipal {

    public ClasePrincipal() throws Exception{

    Hilo1 Hilo1 = new Hilo1(this);

    Hilo1.start();
    Hilo1.join();


    Hilo2 Hilo2 = new Hilo2(this);

    Hilo2.start();
    Hilo2.join();

    }



}
