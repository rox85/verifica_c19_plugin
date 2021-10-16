/*-
 * ---license-start
 * eu-digital-green-certificates / dgc-certlogic-android
 * ---
 * Copyright (C) 2021 T-Systems International GmbH and all other contributors
 * ---
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ---license-end
 *
 * Created by osarapulov on 25.06.21 15:47
 */

package dgca.verifier.app.engine.data.source.local.valuesets

import dgca.verifier.app.engine.data.ValueSet
import dgca.verifier.app.engine.data.ValueSetIdentifier
import dgca.verifier.app.engine.data.source.valuesets.ValueSetsDataSource

interface ValueSetsLocalDataSource : ValueSetsDataSource {

    suspend fun updateValueSets(valueSets: List<ValueSet>)

    suspend fun addValueSets(
        valueSetIdentifiers: List<ValueSetIdentifier>,
        valueSets: List<ValueSet>
    )

    suspend fun removeValueSetsBy(setIds: List<String>)
}