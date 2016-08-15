package com.epam.botor.domain;

import static com.epam.botor.domain.Gender.MALE;

public class Jedi extends Person implements ForceUser {

	private final LightSabre lightSabre;
	
	private Jedi padavan; 
	
    public Jedi(String name, Gender gender, LightSabre lightSabre) {
		super(name, gender);
		this.lightSabre = lightSabre;
	}

	@Override
    public ForceSide getAlliance() {
        return ForceSide.LIGHT;
    }

	public String fight() {
		return lightSabre.hit();
	}

	public static Jedi createJediMaster(String name, Jedi padavan) {
		Jedi jedi = new Jedi(name, MALE, null);
		jedi.padavan = padavan;
		return jedi;
	}

	public LightSabre createUglyLightSabre(int damage) {
		return new LightSabre("Ugly light sabre of " + getName(), damage);
	}
	
	@Override
	public String toString() {
		return "Jedi [lightSabre=" + lightSabre + ", padavan=" + padavan + ", toString()=" + super.toString() + "]";
	}
	
	
}