package com.project.pms.service;

import java.util.List;
import java.util.UUID;

public interface SearchService {
    List getAll();
    Object searchByUUID(UUID uuid);
    Object searchById(Integer id);
}
