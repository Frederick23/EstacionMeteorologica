package Climatologica;
public class TempHumDia extends Tempdia{
	public double humMax;
	public double humMin;

	TempHumDia(){
		this.tempmax = 0;
		this.tempmin = 0;
	}

	TempHumDia(Fecha fecha, double tempmax, double tempmin, double humMax, double humMin){
		super(fecha,tempmax,tempmin);
		this.humMax = humMax;
		this.humMin = humMin;
	}

	public String toString(){
		return super.toString() + " humedad media: "+ ((humMax+humMin)/2);
	}
}