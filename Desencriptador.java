public class Desencriptador {
	CambiadorDeLetras cambiadorDeLetras=new CambiadorDeLetras();
	String desencriptar(String textoEncriptado, int numeroDeCambios){
		int numeroDeCambiosOpuestos= -numeroDeCambios;
		String textoDesencriptado =cambiadorDeLetras.CambiadorStrings(textoEncriptado,numeroDeCambiosOpuestos);
		return textoDesencriptado;
	}
}
