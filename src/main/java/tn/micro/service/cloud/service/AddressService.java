package tn.micro.service.cloud.service;

import java.util.List;

import tn.micro.service.cloud.entity.Address;
import tn.micro.service.cloud.request.CreateAddressRequest;
import tn.micro.service.cloud.response.AddressResponse;


public class AddressService {
	@Override
	public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {

		Address address = new Address();
		address.setStreet(CreateAddressRequest.getStreet());
		address.setCity(createStudentRequest.getCity());

		address = addressRepository.save(address);

		Student student = new Student();
		student.setFirstName(createStudentRequest.getFirstName());
		student.setLastName(createStudentRequest.getLastName());
		student.setEmail(createStudentRequest.getEmail());

		student.setAddress(address);
		student = studentRepository.save(student);

		return new StudentResponse(student);
	}

	@Override
	public StudentResponse getById(long id) {
		return new StudentResponse(studentRepository.findById(id).get());
	}

	@Override
	public List<StudentResponse> getAllStudents() {
		return StudentResponse.toArrayList(studentRepository.findAll());
	}
}
