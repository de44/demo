package com.example.domain;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarActivityDTO {

	private String carID;
	private String time;
	private List<TracePoint> trace;

	public void addTracePoint(TracePoint tracePoint) {
		if (trace == null) {
			trace = Lists.newArrayList();
		}
		trace.add(tracePoint);
	}
}
