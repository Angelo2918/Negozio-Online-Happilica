package com.Angelin.services;

import com.Angelin.DataTransferObject.ProductsDto;
import com.Angelin.enums.CategoryEnum;
import jakarta.validation.Valid;
import com.Angelin.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Interface representing a ProductsService, providing operations for managing products in the system.
 */

public interface ProductsService {


    public Products addProducts(@Valid Products products);

    public List<Products> getAllProducts();

    public Products getProductsFromCatalogById(Integer id);

    public List<ProductsDto> getCategoryWiseProducts(CategoryEnum deodorant);

    public String deleteProductFromCatalog(Integer id);

    public Products updateProductInCatalog(Products product);

}