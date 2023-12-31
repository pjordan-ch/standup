package ch.pjordan.standup.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "teams", path = "teams")
public interface TeamRepository extends PagingAndSortingRepository<Team, Long>, CrudRepository<Team,Long> {

    List<Team> findByName(@Param("name") String name);
}
