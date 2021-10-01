package dtos.Person;

import dtos.AddressDTO;
import dtos.Hobby.HobbyDTO;
import dtos.PhoneDTO;
import entities.Person;

import java.util.List;

public class PersonDTO {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private List<HobbyDTO> hobbies;
    private List<PhoneDTO> phones;
    private AddressDTO address;

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.email = person.getEmail();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.hobbies = HobbyDTO.getFromList(person.getHobbies());
        this.phones = PhoneDTO.getFromList(person.getPhones());
        this.address = new AddressDTO(person.getAddress());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<HobbyDTO> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<HobbyDTO> hobbies) {
        this.hobbies = hobbies;
    }

    public List<PhoneDTO> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneDTO> phones) {
        this.phones = phones;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}
