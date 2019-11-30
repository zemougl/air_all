package com.allair.allairapi.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DtoLocation {
	private Integer idClient;
	private Integer idEngine;
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private LocalDateTime dateDebut;
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private LocalDateTime dateFin;
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	public Integer getIdEngine() {
		return idEngine;
	}
	public void setIdEngine(Integer idEngine) {
		this.idEngine = idEngine;
	}
	public LocalDateTime getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDateTime getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}
}
