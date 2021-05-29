package atividade06;

public class Main {
	
	public static void main(String[] args) {

		Notbook notbook = new Notbook ("Samsung");
	
		System.out.println(notbook.getTipoAparelho());
		notbook.carregar();
		System.out.println(notbook.toString());
		System.out.println("Bateria: mAh" + notbook.getMAH());
		System.out.println(notbook.getModeloProcessador());
		System.out.println("Gigahertz: " + notbook.getPotencia());
		System.out.println("Tela: " + notbook.getTipoTela());
	
}

}
