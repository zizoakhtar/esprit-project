package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FileInfo {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
  private String url;

  public FileInfo(String name, String url) {
    this.name = name;
    this.url = url;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
