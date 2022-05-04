package am.basic.repository;

import am.basic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User getById(int id);

    int countByEmail(String email);

/*
    @Modifying
    @Transactional
    @Query(value = "update user u set u.name = ?1, u.surname = ?2 , u.email = ?3, u.age = ?4, u.balance = ?5, u.password = ?6 where u.id = ?7",nativeQuery=true)
    void updateUser(String name, String surname, String email,int age,int balance,String password,int id);*/


 

}
