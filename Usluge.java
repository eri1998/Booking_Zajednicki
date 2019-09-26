package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Usluge implements OpstiDomen, Serializable {
	private int id_usluge;
	private String internet;
	private String parking;
	private String dorucak;
	private boolean restoran;
	private boolean spa;
	private boolean beach;
	private boolean swimmingPool;
	private boolean waterPark;
	private boolean bar;
	private boolean fitnessCenter;
	private boolean airportShuttle;
	private int id_hotel;
	private int brojZvezdica;

	public int getBrojZvezdica() {
		return brojZvezdica;
	}

	public void setBrojZvezdica(int brojZvezdica) {
		this.brojZvezdica = brojZvezdica;
	}

	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	public String getInternet() {
		return internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getDorucak() {
		return dorucak;
	}

	public void setDorucak(String dorucak) {
		this.dorucak = dorucak;
	}

	public boolean isWaterPark() {
		return waterPark;
	}

	public void setWaterPark(boolean waterPark) {
		this.waterPark = waterPark;
	}

	public boolean isBar() {
		return bar;
	}

	public void setBar(boolean bar) {
		this.bar = bar;
	}

	public boolean isFitnessCenter() {
		return fitnessCenter;
	}

	public void setFitnessCenter(boolean fitnessCenter) {
		this.fitnessCenter = fitnessCenter;
	}

	public boolean isAirportShuttle() {
		return airportShuttle;
	}

	public void setAirportShuttle(boolean airportShuttle) {
		this.airportShuttle = airportShuttle;
	}

	public boolean isSpa() {
		return spa;
	}

	public void setSpa(boolean spa) {
		this.spa = spa;
	}

	public boolean isBeach() {
		return beach;
	}

	public void setBeach(boolean beach) {
		this.beach = beach;
	}

	public boolean isSwimming() {
		return swimmingPool;
	}

	public void setSwimming(boolean swimming) {
		this.swimmingPool = swimming;
	}

	public boolean isRestoran() {
		return restoran;
	}

	public void setRestoran(boolean restoran) {
		this.restoran = restoran;
	}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return " usluge ";
	}

	@Override
	public String nazivKolona() {
		// TODO Auto-generated method stub
		return " (internet,parking,dorucak,restaurant , spa, beach, swimming_pool ,waterPark,bar,fitnessCenter,airport_shuttle,id_hotel ) ";
	}

	@Override
	public String vrednostKolona() {
		// TODO Auto-generated method stub
		return " values (?,?,?,?,?,?,?,?,?,?,?,?) ";
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, internet);
			preparedStatement.setString(2, parking);
			preparedStatement.setString(3, dorucak);
			preparedStatement.setBoolean(4, restoran);
			preparedStatement.setBoolean(5, spa);
			preparedStatement.setBoolean(6, beach);
			preparedStatement.setBoolean(7, swimmingPool);
			preparedStatement.setBoolean(8, waterPark);
			preparedStatement.setBoolean(9, bar);
			preparedStatement.setBoolean(10, fitnessCenter);
			preparedStatement.setBoolean(11, airportShuttle);
			preparedStatement.setInt(12, id_hotel);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}

}
