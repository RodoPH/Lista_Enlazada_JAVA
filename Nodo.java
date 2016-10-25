package clases;

public class Nodo {
	private int dato;
	private Nodo enlace;
	public Nodo(){
		
	}
	public Nodo(int info){
		dato = info;
		enlace = null;
	}
	
	public int dameDato(){
		return dato;
	}
	
	public Nodo dameEnlace(){
		return enlace;
	}
	
	public void setEnlace(Nodo enlace){
		this.enlace = enlace;
	}
}
