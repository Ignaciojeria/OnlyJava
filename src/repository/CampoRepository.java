package repository;

import domain.Animal;
import domain.Campo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CampoRepository {

    private Campo campo = new Campo();

    /* Creamos la instancia unica y global de campoRepository */
    private static final CampoRepository campoRepository = new CampoRepository();

    /* cómo es private no puedes hacer un new CampoRepository */
    private CampoRepository(){
        campo.setId(UUID.randomUUID().toString());
        campo.setLatitud(10.342D);
        campo.setLongitud(11.432D);
    }

    /* un método estatico puede ser llamado de la siguiente manera CampoRepository.nombreDeMétodo. Este método nos devuelve el singleton */
    public static CampoRepository getInstance(){
        return campoRepository;
    }

    /*Retorna su banco de datos */
    public Campo getCampo(){
        return campo;
    }


}
