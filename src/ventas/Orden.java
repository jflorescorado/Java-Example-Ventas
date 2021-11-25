package ventas;


public class Orden {
	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;
	
	//Contructor
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;//Contador incrementable de ordenes y declaracion de id
		this.productos = new Producto[Orden.MAX_PRODUCTOS];//asignacion de nuevo producto agg a la orden
	}
	
	//Metodo / Contador incrementable de productos en una orden
	public void agregarProducto(Producto producto) {
		if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
			this.productos[this.contadorProductos++] = producto;
		}
		else {
			System.out.println("Se ha superado el maximo de productos" + Orden.MAX_PRODUCTOS);
			//Excede la cantidad de productos validos de una orden
		}
	}
	
	public double calcularTotal() {
		double total = 0;//Varible local al metodo
		for (int i = 0; i < this.contadorProductos; i++) {
			//Producto producto = this.productos[i];
			//total += producto.getPrecio(); //total = total + producto.getPrecio();
			total += this.productos[i] .getPrecio();
			//cualquiera se puede utilizar todas funcionan igual 
		}
		return total;	
	}
	
	public void mostrarOrden () {
		System.out.println("Id Orden: " + this.idOrden );
		double totalOrden = this.calcularTotal();
		System.out.println("Total orden: $" + totalOrden);
		System.out.println("productos de la orden");
		for (int i = 0; i < this.contadorProductos; i++) {
			System.out.println(this.productos[i]);
		}
	}
}
	
