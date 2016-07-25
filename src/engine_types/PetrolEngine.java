package engine_types;

import engine_interface.Engine;

public class PetrolEngine implements Engine{

	public PetrolEngine()
	{
		
	}
	
	@Override
	public void start() {
		System.out.println("Petrol Engine started!");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine stopped!");
	}

	@Override
	public void running() {
		System.out.println("4 strokes: intake, compression, explosion, exhaust");
	}

}
