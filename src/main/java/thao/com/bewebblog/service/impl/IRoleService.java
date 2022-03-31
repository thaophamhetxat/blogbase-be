package thao.com.bewebblog.service.impl;



import thao.com.bewebblog.model.Role;
import thao.com.bewebblog.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName name);
}
