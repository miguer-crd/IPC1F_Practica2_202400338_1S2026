package practica2.views;

/**
 *
 * @author Miguer Corado
 */
public class PersonajeController {
    
    public static PersonajeModel[] personajes = new PersonajeModel[100];
    public static int contador = 0;

    public void agregarPersonajesQuemados(){

        PersonajeModel harry = new PersonajeModel();
        PersonajeModel draco = new PersonajeModel();

        EscobaModel nimbus2000 = new EscobaModel();
        EscobaModel nimbus2001 = new EscobaModel();
        EscobaModel saeta = new EscobaModel();

        nimbus2000.setDormirSeg(1000);
        nimbus2000.setNombre("Nimbus 2000");
        nimbus2000.setIdEscoba(1);

        nimbus2001.setDormirSeg(700);
        nimbus2001.setNombre("Nimbus 2001");
        nimbus2001.setIdEscoba(2);

        saeta.setDormirSeg(400);
        saeta.setNombre("Saeta de Fuego");
        saeta.setIdEscoba(3);

        harry.setIdPersonaje(1);
        harry.setCasa(Casas.GRYFFINDOR);
        harry.setEscoba(nimbus2000);
        harry.setNombre("Harry Potter");

        draco.setIdPersonaje(2);
        draco.setCasa(Casas.SLYTHERIN);
        draco.setEscoba(nimbus2001);
        draco.setNombre("Draco Malfoy");

        personajes[contador++] = harry;
        personajes[contador++] = draco;
    }
}   
