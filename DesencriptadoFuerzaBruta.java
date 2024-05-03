import java.util.HashSet;
import java.util.Set;

public class DesencriptadoFuerzaBruta {
	Desencriptador desencriptador = new Desencriptador();

	String forzarDesencriptado (String textoEncriptado) {
		String textoQuizaDesencriptado = null;
		for (int i = 0; i < 10000; i++) {
			textoQuizaDesencriptado = desencriptador.desencriptar(textoEncriptado, i);
			boolean identificarPalabrasConocidas = identificadorDePalabrasConocidas(textoQuizaDesencriptado);
			if(identificarPalabrasConocidas) {
				System.out.println("Clave de Cambios= " + i);
				return textoQuizaDesencriptado;
			}
		}
		return textoQuizaDesencriptado;
	}

	private boolean identificadorDePalabrasConocidas (String texto) {
		Set<String> palabrasConocidas = new HashSet<>();
		palabrasConocidas.add(" de ");
		palabrasConocidas.add(" a ");
		palabrasConocidas.add(" ante ");
		palabrasConocidas.add(" con ");
		palabrasConocidas.add(" para ");
		palabrasConocidas.add(" por ");
		palabrasConocidas.add(" sin ");
		for (String palabra : palabrasConocidas) {
			if (texto.toLowerCase().contains(palabra.toLowerCase())) {
				return true;
			}
		}
		return false;
	}
}
