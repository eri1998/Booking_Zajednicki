package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.comtrade.domen.photos.Photo;

public class SobaSlike implements OpstiDomen, Serializable {
	private int idSlike;
	private String urlSlike;
	private int idSobe;

	public int getIdSlike() {
		return idSlike;
	}

	public void setIdSlike(int idSlike) {
		this.idSlike = idSlike;
	}

	public String getUrlSlike() {
		return urlSlike;
	}

	public void setUrlSlike(String urlSlike) {
		this.urlSlike = urlSlike;
	}

	public int getIdSobe() {
		return idSobe;
	}

	public void setIdSobe(int idSobe) {
		this.idSobe = idSobe;
	}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return "slikesoba";
	}

	@Override
	public String nazivKolona() {
		// TODO Auto-generated method stub
		return "(slikaUrl,idSobe)";
	}

	@Override
	public String vrednostKolona() {
		// TODO Auto-generated method stub
		return " values (?,?)";
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return "idSlikeSobe";
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen> list = new ArrayList<>();
		try {
			if (resultSet.next()) {
				SobaSlike sobaSlike = new SobaSlike();

				urlSlike = resultSet.getString("slikaUrl");
				idSobe = resultSet.getInt("idSobe");

				sobaSlike.setUrlSlike(urlSlike);
				sobaSlike.setIdSobe(idSobe);

				list.add(sobaSlike);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {

			// preparedStatement.setString(1, imeSlike);
			preparedStatement.setString(1, urlSlike);
			preparedStatement.setInt(2, idSobe);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;

	}

}
