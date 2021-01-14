package method;


public class Ejercicio {
	
	public static final Double PI = 3.14;
	

	public static void main(String[] args) {
				
		// Variables
		
		// Inicio			
		System.out.println(decimal("100"));
	}
	
	public static int numeroSolucionesEcuacionSegundoGrado(int a, int b, int c) {
		int resul = b*b - 4*a*c;
		if (a == 0){
			return -1;
		}
		else if (resul > 0) {
			return 2;
		}
		else if (resul == 0){
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
	public static Double solucionSumaEcuacionSegundoGrado(int a, int b, int c) {
		if (numeroSolucionesEcuacionSegundoGrado(a,b,c) <= 0){
			return -1000.0;
		}
		else if (numeroSolucionesEcuacionSegundoGrado(a,b,c) == 1) {
			return (double)-b/(2*a);
		}
		else{
			return (double)(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		}
	}
	
	
	public static Double solucionRestaEcuacionSegundoGrado(int a, int b, int c) {
		if (numeroSolucionesEcuacionSegundoGrado(a,b,c) <= 0){
			return -1000.0;
		}
		else if (numeroSolucionesEcuacionSegundoGrado(a,b,c) == 1) {
			return (double)-b/(2*a);
		}
		else{
			return (double)(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		}
	}	
	
	public static Double areaCirculo(Double r) {
		Double A=PI*(r*r);
		return A;
	}
	
	public static Double longitudCirculo(Double r) {
		Double L=2*PI*r;
		return L;
	}
	
	public static boolean esMultiplo(int a, int b) {
		if (a == 0 || b == 0){
			return false;
		}
		
		else if (a % b == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static int horaMayor(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		if (hora1 > 12 || hora1 <= 0){
			return -1000;
		}
		else if (min1 > 59 || min2 > 59 || seg1 > 59 || seg2 >59) {
			return -1000;
		}
		else {
			int resul1 = (hora1 *3600) + (min1 * 60) + seg1;
			int resul2=(hora2 *3600) + (min2 * 60) + seg2;
			if (resul1 > resul2) {
				return 1;
			}
			else if (resul2 > resul1) {
				return 2;
			}
			else {
				return 0;
			}
		}
		
	}
	
	public static int segundosEntre(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		int resultado= (horaMayor(hora1, min1, seg1, hora2, min2, seg2));
		if (resultado == -1000 || resultado == 2) {
			return -1000;
		}
		else {
			int resul1 = (hora1 *3600) + (min1 * 60) + seg1;
			int resul2=(hora2 *3600) + (min2 * 60) + seg2;
			int resul= resul1-resul2;
		return resul;
	}
	}
	public static int maximoComunDivisor(int a, int b) {
		int divisor, dividendo;
		if (a > b) {
			dividendo = a;
			divisor = b;
		}
		else {
			dividendo = b;
			divisor = a;
		}
		while (dividendo % divisor != 0) {
			int resto = dividendo % divisor;
			dividendo = divisor;
			divisor = resto;
		}
		return divisor;
	}
	
	public static int minimoComunMultiplo(int a, int b) {
		int mcm=maximoComunDivisor(a,b);
		return (a*b/mcm);
	}
	
	public static String binario(int num) {
		StringBuilder resul = new StringBuilder ("");
		if (num == 0) {
			return "0";
		}
		while(num != 1){
			resul= resul.append(num % 2);
			num = num/2;
		}
		resul = resul.append(num);
		resul= resul.reverse();
		return resul.toString();
	}
	
	public static int decimal(String num) {
		int resul = 0;
		int cont=0;
		int potencia= 1;
		StringBuilder numero = new StringBuilder (num);
		numero = numero.reverse();
		while(cont<numero.length()) {
			if (numero.charAt(cont) == '1') {
			resul= resul + (1*(potencia));
			}
			potencia= potencia *2;
			cont ++;
			}
		return resul;
	}
}
