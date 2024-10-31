public class Main {

    public static void main (String [] args) {

        Auto cascajo = new Auto("123LATA", "Renault 12");
        Auto fordFocus = new Auto("999POWR", "Ford Focus");
        Celular celular = new Celular("Movistar", 123456789, 100.0);


        Padre padre = new Padre();
        padre.m_Auto = fordFocus;

        System.out.println("Papá me dejó esta casa en zona: " + padre.m_Casa.getZona() );

        Hijo juanCarlos = new Hijo("Juan Carlos", celular, cascajo);

    System.out.println("Papá me dejó este auto: " + juanCarlos.m_Auto.getModelo() );
        juanCarlos.conducirAuto(fordFocus);
        juanCarlos.jugarFUtbol();
    }
}
