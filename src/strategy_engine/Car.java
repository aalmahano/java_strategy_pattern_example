package strategy_engine;

import engine_interface.Engine;
import engine_types.*;

public class Car {
	private Engine engine;

	private Car(Engine engine)
	{
		setEngine(engine);
	}
	
	private void setEngine(Engine engine)
	{
		this.engine = engine;
	}
	
	//** Constructors - Begin **//
	
	public static Car NewDieselCar()
	{
		return new Car(new DieselEngine());
	}
	
	public static Car NewPetrolCar()
	{
		return new Car(new PetrolEngine());
	}
	
	//** Constructors - End **//	
	
	
	//** Behavior - Begin **//
	
	public void StartEngine()
	{
		engine.start();
	}
	
	public void StopEngine()
	{
		engine.start();
	}
	
	public void Run()
	{
		engine.running();
	}	
	
	//** Behavior - End **//
	
}
