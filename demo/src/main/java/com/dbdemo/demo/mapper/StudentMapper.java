package com.dbdemo.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import com.dbdemo.demo.dto.StudentDTO;
import com.dbdemo.demo.entity.Student;

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper extends EntityMapper<StudentDTO, Student> {

	@Mapping(source = "id", target = "studentId")
	StudentDTO toDto(Student student);
	
	@Mapping(source = "studentId", target = "id")
	Student toEntity(StudentDTO studentDTO);
	
	default Student fromId(Long id) {
		if (id == null)
			return null;
		Student student = new Student();
		student.setId(id);
		return student;
	}
}
