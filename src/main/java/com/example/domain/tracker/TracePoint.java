package com.example.domain.tracker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by davidesposito on 6/2/17.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TracePoint {

    private String name;
    private long time;
}
