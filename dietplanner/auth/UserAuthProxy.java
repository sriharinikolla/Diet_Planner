package dietplanner.auth;

import dietplanner.dao.UserDAO;
import dietplanner.model.User;
import java.security.MessageDigest;  // hash data using algo like SHA-256
import java.security.NoSuchAlgorithmException; // handles errors if the hashing algorithm isn’t found.
import java.util.Base64;      // hash into a readable string.

// Proxy Pattern implementation for user authentication

public class UserAuthProxy {
  private UserDAO userDAO;

  public UserAuthProxy() {
    this.userDAO = new UserDAO();
  }

  public User login(String email, String password) {

    String passwordHash = hashPassword(password);

    return userDAO.loginUser(email, passwordHash);   //check with existing user
  }

  public boolean register(String email, String password) {
   
    String passwordHash = hashPassword(password);

   
    User user = new User(email, passwordHash);
    return userDAO.registerUser(user);              //create new
  }

  private String hashPassword(String password) {
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      byte[] hash = md.digest(password.getBytes());
      return Base64.getEncoder().encodeToString(hash);
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
      return null;
    }
  }
}