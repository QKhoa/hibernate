package dao;

import java.util.List;
import java.util.Optional;

public interface BaseDAO<T, ID> {

    T save(T t);
    T update(ID id,  T t);



    void delete(ID id);

    Optional<T> findById(ID id);
    List<T> findAll();

    Optional<T> getReferenceById(ID id);

}
