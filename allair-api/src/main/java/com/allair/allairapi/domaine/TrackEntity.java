package com.allair.allairapi.domaine;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import com.allair.allairapi.enums.EntityStatus;
@MappedSuperclass
public abstract class TrackEntity {
	
	@Column(name="date_creation")
	private LocalDateTime dateCreation;
	@Column(name="date_maj")
	private LocalDateTime dateMaj;
	@Column(name="create_user")
	private String createUser;
	@Column(name="update_user")
	private String updateUser;
	@Enumerated(EnumType.STRING)
	@Column(name="flg_hse")
	private EntityStatus hse;
	
	public EntityStatus getHse() {
		return hse;
	}
	public void setHse(EntityStatus hse) {
		this.hse = hse;
	}
	public LocalDateTime getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(LocalDateTime dateCreation) {
		this.dateCreation = dateCreation;
	}
	public LocalDateTime getDateMaj() {
		return dateMaj;
	}
	public void setDateMaj(LocalDateTime dateMaj) {
		this.dateMaj = dateMaj;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
}
