package com.sfeir.octopus.back.shared.model;

import java.util.Date;
import java.util.List;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.IgnoreSave;
import com.googlecode.objectify.condition.IfNull;

@Entity
public class Article implements IsSerializable, HasId {

	@Id
	private Long id;
	private String title = "";
	private ArticleStatus status = ArticleStatus.DRAFT;
	
	@IgnoreSave(IfNull.class)
	private User createdBy = null;
	
	private Date creation = new Date();
	private Date publication = new Date();
	
	private List<Paragraph> paragraphs = Lists.newArrayList();

	@Override
	public Long getId() {
		return id;
	}
	@Override
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public ArticleStatus getStatus() {
		return status;
	}
	public void setStatus(ArticleStatus status) {
		this.status = status;
	}
	
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	
	public Date getCreation() {
		return creation;
	}
	public void setCreation(Date creation) {
		this.creation = creation;
	}
	
	public Date getPublication() {
		return publication;
	}
	public void setPublication(Date publication) {
		this.publication = publication;
	}

	public List<Paragraph> getParagraphs() {
		return paragraphs;
	}
	public void setParagraphs(List<Paragraph> paragraphs) {
		this.paragraphs = paragraphs;
	}
	


	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Article) {
			final Article that = (Article) obj;
			return Objects.equal(id, that.id);
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(Article.class) //
				.add("id", id) //
				.add("title", title) //
				.add("status", status) //
				.add("createdBy", createdBy) //
				.add("creation", creation) //
				.add("publication", publication) //
				.toString();
	}
}
