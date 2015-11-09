package pe.com.ebuho.repository;

import org.springframework.data.repository.CrudRepository;
import pe.com.ebuho.model.AdmMenu;

import java.math.BigDecimal;

/**
 * Created by John on 10/29/2015.
 */
public interface AdmMenuRepository extends CrudRepository<AdmMenu,BigDecimal> {
}
