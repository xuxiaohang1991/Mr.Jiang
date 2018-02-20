package com.jyn.dao;

import com.jyn.bean.Details;

public interface DetailsDAO {
public void add(Details details); 
public Details queryById(Integer id);
public void remove(Integer id);
public void modify(Details details);
}
