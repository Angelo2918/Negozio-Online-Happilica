package services;

import DataTransferObject.ProductsDto;
import enums.CategoryEnum;
import models.Products;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

/**
 * Interface representing a ProductsService, providing operations for managing products in the system.
 */
@Service
public interface ProductsService {


    public Products addProducts(@Valid Products products);

    public List<Products> getAllProducts();

    public Products getProductsFromCatalogById(Integer id);

    public List<ProductsDto> getCategoryWiseProducts(CategoryEnum deodorant);

    public String deleteProductFromCatalog(Integer id);

    public Products updateProductIncatalog(Products product);

}