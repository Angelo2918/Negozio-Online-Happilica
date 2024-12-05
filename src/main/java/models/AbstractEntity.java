package models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.Objects;

/**
 * An abstract class serving as the base entity for database entities.
 */
@MappedSuperclass
public class AbstractEntity {
    @Id
    @GeneratedValue
    private long id;

    public long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        return Objects.equals(this.id, AbstractEntity.class.cast(obj).id);
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }
}
