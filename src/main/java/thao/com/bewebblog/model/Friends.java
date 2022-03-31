package thao.com.bewebblog.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Friends {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idFriend;
    int idUser;
    int idFriends;
    Date dateYou;

    @ManyToOne
    Users users;
    @ManyToOne
    Friends friends;

    public Friends(int idFriend, int idUser, int idFriends, Date dateYou, Users users, Friends friends) {
        this.idFriend = idFriend;
        this.idUser = idUser;
        this.idFriends = idFriends;
        this.dateYou = dateYou;
        this.users = users;
        this.friends = friends;
    }

    public Friends() {
    }

    public int getIdFriend() {
        return idFriend;
    }

    public void setIdFriend(int id) {
        this.idFriend = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdFriends() {
        return idFriends;
    }

    public void setIdFriends(int idFriends) {
        this.idFriends = idFriends;
    }

    public Date getDateYou() {
        return dateYou;
    }

    public void setDateYou(Date dateYou) {
        this.dateYou = dateYou;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Friends getFriends() {
        return friends;
    }

    public void setFriends(Friends friends) {
        this.friends = friends;
    }
}
