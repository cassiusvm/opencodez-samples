/**
 * 
 */
package com.opencodez.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * @author pavan.solapure
 *
 */
@Entity
@Getter
@Setter
public class UserModel {

	@Id
	private Long id;
	private String name;
	private String salary;
}
