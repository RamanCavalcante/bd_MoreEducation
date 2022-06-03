package com.example.project.rest.api.repository;

import com.example.project.rest.api.model.Questao;

// import java.util.List;

// import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryQuestao extends CrudRepository <Questao, Integer>{
    Questao findById(int id);

    // @Query(value = "  ", nativeQuery = true)
    // List selectalternativasQuestao(int codQuestao);
  

}
