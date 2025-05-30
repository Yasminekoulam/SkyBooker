package skybooker.server.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import skybooker.server.UserPrincipal;
import skybooker.server.entity.Client;
import skybooker.server.repository.ClientRepository;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private ClientRepository clientRepository;

    /**
     *
     * @param email the email of the client
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Client> optionalClient = clientRepository.getByEmail(email);
        if (optionalClient.isPresent()) {
            return new UserPrincipal(optionalClient.get());
        } else {
            throw new UsernameNotFoundException(email);
        }
    }
}
