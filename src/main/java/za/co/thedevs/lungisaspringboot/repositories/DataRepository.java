package za.co.thedevs.lungisaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.thedevs.lungisaspringboot.models.Data;

public interface DataRepository extends JpaRepository<Data, Integer> {


}