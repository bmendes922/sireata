package  br.edu.utfpr.dv.sireata.model ;

import static  org.junit.jupiter.api.Assertions. * ;

import  org.junit.jupiter.api.BeforeEach ;
import  org.junit.jupiter.api.Test ;

class  UsuarioTest {
	
	Usuario usuario;
    Ata ata;
	int idUsuario;

	@BeforeEach
	void  setUp () lança  Exception {
		usuario =  ursAta ();
		ata =  atUsuario ();
		idUsuario = 10 ;
		usuario.setAtivo(true);
	}

	@Teste
	void  testGetIdUsuario() {
		dpata.setIdUsuario (idUsuario);
		assertEquals (idUsuario, ata.getIdUsuario());
		
	}

	@Teste
	void  testGetAta () {
		ata.setUsuario(usuario);
		assertEquals (ata, usuario.getUsuario ());
	}

}