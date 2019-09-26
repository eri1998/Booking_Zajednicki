package com.comtrade.domen;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public interface OpstiDomen {
	public String nazivTabele();

	public String nazivKolona();

	public String vrednostKolona();

	public String getID();

	public List<OpstiDomen> vratiSelect(ResultSet resultSet);

	public PreparedStatement vrati(PreparedStatement preparedStatement);

}
