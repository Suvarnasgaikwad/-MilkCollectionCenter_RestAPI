package com.Java.MilkCollection.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FatSnfRate 
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private double fatContent;
	    private double snfContent;
	    private double rate;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public double getFatContent() {
			return fatContent;
		}
		public void setFatContent(double fatContent) {
			this.fatContent = fatContent;
		}
		public double getSnfContent() {
			return snfContent;
		}
		public void setSnfContent(double snfContent) {
			this.snfContent = snfContent;
		}
		public double getRate() {
			return rate;
		}
		public void setRate(double rate) {
			this.rate = rate;
		}
		public FatSnfRate() {
			super();
			// TODO Auto-generated constructor stub
		}
		public FatSnfRate(Long id, double fatContent, double snfContent, double rate) {
			super();
			this.id = id;
			this.fatContent = fatContent;
			this.snfContent = snfContent;
			this.rate = rate;
		}
		@Override
		public String toString() {
			return "FatSnfRate [id=" + id + ", fatContent=" + fatContent + ", snfContent=" + snfContent + ", rate="
					+ rate + "]";
		}
	    

}
