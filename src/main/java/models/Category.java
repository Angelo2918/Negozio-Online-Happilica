package models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents a category for organizing items.
 */
@Entity
@Table(name = "food_category")
public class Category extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "drink_category")
    private Category parent;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
    private Set<Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        if (products == null) {
            products = new HashSet<>();
        }
        products.add(product);
    }

    public void addDrinkCategory(Category category) {
        if (drinkCategories == null) {
            drinkCategories = new HashSet<>();
        }
        drinkCategories.add(category);
    }

    public void removeProduct(Product product) {
        if (products != null) {
            products.remove(product);
        }
    }

    public void removeDrinkCategory(Category category) {
        if (drinkCategories != null) {
            drinkCategories.remove(category);
        }
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Category category = (Category) obj;
        return Objects.equals(getId(), category.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public Set<Category> getDrinkCategories() {
        return drinkCategories;
    }

    public void addDrinkCategory(Category category) {
        if (drinkCategories == null) {
            drinkCategories = new HashSet<>();
        }
        drinkCategories.add(category);
    }

    public void removeDrinkCategory(Category category) {
        if (drinkCategories != null) {
            drinkCategories.remove(category);
        }
    }

    public void addProduct(Product product) {
        if (products == null) {
            products = new HashSet<>();
        }
        products.add(product);
    }

    public void removeProduct(Product product) {
        if (products != null) {
            products.remove(product);
        }
    }


}