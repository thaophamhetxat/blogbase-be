package thao.com.bewebblog.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thao.com.bewebblog.model.Role;
import thao.com.bewebblog.model.RoleName;
import thao.com.bewebblog.repository.IRoleRepository;
import thao.com.bewebblog.service.impl.IRoleService;

import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleRepository roleRepository;
    @Override
    public Optional<Role> findByName(RoleName name) {
        return roleRepository.findByName(name);
    }
}
