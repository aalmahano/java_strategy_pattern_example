package strategy_engine;

public class Program1 {

	public static void main(String[] args) 
	{
		Car skoda = Car.NewDieselCar();
		Car bmw = Car.NewPetrolCar();
		
		skoda.StartEngine();
		bmw.StartEngine();
		
		skoda.Run();
		bmw.Run();
		
		skoda.StopEngine();
		bmw.StopEngine();
	}

}
