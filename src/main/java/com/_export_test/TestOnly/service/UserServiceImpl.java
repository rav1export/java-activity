package com._export_test.TestOnly.service;

import com._export_test.TestOnly.modal.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
 private final Map<Long, User> userMap = new HashMap<>();
 private Long idCounter = 1L;

 @Override
 public List<User> getAllUsers() {
     return new ArrayList<>(userMap.values());
 }

 @Override
 public User getUserById(Long id) {
     return userMap.get(id);
 }

 @Override
 public User createUser(User user) {
     Long userId = idCounter++;
     user.setId(userId);
     userMap.put(userId, user);
     return user;
 }

 @Override
 public User updateUser(Long id, User updatedUser) {
     if (userMap.containsKey(id)) {
         updatedUser.setId(id);
         userMap.put(id, updatedUser);
         return updatedUser;
     }
     return null;
 }

 @Override
 public void deleteUser(Long id) {
     userMap.remove(id);
 }
}