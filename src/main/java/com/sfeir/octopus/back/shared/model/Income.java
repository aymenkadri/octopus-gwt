package com.sfeir.octopus.back.shared.model;

import com.google.common.base.Objects;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.IgnoreSave;
import com.googlecode.objectify.condition.IfNull;

public class Income implements IsSerializable, HasId {
	
	@Id
	private Long id;
	
    private String text = "";
    private PeriodicityType type = PeriodicityType.DAILY;
    private Double value;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public PeriodicityType getType() {
		return type;
	}
	public void setType(PeriodicityType type) {
		this.type = type;
	}

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Income) {
			final Income that = (Income) obj;
			return Objects.equal(id, that.id);
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(Income.class) //
				.add("id", id) //
				.add("text", text) //
				.add("type", type) //
				.toString();
	}

}
