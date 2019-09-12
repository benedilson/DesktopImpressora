import java.io.File;

public class Teste {

	public static void main(String[] args) {

		File diretorio = new File("C:\\tmp");
		if (!diretorio.exists()) {
			diretorio.mkdir();
		}

		// String fileName = "testandoTotal.txt";
		//
		// try {
		//
		// PrintWriter printWriter = new PrintWriter(fileName);
		// printWriter.println("Agora vai dar certo");
		// printWriter.close();
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		/*
		 * File arq = new File("C:\\Users\\Public\\testando123.txt"); try {
		 * arq.createNewFile(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

	}

}
