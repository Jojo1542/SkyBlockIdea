package es.jojo1542.skyblockidea.player;

import es.jojo1542.skyblockidea.player.profile.SkyBlockProfile;

import java.util.List;
import java.util.UUID;

public class SkyBlockUser {

    private String id;

    private UUID actualProfile; //Podes usar una uuid o una id numerica para identificar el perfil

    /*

    Al igual que hace SWM, para evitar dupeos y tal, bloquea el jugador,
    por si se conecta al otro servidor mientras se guarda su data,
    cuando se desconecte, puedes hacer que el proxy lo unlockee o algo así idk

    Cuando se termine de guardar, como es async [Podriamos ponerle una api], podes enviar un mensaje de Redis o NATS
    y cargar el usuario desde el otro servidor.

     */

    private boolean locked;

    /*

    Podes hacer que si lleva mas de 1 min bloqueado, lo cargue

     */

    private long lockedTime;

    public SkyBlockProfile getActualProfile() {
        //Geteas del storage [HAZ CACHE] con la uuid del jugador, podes hacerte una interfaz, y las partidas de coop guardar el perfil de cada jugador.
        return null;
    }
}
