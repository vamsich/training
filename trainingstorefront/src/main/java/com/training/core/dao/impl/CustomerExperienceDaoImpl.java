package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.CustomerExperienceDao;
import com.training.core.model.ExperienceModel;

@Repository("customerExperienceDao")
public class CustomerExperienceDaoImpl implements CustomerExperienceDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void saveExperience(ExperienceModel experience) 
	{
		sessionFactory.getCurrentSession().save(experience);
	}

}
