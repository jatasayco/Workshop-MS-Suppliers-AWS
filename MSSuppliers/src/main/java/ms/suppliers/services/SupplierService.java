package ms.suppliers.services;

import ms.suppliers.domain.request.*;

public interface SupplierService {
    void updateSupplier(UpdateSupplierCommand updateSupplierCommand);
    void updateSupplierState(UpdateSupplierStateCommand updateSupplierStateCommand);
    void createSupplier(CreateSupplierCommand createSupplierCommand);
    SupplierViewModel getSupplier(Integer id);
    SupplierPaginationViewModel getSupplierListByPagination(Integer page, Integer rows);
}
