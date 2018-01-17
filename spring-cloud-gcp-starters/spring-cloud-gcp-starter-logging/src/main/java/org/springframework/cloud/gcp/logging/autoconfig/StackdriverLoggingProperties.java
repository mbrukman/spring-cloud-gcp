/*
 *  Copyright 2018 original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.cloud.gcp.logging.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Chengyuan Zhao
 */
@ConfigurationProperties("spring.cloud.gcp.logging.traceId")
public class StackdriverLoggingProperties {
	private TraceIdExtractorType extractor;

	public TraceIdExtractorType getExtractor() {
		return this.extractor;
	}

	public void setExtractor(TraceIdExtractorType extractor) {
		this.extractor = extractor;
	}
}
