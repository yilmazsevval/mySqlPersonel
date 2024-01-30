package com.tobeto.core.utilities.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelMapperManager implements ModelMapperService {
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ModelMapper forRequest() {
		this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);
		return this.modelMapper;
	}

	@Override
	public ModelMapper forResponse() {
		this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		return this.modelMapper;
	}

}
