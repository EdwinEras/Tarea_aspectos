package clases;

public class ConsoleObserver implements ObserverInterface {
	
	@Override
	public void update(String color) {
		System.out.println("Se cambi� el color del fondo de la ventana a "+color);
		
	}

}
