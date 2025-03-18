package decisiones;

public class Switch {

	public static void main(String[] args) {

		int diaSemana = 3;
		String nombreDia;

		switch (diaSemana) {
		case 1:
			nombreDia = "Lunes";
			break;
		case 2:
			nombreDia = "Martes";
			break;
		case 3:
			nombreDia = "Miércoles";
			break;
		case 4:
			nombreDia = "Jueves";
			break;
		case 5:
			nombreDia = "Viernes";
			break;
		case 6:
			nombreDia = "Sábado";
			break;
		case 7:
			nombreDia = "Domingo";
			break;
		default:
			nombreDia = "Día inválido";
			break;
		}
		System.out.println("Hoy es " + nombreDia);

		int mes_number = 2;
		String mes_name = "Enero";

		switch (mes_number) {
		case 1:
			mes_name = "Enero";
			break;
		case 2:
			mes_name = "Febrero";
			break;
		case 3:
			mes_name = "Marzo";
			break;
		case 4:
			mes_name = "Abril";
			break;
		case 5:
			mes_name = "Mayo";
			break;
		case 6:
			mes_name = "Junio";
			break;
		case 7:
			mes_name = "Julio";
			break;
		case 8:
			mes_name = "Agosto";
			break;
		case 9:
			mes_name = "Septiembre";
			break;
		case 10:
			mes_name = "Octubre";
			break;
		case 11:
			mes_name = "Noviembre";
			break;
		case 12:
			mes_name = "Diciembre";
			break;
		default:
			mes_name = "No corresponde con ningún mes";
			break;
		}
		System.out.println(mes_name);

		int mesNum;
		String mesText = "Marzo";

		switch (mesText) {
		case "Enero":
			mesNum = 1;
			break;
		case "Febrero":
			mesNum = 2;
			break;
		default:
			mesNum = 0;
		}
		System.out.printf("%s: el mes de numero %d", mesText, mesNum);

	}

}
