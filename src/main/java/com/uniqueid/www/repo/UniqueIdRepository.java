package com.uniqueid.www.repo;

import org.springframework.data.repository.CrudRepository;

import com.uniqueid.www.model.UniqueIdModel;

public interface UniqueIdRepository extends CrudRepository<UniqueIdModel, Integer>
{

}
