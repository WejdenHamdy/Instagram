package com.example.instagram.implementation;

import ch.qos.logback.classic.Logger;
import com.example.instagram.dto.UserDTO;
import com.example.instagram.model.entities.User;
import com.example.instagram.repository.UserRepository;
import com.example.instagram.service.UserService;
import com.jayway.jsonpath.JsonPath;
import jakarta.persistence.EntityNotFoundException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.instagram.dto.UserDTO;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;

@Service

public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;
    private ModelMapper mapper;
    private final Logger log = (Logger) LoggerFactory.getLogger(this.getClass());
    @Override
    public List<UserDTO> getUsers() {
        return userRepository.findAll().stream()
                                        .map(u -> mapper.map(u,UserDTO.class))
                                        .collect(Collectors.toList());

    }



    @Override
    public UserDTO addUser(UserDTO userDTO) {
        User user = mapper.map(userDTO, User.class);
        user = userRepository.save(user);
        userDTO = mapper.map(user, UserDTO.class);
        return userDTO;
    }

    @Override
    public List<UserDTO> deleteUser(Integer id) {
        Optional<User> opt = Optional.ofNullable(userRepository.findById(id)
                                    .orElseThrow(() -> new EntityNotFoundException("User not found")));
        userRepository.deleteById(opt.get().getIdUser());
        log.info(opt.get().getFirstName()+" deleted");
        return this.getUsers();
    }

    @Override
    public UserDTO findUser(Integer id) {
        Optional<User> user = Optional.ofNullable(userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Client not found")));
        UserDTO usertDTO = mapper.map(user.get(), UserDTO.class);
        return usertDTO;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        Optional<User> opt = userRepository.findById(userDTO.getIdUser());
        User user = new User();
        if(opt.isPresent()){
            log.info("reached here");
            user = opt.get();
            user.setFirstName(userDTO.getFirstname());
            user.setLastName(userDTO.getLastname());
            user.setEmail(userDTO.getEmail());
            user.setPhone(userDTO.getPhone());
            user.setBirthDate(userDTO.getBirthDate());
            user =userRepository.save(user);
        }
        return mapper.map(user, UserDTO.class);

    }
}
