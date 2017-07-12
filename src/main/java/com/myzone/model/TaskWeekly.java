package com.myzone.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="taskWeekly")
public class TaskWeekly implements Serializable{
    

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1252148870446365282L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//不创建hibernate_sequence表 // 自动生成,当你插入时会自动更新idOK??? 恩
	@Column(length = 20)
	private Long id;
	
	@Column(length = 255)
    private String event;
	
	@Column(length = 20,nullable=false)
    private String cron;

    @Column(length = 255)
    private String template;

	@Column(length = 255)
	private String describe;

	@Column
    private Date createDate;
	
	@Column
    private Date updateDate;

}