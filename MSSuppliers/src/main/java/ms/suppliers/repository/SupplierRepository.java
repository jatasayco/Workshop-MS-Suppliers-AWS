package ms.suppliers.repository;

import ms.suppliers.domain.request.*;

public interface SupplierRepository {
    void updateSupplier(UpdateSupplierCommand updateSupplierCommand);
    void updateSupplierState(UpdateSupplierStateCommand updateSupplierStateCommand);
    void createSupplier(CreateSupplierCommand createSupplierCommand);
    SupplierViewModel getSupplier(Integer id);
    SupplierPaginationViewModel getSupplierListByPagination(Integer page, Integer rows);
}
