package com.training.core.dao;

import com.training.core.model.CustomerReviewModel;

public interface ReviewDao 
{
	void saveReview(CustomerReviewModel reviewModel);
}
