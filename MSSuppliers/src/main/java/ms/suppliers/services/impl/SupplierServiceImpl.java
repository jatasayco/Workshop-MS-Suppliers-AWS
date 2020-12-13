package ms.suppliers.services.impl;

import ms.suppliers.domain.request.*;
import ms.suppliers.repository.SupplierRepository;
import ms.suppliers.services.SupplierService;
import ms.suppliers.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
    @Autowired
    private DateUtil dateUtil;

    @Override
    public void updateSupplier(UpdateSupplierCommand updateSupplierCommand) {
        try {
            updateSupplierCommand.setRegister_date(this.dateUtil.getFormatDate(new Date()));
            this.supplierRepository.updateSupplier(updateSupplierCommand);
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }

    @Override
    public void updateSupplierState(UpdateSupplierStateCommand updateSupplierStateCommand) {
        try {
            this.supplierRepository.updateSupplierState(updateSupplierStateCommand);
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }

    @Override
    public void createSupplier(CreateSupplierCommand createSupplierCommand) {
        try {
            createSupplierCommand.setRegister_date(this.dateUtil.getFormatDate(new Date()));
            this.supplierRepository.createSupplier(createSupplierCommand);
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }

    @Override
    public SupplierViewModel getSupplier(Integer id) {
        return this.supplierRepository.getSupplier(id);
    }

    @Override
    public SupplierPaginationViewModel getSupplierListByPagination(Integer page, Integer rows) {
        try {
            return this.supplierRepository.getSupplierListByPagination(page, rows);
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }
}
