package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sugar {
	private Integer volume;
	private Integer sugar;
	private Integer totalSugar;
}
