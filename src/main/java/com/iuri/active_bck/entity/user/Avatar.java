package com.iuri.active_bck.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "test_avatar")
public class Avatar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "avatar_id_gen")
	@SequenceGenerator(name = "avatar_id_gen", sequenceName = "test_avatar_avatar_id_seq")
	@Column(name = "avatar_id")
	private int avatarId;
	@Column(name = "user_id")
	private int userId;
	private byte[] avatar;

	@OneToOne(mappedBy = "avatar")
	private User user;

	public int getAvatarId() {
		return avatarId;
	}

	public void setAvatarId(int avatarId) {
		this.avatarId = avatarId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public byte[] getAvatar() {
		return avatar;
	}

	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}

}
