package com.allair.allairapi.domaine;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_location")
public class Location extends TrackEntity {
	
	@Id
	private int id;
	@Column(name="id_client")
	private Integer idClient;
	@Column(name="id_engine")
	private Integer idEngine;
	@Column(name="date_debut")
	private LocalDateTime dateDebut;
	@Column(name="date_fin")
	private LocalDateTime dateFin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
