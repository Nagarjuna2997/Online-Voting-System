package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vote")
public class Vote {
		@Id
		
		private String voterid;
		public String getVoterid() {
			return voterid;
		}
		public void setVoterid(String voterid) {
			this.voterid = voterid;
		}
		public String getVote() {
			return vote;
		}
		public void setVote(String vote) {
			this.vote = vote;
		}
		private String vote;

}
