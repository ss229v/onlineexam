package net.springboot.javaguides.repo;

import net.springboot.javaguides.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
