package com.example.config;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Slf4jReporter;
import com.codahale.metrics.Slf4jReporter.LoggingLevel;
import com.codahale.metrics.health.HealthCheckRegistry;
import com.ryantenney.metrics.spring.config.annotation.EnableMetrics;
import com.ryantenney.metrics.spring.config.annotation.MetricsConfigurerAdapter;

@Slf4j
@Configuration
@EnableMetrics(proxyTargetClass = true)
public class MetricsConfiguration extends MetricsConfigurerAdapter{

	private final MetricRegistry metricRegistry = new MetricRegistry();
	private final HealthCheckRegistry healthCheckRegistry = new HealthCheckRegistry();

	@Override
	public MetricRegistry getMetricRegistry() {
	        return metricRegistry;
	    }

	@Override
	public HealthCheckRegistry getHealthCheckRegistry() {
	        return healthCheckRegistry;
	    }

//	@PostConstruct
	public void init() {
		log.debug("Initializing Metrics JMX reporting");
		JmxReporter jmxReporter = JmxReporter.forRegistry(metricRegistry).build();
		jmxReporter.start();

		final Slf4jReporter reporter = Slf4jReporter.forRegistry(metricRegistry)
				.outputTo(LoggerFactory.getLogger("metrics"))
				.withLoggingLevel(LoggingLevel.DEBUG)
				.convertRatesTo(TimeUnit.SECONDS)
				.convertDurationsTo(TimeUnit.MILLISECONDS)
				.build();
		reporter.start(60, TimeUnit.SECONDS);
	}
}
