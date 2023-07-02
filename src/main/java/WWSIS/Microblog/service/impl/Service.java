package WWSIS.Microblog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import WWSIS.Microblog.dao.FollowerDao;
import WWSIS.Microblog.dao.UserDao;
import WWSIS.Microblog.dao.PostDao;
import WWSIS.Microblog.model.Follower;
import WWSIS.Microblog.model.User;
import WWSIS.Microblog.model.Post;
import WWSIS.Microblog.service.MicroblogService;

@Service
public class MicroblogServiceImpl implements MicroblogService {

    private final FollowerDao followerDao;
    private final UserDao userDao;
    private final PostDao postDao;

    @Autowired
    public MicroblogServiceImpl(FollowerDao followerDao, UserDao userDao, PostDao postDao) {
        this.followerDao = followerDao;
        this.userDao = userDao;
        this.postDao = postDao;
    }

    @Override
    public List<Post> getAllPosts(User user) {


        return null; // Replace with the actual return value
    }
}