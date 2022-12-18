package com.dbdemo.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import com.dbdemo.demo.dto.ContactDTO;
import com.dbdemo.demo.entity.Contact;

@Component
@Mapper(componentModel = "spring", uses = { StudentMapper.class }, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ContactMapper extends EntityMapper<ContactDTO, Contact> {

	@Mapping(source = "student.id",target = "studentId")
	@Mapping(source = "student.name",target = "studentName")
	ContactDTO toDto(Contact contact);

	@Mapping(source = "studentId",target = "student")	
	Contact toEntity(ContactDTO contactDTO);

	default Contact fromId(Long id) {
		if (id == null)
			return null;
		Contact contact = new Contact();
		contact.setId(id);
		return contact;
	}
}
