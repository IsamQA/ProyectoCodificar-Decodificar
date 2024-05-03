import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Encriptador encriptador = new Encriptador();
		Scanner scanner = new Scanner(System.in);
		LectorDeArchivo lectorDeArchivo = new LectorDeArchivo();
		DesencriptadoFuerzaBruta desencriptado = new DesencriptadoFuerzaBruta();
		CreadorDeArchivo creaArchivo = new CreadorDeArchivo();

		System.out.println(
				"Bienvenido al programa para encriptar y desencriptar archivos!\n" +
				"Para encriptar presione 1 y enter\n" +
				"Para desencriptar presione 2 y enter");

		String decisionDelUsuario = scanner.nextLine();
		if (decisionDelUsuario.equals("1")) {
			System.out.println("Ingrese la ruta absoluta del archivo (Ejemplo: c:\\windows\\proyectos\\nota.txt)");
			Path rutaDeArchivo = Path.of(scanner.nextLine());
			String archivoAEncriptar = lectorDeArchivo.leerArchivo(rutaDeArchivo);

			System.out.println("Ingrese el número de cambios para encriptar:");
			int claveDeSaltos = Integer.parseInt(scanner.nextLine());

			String textoEncriptado = encriptador.encriptar(archivoAEncriptar, claveDeSaltos);

			System.out.println("Ingrese la ruta absoluta del nuevo archivo encriptado " +
					"(Ejemplo: c:\\windows\\projects\\nuevaNotaCodificada.txt)");
			String rutaDelNuevoArchivo = scanner.nextLine();
			creaArchivo.crearArchivo(rutaDelNuevoArchivo, textoEncriptado);
			System.out.println("Texto encriptado creado, gracias por usar la aplicacion");
		} else if (decisionDelUsuario.equals("2")) {
			System.out.println("Ingrese la ruta absoluta del archivo a desencriptar:");
			Path rutaDelArchivoADesencriptar= Path.of(scanner.nextLine());
			String archivoADesencriptar = lectorDeArchivo.leerArchivo(rutaDelArchivoADesencriptar);
			String textoDesencriptado= desencriptado.forzarDesencriptado(archivoADesencriptar);
			System.out.println("Ingrese la ruta absoluta del nuevo archivo encriptado " +
					"(Ejemplo: c:\\windows\\projects\\nuevaNotaCodificada.txt)");
			String rutaDelNuevoArchivo = scanner.nextLine();
			creaArchivo.crearArchivo(rutaDelNuevoArchivo, textoDesencriptado);
			System.out.println("Texto desencriptado creado, gracias por usar la aplicacion");
		} else {
			System.out.println("Opción no válida.");
		}
	}
}