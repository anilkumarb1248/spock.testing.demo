package com.spock.demo.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spock.demo.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

	Optional<EmployeeEntity> findByEmpName(String name);

	List<EmployeeEntity> findByDepartmentId(Long departmentId);

	List<EmployeeEntity> findBySalaryBetween(double start, double end);

	List<EmployeeEntity> findByMobileNumberStartingWith(String start);

	List<EmployeeEntity> findByDateOfBirthBefore(Date date);

	List<EmployeeEntity> findBySalaryGreaterThanEqual(double salary);

	List<EmployeeEntity> findBySalaryLessThan(double salary);

//	@Query(nativeQuery = true, value="select DEPARTMENT_ID, count(*) from employee group by DEPARTMENT_ID")
	@Query("select e.departmentId, count(*) from EmployeeEntity e group by e.departmentId")
	List<Object[]> findEmployeeCountByDept();
}
