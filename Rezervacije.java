package com.comtrade.domen.rezervacije;

import java.io.Serializable;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.comtrade.domen.OpstiDomen;

public class Rezervacije implements OpstiDomen, Serializable {
	private int idRezervacije;
	private String datum_dolaska;
	private String datum_odlaska;
	private int broj_nocenja;
	private int id_soba;
	private int id_user;
	private double cene;

	public int getIdRezervacije() {
		return idRezervacije;
	}

	public void setIdRezervacije(int idRezervacije) {
		this.idRezervacije = idRezervacije;
	}

	public String getDatum_dolaska() {
		return datum_dolaska;
	}

	public void setDatum_dolaska(String datum_dolaska) {
		this.datum_dolaska = datum_dolaska;
	}

	public String getDatum_odlaska() {
		return datum_odlaska;
	}

	public void setDatum_odlaska(String datum_odlaska) {
		this.datum_odlaska = datum_odlaska;
	}

	public int getBroj_nocenja() {
		return broj_nocenja;
	}

	public void setBroj_nocenja(int broj_nocenja) {
		this.broj_nocenja = broj_nocenja;
	}

	public int getId_soba() {
		return id_soba;
	}

	public void setId_soba(int id_soba) {
		this.id_soba = id_soba;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public double getCene() {
		return cene;
	}

	public void setCene(double cene) {
		this.cene = cene;
	}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return "rezervacija";
	}

	@Override
	public String nazivKolona() {
		// TODO Auto-generated method stub
		return "(datum_dolaska, datum_odlaska, id_soba, id_user, broj_nocenja, cena)";
	}

	@Override
	public String vrednostKolona() {
		// TODO Auto-generated method stub
		return " values (?, ?, ?, ?, ?, ?) ";
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return "id_rezervacija";
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen> listaRezervacija = new ArrayList<>();
		try {
			while (resultSet.next()) {
				String datumDolaska = String.valueOf(resultSet.getDate("datum_dolaska"));
				String datumOdlaska = String.valueOf(resultSet.getDate("datum_odlaska"));
				int id_soba = resultSet.getInt("id_soba");
				int id_user = resultSet.getInt("id_user");
				int id_rezervacija = resultSet.getInt("id_rezervacija");
				int broj_nocenja = resultSet.getInt("broj_nocenja");
				double cena = resultSet.getDouble("cena");
				Rezervacije rezervacije = new Rezervacije();
				rezervacije.setDatum_dolaska(datumDolaska);
				rezervacije.setDatum_odlaska(datumOdlaska);
				rezervacije.setIdRezervacije(idRezervacije);
				rezervacije.setId_soba(id_soba);
				rezervacije.setId_user(id_user);
				rezervacije.setBroj_nocenja(broj_nocenja);
				rezervacije.setCene(cena);
				listaRezervacija.add(rezervacije);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaRezervacija;

	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setDate(1, Date.valueOf(datum_dolaska));
			preparedStatement.setDate(2, Date.valueOf(datum_odlaska));
			preparedStatement.setInt(3, id_soba);
			preparedStatement.setInt(4, id_user);
			preparedStatement.setInt(5, broj_nocenja);
			preparedStatement.setDouble(6, cene);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preparedStatement;

	}

	public String datumOdlaska() {
		return "datum_odlaska";
	}

}
