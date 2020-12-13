package ms.suppliers.repository.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import ms.suppliers.domain.request.*;
import ms.suppliers.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SupplierRepositoryImpl implements SupplierRepository {
    /*@Autowired
    JdbcTemplate jdbcTemplateSqlServer;*/

    @Override
    public void updateSupplier(UpdateSupplierCommand updateSupplierCommand) {

    }

    @Override
    public void updateSupplierState(UpdateSupplierStateCommand updateSupplierStateCommand) {

    }

    @Override
    public void createSupplier(CreateSupplierCommand createSupplierCommand) {

    }

    @Override
    public SupplierViewModel getSupplier(Integer id) {
    	
    	SupplierViewModel model = new SupplierViewModel();
    	model.setId(1);
    	model.setName("Proveedor 1");
    	model.setAdress("Av. Lima");
    	model.setCode("Codigo 001");
    	model.setActive(true);
    	model.setContact_person("Contacto 1");
    	model.setRegister_date("2020-12-13");

        return model;
    }

    @Override
    public SupplierPaginationViewModel getSupplierListByPagination(Integer page, Integer rows) {
    	List<SupplierViewModel> list = new ArrayList<SupplierViewModel>();
    	SupplierViewModel model = new SupplierViewModel();
    	model.setId(1);
    	model.setName("Proveedor 1");
    	model.setAdress("Av. Lima");
    	model.setCode("Codigo 001");
    	model.setActive(true);
    	model.setContact_person("Contacto 1");
    	model.setRegister_date("2020-12-13");
    	list.add(model);
    	
    	model = new SupplierViewModel();
    	model.setId(1);
    	model.setName("Proveedor 2");
    	model.setAdress("Av. Lima 2");
    	model.setCode("Codigo 002");
    	model.setActive(false);
    	model.setContact_person("Contacto 2");
    	model.setRegister_date("2020-12-13");
    	list.add(model);
    	
    	SupplierPaginationViewModel models = new SupplierPaginationViewModel();
    	models.setPage(1);
    	models.setRecords(2);
    	models.setTotal(2);
    	models.setRows(list);
    	
    	return models;
    }
}
