package com.vehicle.renting.mappers;

import com.vehicle.renting.models.Direccion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface DireccionMapper {

    @Insert("INSERT INTO DIRECCION (TIPO_VIA_ID, NOMBRE_CALLE, NUM, PISO, PUERTA, ESCALERA, OTRO_DATO, COD_POSTAL, MUNICIPIO, COD_PROVINCIA) VALUES " +
            "(#{tipoViaId}, #{nombreCalle}, #{numero}, #{piso, jdbcType=CHAR}, #{puerta, jdbcType=CHAR}, #{escalera, jdbcType=CHAR}, #{otroDato, jdbcType=CHAR}, #{codPostal}, #{municipio}, #{provinciaCod})")
    @Options(useGeneratedKeys = true, keyProperty = "direccionId", keyColumn="DIRECCION_ID")
    void insertDireccion(Direccion direccion);
}
