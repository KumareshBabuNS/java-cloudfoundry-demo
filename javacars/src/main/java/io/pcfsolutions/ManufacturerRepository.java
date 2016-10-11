package io.pcfsolutions;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by benwilcock on 11/10/2016.
 */
@RepositoryRestResource(collectionResourceRel = "manufacturers", path = "manufacturers")
public interface ManufacturerRepository extends PagingAndSortingRepository<ManufacturerEntity, Long> {

    public List<ManufacturerEntity> findByName(@Param("name") String name);
}
