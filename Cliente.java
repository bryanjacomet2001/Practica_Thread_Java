import java.util.function.Function;

public class Cliente {

	private String nombre;
	private int[] carroCompra;

	// Constructor, getter y setter

	public Cliente(String nombre, int[] carroCompra){
		this.nombre = nombre;
		this.carroCompra = carroCompra;
	}

	public String getNombre(){
		return this.nombre;
	}

	public int[] getCarroCompra(){
		return this.carroCompra;
	}

}