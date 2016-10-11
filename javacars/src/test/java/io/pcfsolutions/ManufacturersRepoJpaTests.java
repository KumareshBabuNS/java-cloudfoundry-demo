package io.pcfsolutions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by benwilcock on 11/10/2016.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class ManufacturersRepoJpaTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ManufacturerRepository repo;

    @Test
    public void findByNameShouldReturnManufacturer() {
        this.entityManager.persist(new ManufacturerEntity("BMW"));
        List<ManufacturerEntity> manufacturers = repo.findByName("BMW");
        Assert.assertFalse(manufacturers.isEmpty());
        Assert.assertEquals(manufacturers.size(), 1);
        Assert.assertEquals(manufacturers.get(0).getName(), "BMW");
    }

}
