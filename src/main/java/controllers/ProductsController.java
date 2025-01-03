package controllers;

import DataTransferObject.ProductsDto;
import enums.CategoryEnum;
import models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.ProductsService;

import javax.validation.Valid;
import java.util.List;

/**
 * RestController for managing products in the system.
 */
@RestController
public class ProductsController {

    @Autowired
    private ProductsService productService;

    @PostMapping("/add-new-products")
    public Products saveProductHandler(@Valid @RequestBody Products product) {
        return productService.addProducts(product);

    }


    @GetMapping("/all-products")
    public List<Products> getAllProducts(){

        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Products> getProductFromCatalogByIdHandler(@PathVariable("id") Integer id) {

        Products prod =  productService.getProductsFromCatalogById(id);

        return new ResponseEntity<Products>(prod, HttpStatus.FOUND);

    }

    /**
     * Retrieves a list of ProductsDto objects based on the specified CategoryEnum.
     *
     * @param deodorant The CategoryEnum value indicating the category for which products are to be retrieved.
     * @return A list of ProductsDto objects associated with the specified category.
     */
    @GetMapping("/products/{food}")
    public List<ProductsDto> getCategoryWiseProducts(@PathVariable("deodorant") CategoryEnum deodorant) {

        return productService.getCategoryWiseProducts(deodorant);

    }


    @DeleteMapping("/delete-product/{id}")
    public ResponseEntity<String> deleteProductFromCatalogHandler(@PathVariable("id") Integer id) {

        String res = productService.deleteProductFromCatalog(id);
        return new ResponseEntity<String>(res, HttpStatus.OK);
    }

    @PutMapping("/update-products")
    public ResponseEntity<Products> updateProductInCatalogHandler(@Valid @RequestBody Products prod) {

        Products prod1 = productService.updateProductInCatalog(prod);

        return new ResponseEntity<Products>(prod1, HttpStatus.OK);


    }



















}
