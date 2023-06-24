package WWSIS.Microblog.dao;

public interface PostDao {
    String getUserTimeline(int uid); // 3a
    String getMainTimeline(int uid); // 3b
    String getAllMessages(); // 3c
    void addMessage(int uid); // 3d
}
