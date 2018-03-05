package Climatologica;


public class Fecha
{
    private int dia;
    private int mes;
    private int anyo;
    
    public Fecha(int nuevoDia, int nuevoMes, int nuevoanyo) {
        dia = nuevoDia;
        mes = nuevoMes;
        anyo = nuevoanyo;
    }
    
    public void imprimir() {
        System.out.printf("%d/%d/%d", dia, mes, anyo);
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getanyo() {
        return anyo;
    }
    
    public void setDia(int nuevoDia) {
        dia = nuevoDia;
    }
    
    public void setMes(int nuevoMes) {
        mes = nuevoMes;
    }
    
    public void setanyo(int nuevoanyo) {
        anyo = nuevoanyo;
    }
    
    public String toString() {
        return dia + "/" + mes + "/" + anyo;
    }

    public int indexar (){
        int resul = 0;
        switch (mes) {
	        case 1:
	        	resul = dia;
	        	break;
	        case 2:
	        	resul = 31 + dia;
	        	break;
	        case 3:
	        	resul = 31 + 28 + dia;
	        	break;
	        case 4:
	        	resul = 31 + 28 + 31 + dia;
	        	break;
	        case 5:
	        	resul = 31 + 28 + 31 + 30 + dia;
	        	break;
	        case 6:
	        	resul = 31 + 28 + 31 + 30 + 31 + dia;
	        	break;
	        case 7:
	        	resul = 31 + 28 + 31 + 30 + 31 + 30 + dia;
	        	break;
	        case 8:
	        	resul = 31 + 28 + 31 + 30 + 31 + 30 + 31 + dia;
	        	break;
	        case 9:
	        	resul = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + dia;
	        	break;
	        case 10:
	        	resul = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dia;
	        	break;
	        case 11:
	        	resul = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dia;
	        	break;
	        case 12:
	        	resul = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + dia;
	        	break;
	        default:
	        	break;
        }

        return resul;
        
    }

        // Método auxiliar que me indica si una fecha es correcta 
    static boolean fechaOK ( int dia, int mes, int anyo){ 
    	boolean resul = false;
    		if ( mes >0 && mes < 13){
    			if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
    				if (dia > 0 && dia < 31){
    					resul = true;
    				}
    				else
    					resul = false;
    			}
    			if ( mes == 2 && anyo % 4 == 0){
    				if (dia > 0 && dia < 31){
    					resul = true;
    				}
    				else
    					resul = false;
            		
        		}
        		if (mes == 2 && anyo % 4 != 0){
        			if (dia > 0 && dia < 29){
        				resul = true;
        			}
        			else
        				resul = false;
        		}
        		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 9 || mes == 12){
        			if (dia > 0 && dia < 32){
        				resul = true;
        			}
        			else
        				resul = false;
       			}
    		}
    		else
    			resul = false;

    	return resul;
    } 
    
}