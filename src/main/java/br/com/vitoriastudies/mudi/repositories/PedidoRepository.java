package br.com.vitoriastudies.mudi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.vitoriastudies.mudi.model.Pedido;
import br.com.vitoriastudies.mudi.model.enums.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
		
		List<Pedido> findByStatusPedido(StatusPedido status);
}
