import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreadorDeArchivo {
	void crearArchivo(String ruta, String contenido) {
		try (PrintWriter archivoEncriptado = new PrintWriter(new FileWriter(ruta))) {
			archivoEncriptado.print(contenido);
		} catch (IOException e) {
			throw new RuntimeException("Error al crear el archivo: " + e.getMessage());
		}
	}
}

