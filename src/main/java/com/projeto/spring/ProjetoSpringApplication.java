package com.projeto.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoSpringApplication {

	public static void main(String[] args) {
		String colorGreen = "\u001B[32m";
		SpringApplication.run(ProjetoSpringApplication.class, args);
		System.out.println("\n" +colorGreen+
				" =================================================================================================== \n"+
				"  ______     __        _    _                 _     _              _         _                     \n" +
				" |  _ \\ \\   / /  _    | |  | |               | |   (_)            | |       | |                    \n" +
				" | |_) \\ \\_/ /  (_)   | |  | |_ __ _   _  ___| |    _  ___      __| | ___   | |_   _  ___ ___ __ _ \n" +
				" |  _ < \\   /         | |  | | '__| | | |/ _ \\ |   | |/ _ \\    / _` |/ _ \\  | | | | |/ __/ __/ _` |\n" +
				" | |_) | | |     _    | |__| | |  | |_| |  __/ |   | | (_) |  | (_| |  __/  | | |_| | (_| (_| (_| |\n" +
				" |____/  |_|    (_)    \\____/|_|   \\__, |\\___|_|   | |\\___/    \\__,_|\\___|  |_|\\__,_|\\___\\___\\__,_|\n" +
				"                                    __/ |         _/ |                                             \n" +
				"                                   |___/         |__/                                              \n"+
				" ===================================================================================================");
	}

}
