package org.lightjune.closewiki.prototype.helloworld.dataservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    private HelloDAO helloDAO;

    @Autowired
    public HelloRepository(HelloDAO helloDAO) {
        this.helloDAO = helloDAO;
    }

    public HelloVO getHello() {
        return helloDAO.getHello();
    }

}
