package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Surgeon cirujano = new Surgeon();
        Doctor doctorCirujano = cirujano;


    }
    public static void metodoNecesitoDoctor (Doctor doc){
        doc.treatPatient();
    }

}
