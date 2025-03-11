package com.example.demo;

import com.example.demo.controller.ProductoController;
import com.example.demo.domain.Producto;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.service.ProductoService;
import com.example.demo.service.ProductoServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DemoApplicationTests {

	@Mock
	private ProductoRepository productoRepository;

	@InjectMocks
	private ProductoServiceImpl productoService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGuardarProducto() {
		// 1️⃣ Creamos un producto de prueba
		Producto producto = new Producto("Laptop", 1200.0);

		// 2️⃣ Simulamos que el repositorio devuelve ese producto al guardarlo
		when(productoRepository.save(any(Producto.class))).thenReturn(producto);

		// 3️⃣ Llamamos al método de la capa de servicio
		Producto productoGuardado = productoService.guardar(producto);

		// 4️⃣ Verificamos que se guardó correctamente
		assertNotNull(productoGuardado);
		assertEquals("Laptop", productoGuardado.getNombre());

		/*// 5️⃣ Verificamos que el método save() del repositorio fue llamado una vez
		verify(productoRepository, times(1)).save(any(Producto.class));*/
	}

	/*@Test
	public void test1(){
		Producto producto = new Producto("Iphone",1259.0);

		when(productoRepository.save(Mockito.any(Producto.class))).thenReturn(producto);

		Producto prod_stored = productoService.guardar(producto);

		//Producto prod_get = productoService.buscarPorId(prod_stored.getId());

		Assertions.assertThat(prod_stored.getId()).isEqualTo(1L);
	}

	@Test
	public void test2(){
		Producto producto = new Producto("Iphone",1259.0);

		when(productoRepository.findById(1L)).thenReturn(Optional.ofNullable(producto));

		Producto prod_get = productoService.buscarPorId(1L);

		Assertions.assertThat(prod_get.getNombre()).isEqualTo("Iphone");
	}*/

}
