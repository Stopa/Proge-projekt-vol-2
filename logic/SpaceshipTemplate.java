package logic;

public class SpaceshipTemplate {
	// instance variables
	
	// constructors
	public SpaceshipTemplate() {
		
	}
	
	// instance methods
	public Spaceship build() {
		return new Spaceship(this);
	}
}
