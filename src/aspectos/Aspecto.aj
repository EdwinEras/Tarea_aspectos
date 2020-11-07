package aspectos;

import java.util.Iterator;
import java.util.Vector;
import clases.ButtonSubject;
import clases.ConsoleObserver;
import clases.ObserverInterface;
import javafx.event.ActionEvent;

public aspect Aspecto{
	
	public Vector ButtonSubject.observers = new Vector();
	
	public void ButtonSubject.addObserver(ObserverInterface obs) {
		this.observers.add(obs);
		
	}
	
    public void ButtonSubject.removeObserver(ObserverInterface obs) {
        this.observers.remove(obs);
    }
    
    //Captura el argumento(ActionEvent) del metodo handle del EventHandler del bot�n que se presion�.
    //Se obtiene el 'source' del evento para obtener el bot�n que se presion�.
    //Una vez obtenido el bot�n, se recorre su lista de observadores y por cada uno se llama al metodo update().
    pointcut changes(ActionEvent ace):args(ace) && execution(void main.Colores.*.handle(ActionEvent));
    
    after(ActionEvent ace): changes(ace){
    	
    	ButtonSubject btn = (ButtonSubject) ace.getSource();
    	
    	Iterator<ObserverInterface> it = btn.observers.iterator();
    	
    	while(it.hasNext()) {//Iteraci�n de los observadores pertenecientes al bot�n
    		ObserverInterface obs = it.next();
    		obs.update(btn.getColor());
    		
    	}
    	
    }
    
    //Cada que se inicializa un bot�n lo captura y le agrega un nuevo observadora la lista 'observers'
    //El observador que se agrega es un 'ConsoleObserver', que se encarga de imprimir un mensaje en la consola
    //En este caso solo se tiene un observador, pero se podrian agregar mas.
    pointcut objectConstruction(ButtonSubject btn) : 
        initialization(ButtonSubject+.new(..)) && this(btn);
    
    after(ButtonSubject btn): objectConstruction(btn){
    	btn.addObserver(new ConsoleObserver());
    }
    
}