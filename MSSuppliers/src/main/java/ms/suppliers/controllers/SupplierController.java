package ms.suppliers.controllers;

import ms.suppliers.domain.request.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ms.suppliers.services.SupplierService;

@RestController
@RequestMapping("supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @GetMapping("{id}")
    public ResponseEntity<SupplierViewModel> getSupplierById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<>(this.supplierService.getSupplier(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("pagination")
    public ResponseEntity<SupplierPaginationViewModel> getSupplierByPagination(@RequestParam Integer page, @RequestParam Integer rows) {
        try {
            return new ResponseEntity<>(this.supplierService.getSupplierListByPagination(page, rows), HttpStatus.OK);
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> createSupplier(@RequestBody CreateSupplierCommand createSupplierCommand) {
        try {
            this.supplierService.createSupplier(createSupplierCommand);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<?> updateSupplier(@RequestBody UpdateSupplierCommand updateSupplierCommand) {
        try {
            this.supplierService.updateSupplier(updateSupplierCommand);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }

    @PutMapping("update-state")
    public ResponseEntity<?> updateSupplierState(@RequestBody UpdateSupplierStateCommand updateSupplierStateCommand) {
        try {
            this.supplierService.updateSupplierState(updateSupplierStateCommand);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }
}
