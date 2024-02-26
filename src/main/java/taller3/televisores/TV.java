package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado; 
	private int volumen;
	private Control control;
	private static int numTv = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio= 500;
		TV.numTv++;
	}
	public Marca getMarca() {
		return this.marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca; 
	}
	public int getCanal() {
		return this.canal;
	}
	public void setCanal(int canal) {
		if (estado == true) {
			if (canal>=1 && canal<=120) {
		this.canal = canal;
			}
		}
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio; //
	}
	public int getVolumen() {
		return this.volumen;
	}
	public void setVolumen(int volumen) {
		if (estado == true) {
			if (volumen>=1 && volumen<=7) {
		this.volumen = volumen;
			}
		}
	}
	public Control getCotrol() {
		return this.control;
	}
	public void setControl(Control control) {
		this.control = control; //
	}
	public int getNumTV() {
		return TV.numTv;
	}
	public void setNumTV(int num) {
		TV.numTv = num;
	}
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false; 
	}
	public boolean getEstado() {
		return this.estado;
	}
	public void canalUp() {
		this.setCanal(canal + 1);
	}
	public void canalDown() {
		this.setCanal(canal - 1);
	}
	public void volumenUp() {
		this.setVolumen(volumen + 1);
	}
	public void volumenDown() {
		this.setVolumen(volumen - 1);
	}
}
