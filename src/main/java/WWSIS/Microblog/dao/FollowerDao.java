package WWSIS.Microblog.dao;

public interface FollowerDao {
    void addPair(int followerID, int followeeID); // 5a
    void removePair(int followerID, int followeeID); // 5b
    void checkPair(int followerID, int followeeID);
}
