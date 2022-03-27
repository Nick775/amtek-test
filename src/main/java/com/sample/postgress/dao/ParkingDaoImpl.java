package com.sample.postgress.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sample.postgress.entity.Parking;

@Repository
public class ParkingDaoImpl implements ParkingDao{

    public ParkingDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public void executeParking(Parking emp) {
        final String sql = "update parking set " +
                "parking_number=:parking_number, " +
                "client_free=:client_free, " +
                "client_busy=:client_busy " +
                "vip_busy=:vip_busy" +
                "reserved_free=:reserved_free" +
                "reserved_busy=:reserved_busy" +
                "where active=true";


        Map<String,Object> map=new HashMap<String,Object>();
        map.put("parkingId", emp.getParkingId());
        map.put("parkingNumber", emp.getParkingNumber());
        map.put("clientFree", emp.getClient_free());
        map.put("clientBusy", emp.getClient_busy());
        map.put("vipBusy", emp.getVip_busy());
        map.put("reservedFree", emp.getReserved_free());
        map.put("reservedBusy", emp.getReserved_busy());
        map.put("active", emp.getActive());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }

}