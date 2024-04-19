package com.avijit.inventorymanagementbackend.Service;


import com.avijit.inventorymanagementbackend.DTO.ProductRequestDTO;
import com.avijit.inventorymanagementbackend.DTO.ProductResponseDto;
import com.avijit.inventorymanagementbackend.Model.ProductCategory;
import com.avijit.inventorymanagementbackend.Model.Products;
import com.avijit.inventorymanagementbackend.Repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements ProductServiceInterface{
    private final ProductRepo productRepo;


    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    //    get all products
    @Override
    public List<ProductResponseDto> getAllProducts() {
          List<ProductResponseDto> productResponseDtos = new ArrayList<>();
          List<Products> products = productRepo.findAll();

            for (Products product : products) {
                ProductResponseDto productResponseDto = new ProductResponseDto();
                productResponseDto.setProductName(product.getProductName());
                productResponseDto.setPrice(product.getPrice());
                productResponseDto.setDescription(product.getDescription());
                productResponseDto.setImage(product.getImage());
                productResponseDto.setBarCode(product.getBarCode());
                productResponseDto.setQuantity(product.getQuantity());
                productResponseDto.setProductCategory(product.getProductCategory().getCategoryName());
                productResponseDtos.add(productResponseDto);
            }
    return productResponseDtos;
}
//    add product
    @Override
    public void addProduct(ProductRequestDTO productRequestDTO) {
        Products products = new Products();
        products.setProductName(productRequestDTO.getProductName());
        products.setPrice(productRequestDTO.getPrice());
        products.setDescription(productRequestDTO.getDescription());
        products.setImage(productRequestDTO.getImage());
        products.setBarCode(productRequestDTO.getBarCode());
        products.setQuantity(productRequestDTO.getQuantity());
        ProductCategory productCategory = new ProductCategory();
        productCategory.setId(productRequestDTO.getProductCategory());
        products.setProductCategory(productCategory);
        productRepo.save(products);
    }

}
