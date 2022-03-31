package thao.com.bewebblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import thao.com.bewebblog.model.See;
import thao.com.bewebblog.repository.ISeeRepository;
import thao.com.bewebblog.service.impl.ISeeService;

import java.util.Optional;

public class SeeService implements ISeeService {

    @Autowired
    ISeeRepository iSeeRepository;

    @Override
    public Iterable<See> findAllSee() {
        return iSeeRepository.findAll();
    }

    @Override
    public Optional<See> findByIdSee(int idSee) {
        return iSeeRepository.findById(idSee);
    }

    @Override
    public See saveSee(See see) {
        return iSeeRepository.save(see);
    }

    @Override
    public void removeSee(int idSee) {
        iSeeRepository.deleteById(idSee);
    }
}
