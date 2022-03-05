package com.anotaciones.anotaciones.config;


import org.springframework.beans.factory.annotation.Value;

public class FileSystemConfing {
 @Value("${file.maxStorage}")
 private Integer maxStorage;
 @Value("${file.minStorage}")
 private Integer minStorage;

 public Integer getMaxStorage() {
  return maxStorage;
 }

 public void setMaxStorage(Integer maxStorage) {
  this.maxStorage = maxStorage;
 }

 public Integer getMinStorage() {
  return minStorage;
 }

 public void setMinStorage(Integer minStorage) {
  this.minStorage = minStorage;
 }
}
