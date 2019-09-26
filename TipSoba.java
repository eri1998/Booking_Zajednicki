package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipSoba implements OpstiDomen, Serializable {
	private int id_soba;
	private String tipSoba;
	private int id_hotel;

	public int getId_soba() {
		return id_soba;
	}

	public void setId_soba(int id_soba) {
		this.id_soba = id_soba;
	}

	public String getTipSoba() {
		return tipSoba;
	}

	public void setTipSoba(String tipSoba) {
		this.tipSoba = tipSoba;
	}

	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	@Override
	public String nazivTabele() {

		return "tipSoba";
	}

	@Override
	public String nazivKolona() {

		return " (tipSobe,id_hotel) ";
	}

	@Override
	public String vrednostKolona() {

		return " values (?,?) ";
	}

	@Override
	public String getID() {

		return "idTipSoba";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, tipSoba);
			preparedStatement.setInt(2, id_hotel);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen> list = new ArrayList<>();
		try {
			if (resultSet.next()) {
				TipSoba ts = new TipSoba();
				id_soba = resultSet.getInt("idTipSoba");
				tipSoba = resultSet.getString("tipSobe");
				ts.setTipSoba(tipSoba);
				ts.setId_soba(id_soba);
				list.add(ts);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
