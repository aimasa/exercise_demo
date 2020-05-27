package exercise.demo.twitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Twitter {
	int count;
	HashMap<Integer, User> twitterUsers;

	/** Initialize your data structure here. */
	public Twitter() {
		count = 0;
		twitterUsers = new HashMap<Integer, User>();
	}

	/** Compose a new tweet. */
	public void postTweet(int userId, int tweetId) {
		count++;
		regist(userId);
		User user = twitterUsers.get(userId);
		user.twtter.add(new Twtter(count, tweetId));
	}

	/**
	 * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in
	 * the news feed must be posted by users who the user followed or by the user
	 * herself. Tweets must be ordered from most recent to least recent.
	 */
	public List<Integer> getNewsFeed(int userId) {
		regist(userId);
		List<User> follow = twitterUsers.get(userId).follow;
		List<User> tempfollow = new ArrayList<User>(follow);
		List<Integer> newTwitters = new ArrayList<Integer>();
		tempfollow.add(twitterUsers.get(userId));
		int[] corIndex = new int[tempfollow.size()];
		Arrays.fill(corIndex, 0);
		while(newTwitters.size() <= 10){
			Twtter minArray = null;
			int index = 0;
			int min = -1;
			for(int i = 0; i < tempfollow.size(); i++) {
				List<Twtter> twtters = tempfollow.get(i).twtter;
				if(twtters.size() - corIndex[i] - 1 < 0) {
					continue;
				}
				Twtter twtter = twtters.get(twtters.size() - corIndex[i] - 1);
				if(min > twtter.count) {
					min = twtter.count;
					minArray = twtter;
					index = i;
				}
			}
			newTwitters.add(minArray.twtter);
			corIndex[index] += 1;
			if(minArray == null) {
				break;
			}
		}
		return newTwitters;

	}

	public void regist(int userId) {
		if (!twitterUsers.containsKey(userId)) {
			User user = new User(userId);
			twitterUsers.put(userId, user);
		}
	}

	/**
	 * Follower follows a followee. If the operation is invalid, it should be a
	 * no-op.
	 */
	public void follow(int followerId, int followeeId) {
		regist(followeeId);
		regist(followerId);
		User user = twitterUsers.get(followerId);
		if (user.follow.contains(twitterUsers.get(followeeId))) {
			return;
		}
		user.follow.add(twitterUsers.get(followeeId));

	}

	/**
	 * Follower unfollows a followee. If the operation is invalid, it should be a
	 * no-op.
	 */
	public void unfollow(int followerId, int followeeId) {
		if (!twitterUsers.containsKey(followerId)) {
			return;
		}
		User user = twitterUsers.get(followerId);
		if (user.follow.contains(twitterUsers.get(followeeId))) {
			user.follow.remove(followeeId);
		}
	}
}

class Twtter {
	int count;
	int twtter;

	public Twtter() {
		this.count = -1;
		this.twtter = -1;
	}

	public Twtter(int count, int twtter) {
		super();
		this.count = count;
		this.twtter = twtter;
	}
}

class User {
	int id;
	List<Twtter> twtter;
	List<User> follow;

	public User(int id) {
		this.id = id;
		twtter = new ArrayList<Twtter>();
		follow = new ArrayList<User>();
	}
}
