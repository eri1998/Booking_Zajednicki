package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.comtrade.domen.OpstiDomen;

public class HotelPretragaVrednosti implements Serializable {

	private String hotela;
	private String drzava;
	private String grad;

	private List<Integer> brojZvezdica;

	private int naPlazi = 0;
	private int parking = 0;
	private int bazen = 0;
	private int spa = 0;
	private int bar = 0;
	private int restoran = 0;
	private int dorucak = 0;
	private int airportShuttle = 0;
	private int internet = 0;
	private int fitness = 0;

	public String getHotela() {
		return hotela;
	}

	private List<Hotel> pretragaRezultat;

	public List<Hotel> getPretragaRezultat() {
		return pretragaRezultat;
	}

	public void setPretragaRezultat(List<Hotel> pretragaRezultat) {
		this.pretragaRezultat = pretragaRezultat;
	}

	public void setHotela(String hotela) {
		this.hotela = hotela;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public List<Integer> getBrojZvezdica() {
		return brojZvezdica;
	}

	public void setBrojZvezdica(List<Integer> brojZvezdica) {
		this.brojZvezdica = brojZvezdica;
	}

	public int getNaPlazi() {
		return naPlazi;
	}

	public void setNaPlazi(int naPlazi) {
		this.naPlazi = naPlazi;
	}

	public int getParking() {
		return parking;
	}

	public void setParking(int parking) {
		this.parking = parking;
	}

	public int getBazen() {
		return bazen;
	}

	public void setBazen(int bazen) {
		this.bazen = bazen;
	}

	public int getSpa() {
		return spa;
	}

	public void setSpa(int spa) {
		this.spa = spa;
	}

	public int getBar() {
		return bar;
	}

	public void setBar(int bar) {
		this.bar = bar;
	}

	public int getRestoran() {
		return restoran;
	}

	public void setRestoran(int restoran) {
		this.restoran = restoran;
	}

	public int getDorucak() {
		return dorucak;
	}

	public void setDorucak(int dorucak) {
		this.dorucak = dorucak;
	}

	public int getAirportShuttle() {
		return airportShuttle;
	}

	public void setAirportShuttle(int airportShuttle) {
		this.airportShuttle = airportShuttle;
	}

	public int getInternet() {
		return internet;
	}

	public void setInternet(int internet) {
		this.internet = internet;
	}

	public int getFitness() {
		return fitness;
	}

	public void setFitness(int fitness) {
		this.fitness = fitness;
	}

	public HotelPretragaVrednosti() {
		brojZvezdica = new ArrayList<Integer>();
		pretragaRezultat = new ArrayList<Hotel>();
	}
}
