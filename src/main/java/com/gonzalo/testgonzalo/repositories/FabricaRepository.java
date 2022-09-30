package com.gonzalo.testgonzalo.repositories;

import com.gonzalo.testgonzalo.models.Fabrica;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FabricaRepository  extends MongoRepository<Fabrica, String> {
}
