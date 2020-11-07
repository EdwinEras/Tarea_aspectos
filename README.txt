Tarea_aspectos
Grupo AOP 9: 
	Aron Villao
	Edwin Eras

Se tiene el aspecto Aspecto.aj donde se captura el argumento del objeto EventHandler ubicado en la clase Colores. 
Cuando se registre la ejecución de este método se llama al método update implementado en ConsoleObjerver y cumple 
la función de informar del color en el Background

Se tiene la interfaz ObserverInterface que define el método update para que clases que deriven de esta lo implementen.

Se tiene la clase ConsoleObserver que implenta de ObserverInterface, aquí se define el método update informando 
sobre el cambio de color.

Se tiene la clase Colores donde esta la interfaz gráfica en javafx y el método main, aquí se crea la interfaz grafica 
y los tres botones que se usan para controlar el color del background.

Adicional se cre una clase ButtonSubject que hereda de Button ya que se dieron problemas al agregar la lista de 
observers a Button mediante el aspecto.

Enlace al repositorio: https://github.com/EdwinEras/Tarea_aspectos
