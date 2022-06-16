package projetofinal;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import projetofinal.Arquivo;

public class principal {

	public static void main(String[] args) throws IOException  {
		//String path = "projetofinal.txt";
		Path dir = Paths.get("C:\\Users\\thyag\\OneDrive\\Área de Trabalho\\Faculdade 22-01\\Linguagem de Programação\\Projeto Final (rev1)");

		
		Path path = dir.resolve("projetofinal.txt");
		
		System.out.println(path);
		Arquivo.escritor(path.toString());
		Arquivo.leitor(path.toString());

	}

}