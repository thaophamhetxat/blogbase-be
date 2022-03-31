package thao.com.bewebblog.service.impl;



import thao.com.bewebblog.model.Friends;

import java.util.Optional;

public interface IFriendService {
    Iterable<Friends> findAllFriends();

    Optional<Friends> findByIdFriends(int idFriends);

    Friends saveFriends(Friends friends);

    void removeFriends(int idFriends);
}
