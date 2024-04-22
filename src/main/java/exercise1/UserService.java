package exercise1;

public class UserService implements UserRepository{
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    //une classe qui vas recupere les info dun utilisateure de userreposetory


    Utilisateur getUserById(long id){
       return userRepository.findUserById(id);
    }

    @Override
    public Utilisateur findUserById(long id) {
        return userRepository.findUserById(id);
    }
}
