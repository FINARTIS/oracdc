/**
 * Copyright (c) 2018-present, A2 Rešitve d.o.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */

package solutions.a2.cdc.oracle.jmx;

/**
 * 
 * @author averemee
 *
 */
public interface OraCdcSinkTableInfoMBean {
	public String getStartTime();
	public long getElapsedTimeMillis();
	public String getElapsedTime();
	public long getProcessingTimeMillis();
	public String getProcessingTime();
	public long getProcessedRecordsCount();
	public long getUpsertCount();
	public long getUpsertProcessingMillis();
	public String getUpsertProcessingTime();
	public double getUpsertsPerSecond();
	public long getDeleteCount();
	public long getDeleteProcessingMillis();
	public String getDeleteProcessingTime();
	public double getDeletesPerSecond();

}
