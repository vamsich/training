package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.CustomerExperienceDao;
import com.training.core.model.ExperienceModel;
import com.training.core.service.CustomerExperienceService;

@Service("customerExperienceService")
public class CustomerExperienceServiceImpl implements CustomerExperienceService
{
	@Resource(name="customerExperienceDao")
	private CustomerExperienceDao customerExperienceDao;
	
	@Override
	@Transactional
	public void saveExperience(ExperienceModel experience) 
	{
		customerExperienceDao.saveExperience(experience);
	}
}
