package logic;

public class PlanetTemplate {
	// instance variables
	
	//constructors
	public PlanetTemplate() {
		
	}
	
	//instance methods
	public Planet build() {
		return new Planet(this);
	}
}
