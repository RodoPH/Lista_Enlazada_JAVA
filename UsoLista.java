package clases;

import javax.swing.JOptionPane;

public class UsoLista {

	public static void main(String[] args) {
		int caso, dato;
		ListaDina lista = new ListaDina();

		do {
			try {
				caso = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Elige un opci�n: \n1: Agregar dato. \n2: Eliminar nodo. \n3: Mostrar dato. \n4: Salir.",
						"Selecciona", JOptionPane.QUESTION_MESSAGE));
				switch (caso) {
				case 1:
					dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el n�mero a insertar a la lista",
							"Datos", JOptionPane.QUESTION_MESSAGE));
					lista.InsertarDato(dato);
					System.out.println("Tama�o de la lista: " +lista.dameTamano());
					break;
				case 2:
					dato = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Escribe la posici�n del nodo a eliminar de la lista", "Datos", JOptionPane.QUESTION_MESSAGE));
					lista.EliminaDato(dato-1);
					lista.dameTamano();
					break;
				case 3:
					lista.MostrarDatos();
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Saliendo");
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Opci�n no disponible");
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Error-----> " + e.getMessage());
				caso = 0;
			}

		} while (caso != 4);

	}

}
