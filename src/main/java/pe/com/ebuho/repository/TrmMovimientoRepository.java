package pe.com.ebuho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.ebuho.model.TrmMovimiento;
import pe.com.ebuho.model.TrmMovimientoPK;


/**
 * Created by John on 11/3/2015.
 */
public interface TrmMovimientoRepository extends JpaRepository<TrmMovimiento,TrmMovimientoPK> {
}
