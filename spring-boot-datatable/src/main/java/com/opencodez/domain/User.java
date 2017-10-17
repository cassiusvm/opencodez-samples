/**
 * 
 */
package com.opencodez.domain;

import javax.persistence.Column;
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
public class User {

	@Id
	private Long id;
	private String name;
	private String salary;
	
	@Column(name="totalrecords", updatable=false, insertable=false)
    private Integer totalRecords;
}
