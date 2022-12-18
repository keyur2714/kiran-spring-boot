package com.dbdemo.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbdemo.demo.dto.ContactDTO;
import com.dbdemo.demo.mapper.ContactMapper;
import com.dbdemo.demo.repository.ContactRepository;
import com.dbdemo.demo.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Autowired
	private ContactMapper contactMapper;

	@Override
	public ContactDTO save(ContactDTO type) {
		return contactMapper.toDto(contactRepository.save(contactMapper.toEntity(type)));
	}

	@Override
	public List<ContactDTO> list() {
		return contactRepository.findAll().stream().map(contactMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public ContactDTO get(Long id) {
		return contactMapper.toDto(contactRepository.findById(id).get());
	}

	@Override
	public void delete(Long id) {
		contactRepository.deleteById(id);
	}

	@Override
	public ContactDTO update(ContactDTO type) {
		return contactMapper.toDto(contactRepository.save(contactMapper.toEntity(type)));
	}

}
