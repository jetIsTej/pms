package com.project.pms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;

public class ProjectApplicationDAO {
    @Autowired
    private CassandraOperations cassandraOperations;


}
