package WWSIS.Microblog.service;
import java.util.List;
import WWSIS.Microblog.model.Follower;
import WWSIS.Microblog.model.User;
import WWSIS.Microblog.model.Post;

public interface Service {
    /**
     * Retrieves all messages published by a specific user,
     * and all messages from other users I follow.
     *
     * @param user The user for whom to retrieve the messages.
     * @return A list of posts from the specified user and the followed users.
     */
    List<Post> getAllPosts(User user);

}
