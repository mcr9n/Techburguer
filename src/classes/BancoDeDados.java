package classes;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class BancoDeDados {

	static String bdPath = "./src/bd/";

	public static void createFile(String filename) throws IOException {
		try {
			File file = new File(bdPath + filename + ".txt");
			if (!file.exists()) {
				file.createNewFile();

				RandomAccessFile raf
						= new RandomAccessFile(file, "rw");

				raf.setLength(20);
			}
		} catch (IOException ioe) {
			System.out.println("Erro ao criar o arquivo. Erro:");
			System.out.println(ioe);
		}
	}

	public static void readFile(String filename) {

		try {
			File file = new File(bdPath + filename + ".txt");

			RandomAccessFile raf
					= new RandomAccessFile(file, "rw");

			while (raf.getFilePointer() < raf.length()) {
				String currentLine = "";

				currentLine = raf.readLine();

				System.out.println(currentLine);
			}

		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo. Erro:");
			System.out.println(e);
		}

	}

	public static void writeOnFile(String filename) {
		try {
			String teste = "ola mundo";
			String teste2 = "ola planeta";
			File file = new File(bdPath + filename + ".txt");

			RandomAccessFile raf
					= new RandomAccessFile(file, "rw");

			raf.setLength(10);
			raf.writeBytes(teste);
			raf.writeBytes(System.lineSeparator());

		} catch (Exception e) {
			System.out.println("Erro na ao escrever no arquivo. Erro:");
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Produto> teste = new ArrayList<Produto>();
		teste.add(new Produto(14, "hamburguer"));
		teste.add(new Produto(14, "batata"));

		createFile("teste");
		readFile("teste");
		writeOnFile("teste");
		readFile("teste");
	}
}
