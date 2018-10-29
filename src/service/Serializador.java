package service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializador {

	public static void serializa(Serializable obj, final String nome) {
		try {
			FileOutputStream fileOut = new FileOutputStream(nome + ".ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obj);
			out.close();
			fileOut.close();
			System.out.printf("Objeto serializado em  /" + nome + ".ser");
		} catch (IOException i) {
			i.printStackTrace();
			System.out.printf("Erro ao serializar o objeto");
		}
	}

	public static Serializable deserializar(String nome) {
		try {
			FileInputStream fileIn = new FileInputStream(nome + ".ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Serializable s = (Serializable) in.readObject();
			in.close();
			fileIn.close();
			return s;
		} catch (IOException i) {
			i.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return null;
		}
	}
}
