import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LectorDeArchivo {
	String leerArchivo(Path rutaDeArchivo) {
		Path ruta = rutaDeArchivo.toAbsolutePath();
		try {
			List<String> lines = Files.readAllLines(ruta);
			StringBuilder contentBuilder = new StringBuilder();
			for (String line : lines) {
				contentBuilder.append(line).append("\n");
			}
			return contentBuilder.toString();
		} catch (IOException e) {
			throw new RuntimeException("Error al leer el archivo: " + e.getMessage());
		}
	}
}
