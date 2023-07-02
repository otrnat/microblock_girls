package WWSIS.Microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Table(name="follower")
public class Follower {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	// follower and following attributes should be
	// String arrays but for now we are declaring
	// them as just Strings
	@Column(name="follower", nullable = true)
	private String follower;
	@Column(name="following", nullable = true)
	private String following;
	@Column(name="primary_key", nullable = true)
	private int primaryKey;
	
	// @Column(name="unique", nullable = false);	
	// private [type?] unique
	
	public Follower(int id, String follower, String following, int primaryKey /*, [type?] unique*/) {
		this.id = id;
		this.follower = follower;
		this.following = following;
		this.primaryKey = primaryKey;
		// this.unique = unique;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setFollower(String follower) {
		this.follower = follower;
	}
	
	public String getFollower() {
		return this.follower;
	}
	
	public void setFollowing(String following) {
		this.following = following;
	}
	
	public String getFollowing() {
		return this.following;
	}
	
}
