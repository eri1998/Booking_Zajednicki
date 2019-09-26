package com.comtrade.domen.photos;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import com.comtrade.domen.OpstiDomen;

public class Photo implements OpstiDomen, Serializable {
	private int idSlike;

	private String imeSlike;
	private String urlSlike, urlSlike2, urlSlike3, urlSlike4, urlSlike5;
	private int id_hotel;
	private byte[] picture;

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getImeSlike() {
		return imeSlike;
	}

	public void setImeSlike(String imeSlike) {
		this.imeSlike = imeSlike;
	}

	public String getUrlSlike() {
		return urlSlike;
	}

	public void setUrlSlike(String urlSlike) {
		this.urlSlike = urlSlike;
	}

	public String getUrlSlike2() {
		return urlSlike2;
	}

	public void setUrlSlike2(String urlSlike2) {
		this.urlSlike2 = urlSlike2;
	}

	public String getUrlSlike3() {
		return urlSlike3;
	}

	public void setUrlSlike3(String urlSlike3) {
		this.urlSlike3 = urlSlike3;
	}

	public String getUrlSlike4() {
		return urlSlike4;
	}

	public void setUrlSlike4(String urlSlike4) {
		this.urlSlike4 = urlSlike4;
	}

	public String getUrlSlike5() {
		return urlSlike5;
	}

	public void setUrlSlike5(String urlSlike5) {
		this.urlSlike5 = urlSlike5;
	}

	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return "slike";
	}

	@Override
	public String nazivKolona() {
		// TODO Auto-generated method stub
		return "  (imeSlike,urlSlike,idHotel)";
	}

	@Override
	public String vrednostKolona() {
		// TODO Auto-generated method stub
		return " values (?,?,?)";
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return "idSlike";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {

			preparedStatement.setString(1, imeSlike);
			preparedStatement.setString(2, urlSlike);
			preparedStatement.setInt(3, id_hotel);
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
				Photo p = new Photo();
				imeSlike = resultSet.getString("imeSlike");
				urlSlike = resultSet.getString("urlSlike");
				id_hotel = resultSet.getInt("idHotel");
				p.setImeSlike(imeSlike);
				p.setUrlSlike(urlSlike);
				p.setId_hotel(id_hotel);

				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
