/*
 *
 *  Copyright 2012-2014 Eurocommercial Properties NV
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.estatio.module.registration.fixtures.personas;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.apache.isis.applib.fixturescripts.FixtureScript;

import org.estatio.module.asset.dom.PropertyRepository;
import org.estatio.module.asset.dom.Unit;
import org.estatio.module.asset.fixtures.property.personas.PropertyAndUnitsAndOwnerAndManagerForOxfGb;
import org.estatio.module.registration.dom.LandRegister;
import org.estatio.module.registration.dom.LandRegisters;

public class LandRegisterForOxfordUnit001 extends FixtureScript {

    @Override
    protected void execute(ExecutionContext executionContext) {

        // prereqs
        executionContext.executeChild(this, new PropertyAndUnitsAndOwnerAndManagerForOxfGb());

        Unit unit = propertyRepository.findPropertyByReference(PropertyAndUnitsAndOwnerAndManagerForOxfGb.REF).getUnits().first();

        LandRegister landRegister = landRegisters.newRegistration(
                unit,
                null,
                "comuneAmministrativo",
                "comuneCatastale",
                "codiceComuneCatastale",
                new BigDecimal("123.45"),
                "foglio",
                "particella",
                "subalterno",
                "categoria",
                "classe",
                "consistenza",
                null,
                "description");

        executionContext.addResult(this, landRegister.title(), landRegister);
    }

    @Inject
    PropertyRepository propertyRepository;

    @Inject
    LandRegisters landRegisters;

}
