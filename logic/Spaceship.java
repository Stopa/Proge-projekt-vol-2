package logic;

public class Spaceship extends SpaceObject {
	// instance variables
	private Faction ownedBy;
	private SpaceshipType shipType;
	private int speedUpgradeLevel;
	private int healthUpgradeLevel;
	private int fireRatepgradeLevel;
	private int firePowerUpgradeLevel;
	// ship.grantUpdate(new ShipUpdate(3,1,2,3)) vms?
	private ShipUpgrade[] upgrades;
	
	public enum SpaceshipType { // alternatiivina teha eraldi klassina?
		// dummy values
		ENGINEER(2,2,2,2,4),
		GUNSHIP(3,2,3,3,1),
		TRANSPORT(1,4,1,3,2),
		SCOUT(4,1,3,2,1),
		MOTHERSHIP(1,5,3,3,3);
		
		private int baseSpeed;
		private int baseHP;
		private int baseFireRate;
		private int baseFirePower;
		private int buildSpeed;
		private int baseColonizationSpeed;
		
		private SpaceshipType(int speed, int hp, int fireRate, int firePower, int colonizationSpeed) {
			this.baseSpeed = speed;
			this.baseHP = hp;
			this.baseFireRate = fireRate;
			this.baseFirePower = firePower;
			this.baseColonizationSpeed = colonizationSpeed;
		}
	}
}
