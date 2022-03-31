package thao.com.bewebblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thao.com.bewebblog.model.Friends;
import thao.com.bewebblog.repository.IFriendRepository;
import thao.com.bewebblog.service.impl.IFriendService;

import java.util.Optional;
@Service
public class FiendService implements IFriendService {

    @Autowired
    IFriendRepository iFriendRepository;

    @Override
    public Iterable<Friends> findAllFriends() {
        return iFriendRepository.findAll();
    }

    @Override
    public Optional<Friends> findByIdFriends(int idFriends) {
        return iFriendRepository.findById(idFriends);
    }

    @Override
    public Friends saveFriends(Friends friends) {
        return iFriendRepository.save(friends);
    }

    @Override
    public void removeFriends(int idFriends) {
        iFriendRepository.deleteById(idFriends);
    }
}
