import edu.eci.pdsw.samples.entities.EntradaForo;
import edu.eci.pdsw.samples.entities.Usuario;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel Rojas
 */
public class EntradasForoTest {
    
    /*
    CLASES DE EQUIVALENCIA:
    
    CLASE 1: CUANDO SE INGRESA UN USUARIO INVALIDO
    TIPO: (NORMAL)
    SE ESPERA UN ERROR: SI(X) NO()
    
    CLASE 2: EL IDENTIFICADOR NO ES UN NUMERO
    TIPO: (NORMAL)
    SE ESPERA UN ERROR: SI(X) NO()
    */
    
    public EntradasForoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
       
    
    @Test
    public void EntradaForoTest(){
        Usuario usu = new Usuario("usuario@algo.com","usuario1");
        Date dt = new Date(2016,10,22);
        EntradaForo entF = new EntradaForo(1,usu,"primera entrada","TituloPrueba",dt);
        String comentario = entF.getComentario();
        
        assertEquals("No logro entrar al foro","primera entrada", comentario);
    }
    
}