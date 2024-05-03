public class CambiadorDeLetras {
	private char CambiadorChar (char letra, int numeroDeMovimientos) {
		int codigoDeLetra = letra + numeroDeMovimientos;
		char letraCambiada = (char) codigoDeLetra;
		return letraCambiada;
	}

	String CambiadorStrings (String lineaDeTexto, int numeroDeMovimientos) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < lineaDeTexto.length(); i++) {
			char caracterSinCambiar = lineaDeTexto.charAt(i);
			char caracteresCambiados = CambiadorChar(caracterSinCambiar, numeroDeMovimientos);
			stringBuilder.append(caracteresCambiados);
		}
		return stringBuilder.toString();
	}
}
