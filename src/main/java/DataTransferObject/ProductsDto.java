package DataTransferObject;
import javax.validation.constraints.NotNull;



public class ProductsDto {

    @NotNull(message = "Please input a valid product name")
    private String productName;
    @NotNull(message = "Please input a valid product price!")
    private Double price;

    public ProductsDto() {
    }

    public ProductsDto(String productName, Double price) {
        super();
        this.productName = productName;
        this.price = price;
    }
}
