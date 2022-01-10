package com.capitolio.hiremeusers.controllers;

import com.capitolio.hiremeusers.dtos.UserDto;
import com.capitolio.hiremeusers.services.DeletingUsersService;
import com.capitolio.hiremeusers.services.RetrievingUsersService;
import com.capitolio.hiremeusers.services.SavingUsersService;
import com.capitolio.hiremeusers.utils.UsersMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final SavingUsersService savingUsersService;
    private final RetrievingUsersService retrievingUsersService;
    private final DeletingUsersService deletingUsersService;

    @PostMapping
    public ResponseEntity<UserDto> saveNewUser(@RequestBody UserDto newUser){
        var userJustSaved = this.savingUsersService.saveNew(UsersMapper.toEntity(newUser));
        return ResponseEntity.status(201).body(UsersMapper.toDto(userJustSaved));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> retrieveUserById(@PathVariable Long id){
        var user = this.retrievingUsersService.retrieveUserBy(id).map(UsersMapper::toDto).orElse(new UserDto());
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<Page<UserDto>> retrieveUsersPaginated(@RequestParam Integer pageNumber, @RequestParam Integer pageSize){
        var users = this.retrievingUsersService.retrieveUsersBy(pageNumber, pageSize).map(UsersMapper::toDto);
        return ResponseEntity.ok(users);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Long id, @RequestBody UserDto userToBeUpdated){
        userToBeUpdated.setId(id);
        this.savingUsersService.save(UsersMapper.toEntity(userToBeUpdated));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        this.deletingUsersService.deleteUserBy(id);
        return ResponseEntity.noContent().build();
    }


}
