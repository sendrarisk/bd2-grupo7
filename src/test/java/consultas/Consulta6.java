package consultas;

import java.net.UnknownHostException;
import java.time.LocalDate;

import dao.VentaDao;

public class Consulta6 {
    public static void main(String[] args) throws UnknownHostException{
        LocalDate fechaDesde = LocalDate.of(2020, 3, 21);
        LocalDate fechaHasta = LocalDate.of(2020, 5, 1);
        VentaDao.getInstance();
        String respuesta = VentaDao.rankingProductoPorCantidad(fechaDesde, fechaHasta);
        System.out.println(respuesta);
    }
}