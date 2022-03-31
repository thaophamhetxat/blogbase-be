package thao.com.bewebblog.service.impl;


import thao.com.bewebblog.model.See;

import java.util.Optional;

public interface ISeeService {
    Iterable<See> findAllSee();

    Optional<See> findByIdSee(int idSee);

    See saveSee(See see);

    void removeSee(int idSee);
}
