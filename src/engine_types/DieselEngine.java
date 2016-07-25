package engine_types;

import engine_interface.Engine;

public class DieselEngine implements Engine{
	
	public DieselEngine()
	{
		
	}

	@Override
	public void start() {
		System.out.println("Diesel Engine started!");
	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine stopped!");
	}

	@Override
	public void running() {
		System.out.println("4 strokes: intake, compression, combustion, exhaust");
	}

}
