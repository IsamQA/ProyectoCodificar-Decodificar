public class Encriptador {
	CambiadorDeLetras cambiadorDeLetras=new CambiadorDeLetras();
	String encriptar(String lineaDeTexto, int numeroDeCambios){
		String textoEncriptado=cambiadorDeLetras.CambiadorStrings(lineaDeTexto, numeroDeCambios);
		return textoEncriptado;
	}
}
