package com.Angelin.controller;


import com.Angelin.DataTransferObject.ProductsDto;
import com.Angelin.enums.CategoryEnum;
import com.Angelin.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Angelin.services.ProductsService;

import javax.validation.Valid;
import java.util.List;

/**
 * Represents a controller for handling operations related to products.
 *
 * The class defines several endpoints for managing products including adding new products, retrieving all products,
 * getting product by id, getting products by category, deleting a product, and updating a product.
 * Each endpoint corresponds to a specific operation provided by the ProductsService.
 *
 * This class is annotated with @RestController and @RequestMapping indicating that it handles HTTP requests for "/products".
 *
 * Contains methods:
 * - saveProductHandler: Handles POST request to add new products to the system.
 * - getAllProducts: Handles GET request to retrieve all products.
 * - getProductFromCatalogByIdHandler: Handles GET request to retrieve a specific product by its id.
 * - getCategoryWiseProducts: Handles GET request to retrieve products based on a specific category.
 * - deleteProductFromCatalogHandler: Handles DELETE request to delete a product from the catalog.
 * - updateProductInCatalogHandler: Handles PUT request to update an existing product in the catalog.
 *
 * Dependencies:
 * - productService: An instance of ProductsService for performing operations on products.
 */
@RequestMapping("/product")
@RestController
public class ProductsController {

    @Autowired
    private ProductsService productService;

    @PostMapping("/add-new-products")
    public Products saveProductHandler(@Valid @RequestBody Products product) {
        return productService.addProducts(product);

    }


    @GetMapping("/all-products")
    public List<Products> getAllProducts() {

        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Products> getProductFromCatalogByIdHandler(@PathVariable("id") Integer id) {

        Products prod = productService.getProductsFromCatalogById(id);

        return new ResponseEntity<Products>(prod, HttpStatus.FOUND);

    }

    @GetMapping("/product/{food}")
    public List<ProductsDto> getCategoryWiseProducts(@PathVariable("bread") CategoryEnum bread) {

        return productService.getCategoryWiseProducts(bread);

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
