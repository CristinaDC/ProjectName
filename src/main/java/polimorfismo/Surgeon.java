package polimorfismo;

public class Surgeon extends Doctor{

    @Override
    void treatPatient (){
        makeIncision();
        System.out.println("Surgeon makeIncision");

    }
}
