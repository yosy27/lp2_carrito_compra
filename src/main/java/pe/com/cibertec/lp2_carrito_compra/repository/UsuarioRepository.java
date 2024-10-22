package pe.com.cibertec.lp2_carrito_compra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.cibertec.lp2_carrito_compra.model.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String>{

}
