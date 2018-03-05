package Climatologica;
public class Tempdia{
	public Fecha fechamedicion;
	public double tempmax;
	public double tempmin;

	Tempdia(){
		this.tempmax = 0;
		this.tempmin = 0;
	}

	Tempdia(Fecha fecha, double tempmax, double tempmin){
		this.fechamedicion = fecha;
		this.tempmax = tempmax;
		this.tempmin = tempmin;
	}

	public String toString(){
		return fechamedicion.toString() + " maximas: "+ tempmax + " minimas: "+tempmin+ " media: "+((tempmax + tempmin) /2);
	}
}