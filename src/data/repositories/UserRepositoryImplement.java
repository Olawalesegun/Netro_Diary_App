package data.repositories;

public class UserRepositoryImplement implements UserRepository {
    private List<User> users = new ArrayList();
    @Override
    public User save(User user){
        for(User user1: users){
            if(user1.getUserName.equals(user.getUserName)){
                users.add(user);
                return user;
            }
            else{
                users.add(user);
                return user;
            }
        }
        return null;
    }
    @Override
    public User findBy(String userName){
        for(User user: users){
            if(user.getuserName.equals(userName)){
                return user;
            }
        }
        return null;
    }
    @Override
    public void deleteBy(String userName){
        User theUserToBeRemoved = null;
        for(User user: users){
            if(user.getUserName.equals(userName)){
                theUserToBeRemoved = user;
                users.remove(user);
            }
        }
    }
    @Override
    public void deleteBy(User user){
        users.remove(user);
    }

}
