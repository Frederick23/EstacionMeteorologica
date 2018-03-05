package Climatologica;
import java.util.Scanner;

/**
 * 
 * @author Diego Cuenca Arriols
 *
 */


public class EstacionClimatica{
	/**
	 * Atributo nombre de la estacion
	 */
	private String nombre;
	/**
	 * Atributo año de la estación
	 */
	public int anyo;
	/**
	 * Array de mediciones 
	 */
	private TempHumDia tempAnyo [];
	/**
	 * Numero de mediciones almacenadas en el Array
	 * @see tempAnyo
	 */
	private int nummediciones;

	
	/**
	 * Constructor sin argumentos, crea una estación del año 2000
	 */
	public EstacionClimatica(){
		this.nombre = "";
		this.anyo = 2000;
		tempAnyo = new TempHumDia[366];
		nummediciones = 0;

	}
	/**
	 * Constructor con argumentos, crea una estación con nombre y año
	 * @param nombre Nombre de la estación
	 * @param anyo Año de la estación
	 */

	public EstacionClimatica(String nombre, int anyo){
		this();
		this.nombre = nombre;
		this.anyo = anyo;
	}
	/**
	 * Añade una medida a la estación
	 * @param media Medida que se va a añadir a la estación 
	 * @return <ul><li>true: la medida se ha añadido.</li><li>false: la medida no se ha podido añadir</li></ul>
	 */
	public boolean addDia(TempHumDia media){
		int indice = 0;
		/* Comprobamos si la fecha es correcta */
		if (Fecha.fechaOK(media.fechamedicion.getDia(), media.fechamedicion.getMes(), media.fechamedicion.getanyo()) == true){

			/* Llamamos a la funcion indexar que dada una fecha nos devuelve el dia del año que es*/
			indice = media.fechamedicion.indexar();

			/* Primera inserción */
			if (nummediciones == 0){
				tempAnyo[indice-1] = media;
				nummediciones++;
				return true;
			}
			else{
				/* Si aún podemos insertar, inserta en el array */
				if (nummediciones != 366){
					tempAnyo[indice] = media;
					nummediciones++;
					return true;	
				}
				else{
					System.out.println("No se puede incluir mas dias");
					return false;
				}
				
			}
		}
		else
			return false;
	}
/**
 * Elimina una medida de la estación
 * @param media Medida a eliminar
 * @return <ul><li>true: La medida existia y se ha eliminado.</li><li>false: La medida no existia y por lo tanto no se ha podido eliminar</li></ul>
 */
	public boolean delDia ( TempHumDia media){ 
			int indice = 0;
			indice = media.fechamedicion.indexar();
			
			if (tempAnyo[indice-1] != null) {
				tempAnyo[indice-1] = null;
				return true;
			}
			else {
				System.out.println("No se ha podido eliminar ya que esa temperatuda no ha sido insertada antes");
				return false;
			}

    } 
    /**
     * Muestra por pantalla todas las mediciones almacenadas
     */
    public void listarDias(){ 
    	for (int i = 0; i < tempAnyo.length; i++){
    		if (tempAnyo[i] != null){
    			System.out.println(tempAnyo[i]);
    		}
    	}
     
    } 
    

    
    /**
     * Lee una medida
     * @return <ul><li>true: la medida se ha podido leer .</li><li>false: la medida no se ha podido leer</li></ul>
     */
    static TempHumDia leerMedida () { 

         Scanner leer = new Scanner(System.in); 
         int dia,mes,anyo, tempmax, tempmin, hummax, hummin; 
         TempHumDia  medicion = null; 
         
        boolean error = true; 
        do { 
        System.out.println("Dia:"); dia = leer.nextInt(); 
        System.out.println("Mes:");  mes = leer.nextInt(); 
        System.out.println("Anyo:");  anyo = leer.nextInt(); 
  
        if ( Fecha.fechaOK( dia,mes,anyo) ) { 
             System.out.println ( " Tº Maxima:"); tempmax = leer.nextInt(); 
             System.out.println ( " Tº Minima:"); tempmin = leer.nextInt(); 
             System.out.println ( " Hº Maxima:"); hummax = leer.nextInt(); 
             System.out.println ( " Hº Minima:"); hummin = leer.nextInt(); 
             medicion = new TempHumDia ( new Fecha(dia,mes,anyo), (double)tempmax, (double)tempmin, (double)hummax, (double)hummin); 
             error = false; 
            } 
        else 
        { 
            System.out.println(" Fecha erronea"); 
        } 
    
    } while (  error); 
    
    return medicion; 
	} 

}