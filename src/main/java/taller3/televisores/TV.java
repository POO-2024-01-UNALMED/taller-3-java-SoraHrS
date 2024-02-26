package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado; 
	private int volumen = 1;
	private Control control;
	private static int numTv;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
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
		if (estado == true && canal>=1 && canal<=120) {
		this.canal = canal;
			}
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio; 
	}
	public int getVolumen() {
		return this.volumen;
	}
	public void setVolumen(int volumen) {
		if (estado == true && volumen>=0 && volumen<=7) {
		this.volumen = volumen;
			}

	}
	public Control getCotrol() {
		return this.control;
	}
	public void setControl(Control control) {
		this.control = control; 
	}
	public static int getNumTV() {
		return TV.numTv;
	}
	public static void setNumTV(int num) {
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
