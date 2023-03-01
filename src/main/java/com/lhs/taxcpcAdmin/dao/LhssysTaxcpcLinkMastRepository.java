package com.lhs.taxcpcAdmin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lhs.taxcpcAdmin.model.entity.LhssysTaxcpcLinkMast;

@Repository
public interface LhssysTaxcpcLinkMastRepository extends JpaRepository<LhssysTaxcpcLinkMast, String>{

	@Query("from LhssysTaxcpcLinkMast t where t.link_type = :link_type order by t.lastupdate desc")
	List<LhssysTaxcpcLinkMast> getDetailByLinkType(String link_type);

}
