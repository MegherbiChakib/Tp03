package exercise1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class TestExo1 {
    @Mock
    private UserRepository userRepositoryMock;
    @Test
    public void testFindUserById(){
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont",1324L);
        long id=1234L;
        //le comportement de mock
        when(userRepositoryMock.findUserById(id)).thenReturn(utilisateur);
        //creation du user service
        UserService userService = new UserService(userRepositoryMock);
        //appele a la methode
        Utilisateur u2=userService.getUserById(id);
        //esque le teste est juste
        Assert.assertEquals(utilisateur,u2);
    }

}
