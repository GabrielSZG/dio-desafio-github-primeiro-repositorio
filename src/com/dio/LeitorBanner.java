package com.dio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeitorBanner {
	
	public void lerBanner() {
		Path path = Paths.get("C:/workspace/eclipse/ProjetoBanco/banner.txt");
		try {
			byte[] texto = Files.readAllBytes(path);
			String leitura = new String(texto);
			
			 System.out.println(leitura);
			
		}catch(Exception erro) {
			
		}
	}
}