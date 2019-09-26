package com.comtrade.konstante;

public enum Konstante {
	IP_ADRESA("127.0.0.1"), PORT(9000);
	private String ip_adresa;
	private int port;

	private Konstante(String ip_adresa) {
		this.ip_adresa = ip_adresa;
	}

	private Konstante(int port) {
		this.port = port;
	}

	public String getIp_adresa() {
		return ip_adresa;
	}

	public int getPort() {
		return port;
	}

}
