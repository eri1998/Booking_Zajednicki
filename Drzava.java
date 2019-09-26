package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Drzava implements OpstiDomen, Serializable {
	private int id_drzava;
	private String naziv;
	private String nazivGrada;

	public String getNazivGrada() {
		return nazivGrada;
	}

	public void setNazivGrada(String nazivGrada) {
		this.nazivGrada = nazivGrada;
	}

	public int getId_drzava() {
		return id_drzava;
	}

	public void setId_drzava(int id_drzava) {
		this.id_drzava = id_drzava;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return "drzava";
	}

	@Override
	public String nazivKolona() {
		// TODO Auto-generated method stub
		return " (nazivDrzave)";
	}

	@Override
	public String vrednostKolona() {
		// TODO Auto-generated method stub
		return "values (?)";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, naziv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return "id_drzava";
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen> list = new ArrayList<>();
		try {
			if (resultSet.next()) {
				Drzava drzava = new Drzava();
				naziv = resultSet.getString("nazivDrzave");
				drzava.setNaziv(naziv);
				id_drzava = resultSet.getInt("id_drzava");
				drzava.setId_drzava(id_drzava);
				list.add(drzava);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
