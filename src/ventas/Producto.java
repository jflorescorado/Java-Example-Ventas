package ventas;

public class Producto {
	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;
	
	//solamente se utiliza para inicializar la variable contador
	private Producto() {
		 this.idProducto = ++Producto.contadorProductos;
		 //Contador de productos incrementable y declaracion de id
	}
	
	//Primero si vamos a utilizar una llamada de un contructor interno debemos mandar a llamarlo de primero nuestra clase
	public Producto(String nombre, double precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public int getIdProducto() {
		return idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
