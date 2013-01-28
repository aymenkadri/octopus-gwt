package com.sfeir.octopus.back.shared.model;

import com.google.common.base.Objects;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.annotation.Id;

public class User implements IsSerializable, HasId {

	@Id
	private Long id;
	private String name = "";
	
	
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			final User that = (User) obj;
			return Objects.equal(id, that.id);
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(User.class) //
				.add("id", id) //
				.add("name", name) //
				.toString();
	}

}
