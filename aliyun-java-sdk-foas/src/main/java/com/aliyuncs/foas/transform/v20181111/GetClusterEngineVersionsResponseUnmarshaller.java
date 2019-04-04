/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.foas.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.GetClusterEngineVersionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterEngineVersionsResponseUnmarshaller {

	public static GetClusterEngineVersionsResponse unmarshall(GetClusterEngineVersionsResponse getClusterEngineVersionsResponse, UnmarshallerContext context) {
		
		getClusterEngineVersionsResponse.setRequestId(context.stringValue("GetClusterEngineVersionsResponse.RequestId"));

		List<String> engineVersions = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetClusterEngineVersionsResponse.EngineVersions.Length"); i++) {
			engineVersions.add(context.stringValue("GetClusterEngineVersionsResponse.EngineVersions["+ i +"]"));
		}
		getClusterEngineVersionsResponse.setEngineVersions(engineVersions);
	 
	 	return getClusterEngineVersionsResponse;
	}
}