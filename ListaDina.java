package clases;

import javax.swing.JOptionPane;

public class ListaDina {
	private Nodo primero, fin, nuevo;
	private int tamano;

	public ListaDina() {
		primero = fin = null;
		tamano = 0;
	}

	public int dameTamano() {
		return tamano;
	}

	public void InsertarDato(int info) {
		if (ListaVacia()) {
			primero = new Nodo(info);

		} else {
			Nodo nuevo = new Nodo(info);
			nuevo.setEnlace(primero);
			primero = nuevo;
		}
		tamano++;
	}

	public void MostrarDatos() {

		if (ListaVacia()) {
			JOptionPane.showMessageDialog(null, "La lista está vacía, no hay datos para mostrar", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			Nodo aux = primero;
			while (aux != null) {
				System.out.print(aux.dameDato() + "--->");
				aux = aux.dameEnlace();
			}
			System.out.println("");
		}
	}

	public void EliminaDato(int nodo) {
		if (ListaVacia()) {
			JOptionPane.showMessageDialog(null, "Imposible eliminar el nodo, la lista está vacía");
		} else {
			if (nodo == 0) {
				primero = primero.dameEnlace();
				tamano--;
			} else {
				int i = 0;
				Nodo siguiente = primero;
				while (i < nodo - 1) {
					siguiente = siguiente.dameEnlace();
					i++;
				}
				siguiente.setEnlace(siguiente.dameEnlace().dameEnlace());
				tamano--;
			}
		}
		

	}

	public boolean ListaVacia() {
		return (primero == null) ? true : false;
	}
}
