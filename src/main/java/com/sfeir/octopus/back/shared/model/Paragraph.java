package com.sfeir.octopus.back.shared.model;

import com.google.common.base.Objects;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.IgnoreSave;
import com.googlecode.objectify.condition.IfNull;

public class Paragraph implements IsSerializable, HasId {
	
	@Id
	private Long id;
	
	@IgnoreSave(IfNull.class)
    private String imgPath = null;
	
    private String text = "";
    private ParagraphType type = ParagraphType.TEXT_ONE_COLUMN;
	

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public ParagraphType getType() {
		return type;
	}
	public void setType(ParagraphType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Paragraph) {
			final Paragraph that = (Paragraph) obj;
			return Objects.equal(id, that.id);
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(Paragraph.class) //
				.add("id", id) //
				.add("text", text) //
				.add("type", type) //
				.add("imgPath", imgPath) //
				.toString();
	}

}
