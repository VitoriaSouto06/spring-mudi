package br.com.vitoriastudies.mudi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vitoriastudies.mudi.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {

}
