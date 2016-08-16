package com.epam.botor.domain;

import static com.epam.botor.domain.Gender.MALE;

import java.beans.ConstructorProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jedi extends Person implements ForceUser {

	private static final Logger LOGGER = LoggerFactory.getLogger(Jedi.class);
	
	
	private LightSabre lightSabre;
	
	private Jedi padavan; 
	
	@ConstructorProperties( { "name", "gender"})
    public Jedi(String name, Gender gender) {
		super(name, gender);
	}

	@Override
    public ForceSide getAlliance() {
        return ForceSide.LIGHT;
    }

	public String fight() {
		return lightSabre == null ? "no sabre" : lightSabre.hit();
	}

	public static Jedi createJediMaster(String name, Jedi padavan) {
		Jedi jedi = new Jedi(name, MALE);
		jedi.padavan = padavan;
		return jedi;
	}

	public LightSabre createUglyLightSabre(int damage) {
		return new LightSabre("Ugly light sabre of " + getName(), damage);
	}
	
	
	public void defaultInit() {
		LOGGER.debug("Hello Jedi " + getName());
	}
	
	@Override
	public String toString() {
		return "Jedi [lightSabre=" + lightSabre + ", padavan=" + padavan + ", toString()=" + super.toString() + "]";
	}

	public void setLightSabre(LightSabre lightSabre) {
		this.lightSabre = lightSabre;
	}
	
	
	
}
